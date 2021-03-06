/* 파일 다루기 - file 클래스 사용법 
 * */
package step16;

import java.io.File;

public class Test01_5 {

  public static void main(String[] args) throws Exception {
    File f = new File("../");
    
    displayDirectory(f, 0);
    }
  
  public static void displayDirectory(File dir, int level){
    File[] files = dir.listFiles();
    
    for(File file : files){
      for(int i = 0; i < level; i++){System.out.print("  ");}
      System.out.printf("%s %s\n", 
          (file.isDirectory() ? ">" : " "),
          file.getName());
      if(file.isDirectory()){
        displayDirectory(file, level+1);
      }
    }
  }
}

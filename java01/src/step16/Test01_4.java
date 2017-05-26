/* 파일 다루기 - file 클래스 사용법 
 * */
package step16;

import java.io.File;
import java.util.Calendar;

public class Test01_4 {

  public static void main(String[] args) throws Exception {
    File f = new File("../");
    
    // 지정된 폴더에 들어 있는 파일 및 하위 폴더에 대한 정보를 담은 File객체 목록을 리턴한다.
    File[] files = f.listFiles();
    for(File file : files){
      System.out.printf("%s %d %s\n", 
          (file.isDirectory() ? "d" : "-"),
          file.length(), 
          file.getName());
    }
    
    }
}

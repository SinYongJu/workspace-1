import java.io.File;

public class BIT_ls {
  
  public static void displayDirectory(File dir, int level){
    File[] files = dir.listFiles();
    
    for(File file : files){
      for(int i = 0; i < level; i++){System.out.print("  ");}
      System.out.printf("%s %s %d\n", 
          (file.isDirectory() ? "D" : "-"),
          file.getName(),
          file.length());
      if(file.isDirectory()){
        displayDirectory(file, level+1);
      }
    }
  }
}

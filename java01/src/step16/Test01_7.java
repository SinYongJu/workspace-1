 /* 파일 다루기 - file 클래스 사용법 
 * =>특정 확장자를 가진 파일만 출력하기
 * =>목록을 만들 때 제약조건을 걸어보자!
 * 이렇게 하면 프로그래밍이 쉬워진다
 * */
package step16;

import java.io.File;
import java.io.FileFilter;
import java.util.Calendar;

public class Test01_7 {

  public static void main(String[] args) throws Exception {
    File f = new File("../");
    
    displayDirectory(f, 0);
    }
  
  public static void displayDirectory (File dir, int level) throws Exception{
    File[] files = dir.listFiles(new MyFileFilter());
    
    // 목록에서 특정 확장자를 가진 파일을 걸러내어 처리한다.
    // 그러나, 목록의 개수 만큼 반복문을 돌려야 한다.
    for(File file : files){
      if(file.isDirectory()){
        displayDirectory(file, level +1);
      } else {
        System.out.printf("%s\n", file.getPath());
      }
    }
  }
  
  // FileFilter 규칙에 따라 클래스를 만든다.
  // 규칙을 따른다는 뜻은, 규칙에 정의된 모든 메서드 만든다는 의미이다.
  // 이 클래스의 aceept() 메서드는 file.listFiles() 메서드가 호출할 것이다.
  // listFiles() 호출
  // 1) OS를 통행 해당 폴더의 파일 및 디렉토리 목록을 가져온다.
  // 2) 그 중 한개의 디렉토리 또는 파일을 꺼내서 리턴되는 목록에 추가할 지 물어본다.
  // 3) accept()를 호출하여 물어본다.
  
  static class MyFileFilter implements FileFilter{
    public boolean accept(File file) {
      if(file.isDirectory() ||(file.isFile() && file.getName().endsWith(".class"))){        
        return true;
      }
      return false;
    }
    
  }
}

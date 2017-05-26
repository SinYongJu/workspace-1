/* 파일 다루기 - file 클래스 사용법 
 * */
package step16;

import java.io.File;
import java.util.Calendar;

public class Test01_2 {

  public static void main(String[] args) throws Exception {
    // 파일 경로가 '/'로 시작하면 절대 경로를 의미하고,
    //'/'fh 시작하지 않으면 상대 경로를 의미한다.
    //=> 상대경로일 때 기준은? 이클립스에서 실행하면 프로젝트 폴더가 기준이 된다.
    File f = new File("hello.txt");
    
    //1) 파일 생성
    f.createNewFile();
    
    //2) 파일 삭제
    f.delete();
    
    }

}

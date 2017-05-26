/* 데이터 프로세싱 스트림 클래스 - BufferedInputStream 도입 후
 * => 출력할 데이터를 먼저 버퍼에 출력한다.
 * 퍼버가 꽉차면 비로소 파일로 출력한다.
 * 
 */
package step16;

import java.io.FileOutputStream;
import java.io.FileWriter;

public class Test06_1_out {
  
  
  public static void main(String[] args) throws Exception{
    FileOutputStream out = new FileOutputStream("temp/test06_1_byte.data");
    
    //binary stream 클래스는 무조건 끝 1바이트 만 출력한다.
    out.write('A');
    out.write('B');
    out.write('C');
    out.write('a');
    out.write('b');
    out.write('c');
    out.write('가');
    out.write('각');
    out.write('간');
    out.close();
    
    FileWriter out2 = new FileWriter("temp/test_06_1_char.data");
    
    out2.write('A');
    out2.write('B');
    out2.write('C');
    out2.write('a');
    out2.write('b');
    out2.write('c');
    out2.write('가');
    out2.write('각');
    out2.write('간');
    out2.close();
  }
}

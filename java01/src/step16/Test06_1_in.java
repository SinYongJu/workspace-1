/* character stream 클래스 : FileReader vs FileInputStream
 *  */
package step16;

import java.io.FileInputStream;
import java.io.FileReader;

public class Test06_1_in {

  public static void main(String[] args) throws Exception{
    FileInputStream in = new FileInputStream("Test06_1.txt");
    
    int b= 0;
    
    while((b=in.read()) != -1){
      System.out.printf("%x ", b);
    }
    System.out.println();
    in.close();
    System.out.println("---------------------------------------------------------");
    FileReader in2 = new FileReader("Test06_1.txt");
    
    /*캐릭터 스트림 클래스는 문자 다누이로 데이터를 읽고 쓴다.
     * 1) 읽을 때
     *  => 문자의 인코딩 방식에 따라 1 ~ 4 바이트를 읽어서
     *    자바에서 사용하는 2byte 유니코드 값으로 바꿔  리턴한다.
     *  => 왜 바꾸는가? 자바 내부에서 문자를 다룰 때 유니코드 값을 사용하기 때문이다.
     * 2) 쓸때
     *  => 문자의 인코딩 방식에 따라 2byte 유니코드 값을 
     *     1 ~ 4 바이트 값으로 출력한다.
     *     보통 os의 기본 문자집으로 변환하여 출력한다.
     *  => 왜 변환하는가?
     *     문자 코드를 다룰 때 자바는 2바이트 유니코드를 사용하고, 
     *     운영체제는 ms949(ms windwos)나 UTF-8(Unix)을 사용하기 때ㅑ문이다.
     *     즉 JVM 환경과 OS 환경에서 문자 코드를 다루는 방식이 다르기 떄문이다.
     *     그래서 항시 변환이 필요하다.*/
      
    while((b = in2.read()) != -1){
      System.out.printf("%x ", b);
    }
    System.out.println();
    in2.close();
  }
}

/* 데이터 프로세싱 스트림 클래스 - 직렬화와 transient 변경자
 * => tansient..............................
 */
package step16;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Test05_3_in {

  public static void main(String[] args) throws Exception{
    FileInputStream in0 = new FileInputStream("temp/test05_3.data");
    ObjectInputStream in = new ObjectInputStream(in0);
    
    // 직렬화 데이터를 바로 읽어 객체로 복원한다.
    // => readObject()의 리턴 값이 어떤 클래스의 인스턴스 인지 알려줘야 한다.
    //    그래서 타입 캐스팅(형변환)을 하는 것이다.
    Student3 s =  (Student3)in.readObject();
    
    in.close();
    in0.close();
    
    System.out.println(s);
    // 직렬화된 데이터를 읽어 들인 후에 계산을 수행한다.
    s.compute();
    System.out.println(s);
  }
}

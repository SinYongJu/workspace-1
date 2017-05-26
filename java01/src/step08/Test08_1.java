/*  컬렉션 클래스 II: java.lang.HashSet
 *  => 저장하려는 객체데 대해 hashCode()를 호출하여 
 *    그 리턴 값을 가지고 저장할 위치를 계산한다.
 */
package step08;

import java.io.FileReader;
import java.util.Properties;

public class Test08_1 {
 
  public static void main(String[] args) throws Exception{
    Properties props = new Properties();
    //test.properties  파일을 읽어서 그 내용을 보관한다.
    props.load(new FileReader("test.properties"));
    
    // 스트링을 사용하여 값을 꺼내기
    
    System.out.println(props.getProperty("key1"));
    System.out.println(props.getProperty("key2"));
    System.out.println(props.getProperty("key3"));
    System.out.println(props.getProperty("key4"));
    System.out.println(props.getProperty("key5"));
    System.out.println("----------------------");
    
    System.out.println(props.get("key1"));
    System.out.println(props.get("key2"));
    System.out.println(props.get("key3"));
    System.out.println(props.get("key4"));
    System.out.println(props.get("key5"));
    
   }
}

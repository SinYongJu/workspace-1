/*  컬렉션 클래스 II: java.lang.HashSet
 *  => 저장하려는 객체데 대해 hashCode()를 호출하여 
 *    그 리턴 값을 가지고 저장할 위치를 계산한다.
 */
package step08;

import java.util.Properties;
import java.util.Set;

public class Test08_3 {
 
  public static void main(String[] args) throws Exception{
    //  1) 프로그램 아규먼트 출력

    for(String value : args){
      System.out.println(value);
    }
    
    System.out.println("*-------------------");
    
    Properties props = System.getProperties();
    System.out.printf("name=%s\n",props.get("name"));
    System.out.printf("age=%s\n",props.get("age"));
    System.out.printf("tel.home=%s\n",props.get("tel.home"));
    System.out.printf("tel.office=%s\n",props.get("tel.office"));
    
   }
}

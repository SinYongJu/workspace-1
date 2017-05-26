/*제네릭(Generic) 문법: 사용 후
 * => 값을 꺼낼 때 마다 본래 타입으로 형변환 필요가 없다.
 * => 특정 타입의 값만 다루도록 제한 할 수 있다.*/
package step14;

import java.util.Date;

public class Test02 {
  public static void main(String[] args){
    // 제네릭을 다룰때 타입을 지정 안하면 기본 Object
    Bucket2 b = new Bucket2();
    
    b.setValue(new String("Hello"));
    String str = (String)b.getValue();
    
    b.setValue(new Date());
    Date date = (Date)b.getValue();
    
    b.setValue(new Integer(10));
    Integer i = (Integer)b.getValue();
    
    
    String str2 = (String)b.getValue();
    System.out.println(str.length());
  }
}

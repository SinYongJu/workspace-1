/*제네릭(Generic) 문법: 사용 후
 * => 값을 꺼낼 때 마다 본래 타입으로 형변환 필요가 없다.
 * => 특정 타입의 값만 다루도록 제한 할 수 있다.*/
package step14;

import java.util.Date;

public class Test03 {
  public static void main(String[] args){
    // 제네릭을 다룰때 타입을 지정 안하면 기본 Object
    Bucket2<String> b = new Bucket2<String>();
    // new 명령 다음에 타입지정 생략가능(JAVA7 이상)
//    Bucket2<String> b = new Bucket2<>();
    
    b.setValue(new String("Hello"));
    String str = b.getValue();
    System.out.println(str);
    
    //클래스를 만들 때, 다룰 값의 타입을 String으로 제한했기 때문에, 
    // 다음과 같이 다른 타입의 값은 저장 할 수 없다.
//    b.setValue(new Date());
//    b.setValue(new Integer(10));  // 컴파일 오류
    
    
   
  }
}

/*
 *  원시 데이터 타입
 */
package step08;

public class Test04_3 {
  
  public static void main(String[] args) {
    int a = 10;
    Integer obj = new Integer(20);
    
    //개발자가 명시적으로 랩퍼 객체에서 값을 꺼내기
    int b  = obj.intValue();
    int c = obj; //auto-unboxing: 랩퍼 객체에서 값을 자동으로 추출하여 변수에 저장한다.
    
    // 개발자가 래퍼 객체를 만들어 값을 담기
    Integer obj2 = new Integer(a);
    Integer obj3 = a; // auto-boxing 원시 타입의 값을 자동으로 랩퍼 객체를 만들어 담는다.
    
    
  }
}

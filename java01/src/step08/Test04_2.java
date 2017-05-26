/*
 *  원시 데이터 타입
 *  byte, short, long, int, float, double, boolean, char => java.lang.xxx;
 *  
 *  왜 이런 클래스를 만들었는가?
 *  프로그래밍을 하다보면 원시 데이터 타입의 값을 객체처럼 다뤄야 할 경우가 있다.
 *  또 산술 연산자나 관계 연산자, 비트 논리 연산자, 논리 연산자, 비트 이동 연산자,
 *  조건 연산자 외에 추가적인 기능을 클래스에 추가해 놓는다.
 */
package step08;

public class Test04_2 {
  
  public static void main(String[] args) {
    Integer i1 = new Integer(10);
    Integer i2 = new Integer(20);
    System.out.println(i1 == i2);
    System.out.println(i1.equals(i2));
    
    /* String 클래스와 랩퍼 클래스는 equals() 메서드를 재정의 하였다.
     * => 어떻게?
     * 주소가 아닌 값이 같은지 비교하도록 재정의 하였다.
     * 
     * */
    StringBuffer s1 =new StringBuffer("Hello");
    StringBuffer s2 =new StringBuffer("Hello");
  
    System.out.println(s1 == s2);
    System.out.println(s1.equals(s2));
    /* StringBuffer  클래스는 equals()를 재정의 하지 않았다.
     * 그래서 object에 있는 equals()를 그대로 사용한다.
     * object의 equals()는 주소를 비교 한다. 즉 연산자 ==와 기능이 같다.
     * 
     * */
  }
}

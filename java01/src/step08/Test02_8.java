/*  유틸리티 클래스 : 
 *  StringBuffer 는 String 으로 바꿔서 비교!
 * */
package step08;

public class Test02_8 {

  public static void main(String[] args) {
    //StringBuffer 인스턴스는 상수 문자열로 인스턴스를 만들 수 없다.
    //반드시 new 명령을 사용해야 한다.
    
    StringBuffer s1 = new StringBuffer("Hello"); 
    StringBuffer s2 = new StringBuffer("Hello"); 
   
    System.out.println(s1 == s2);    
    System.out.println(s1.equals(s2)); // false!! 중요
    // StringBuffer의 들어있는 문자열을 비교하고 싶다면,
    // 먼저 toString()을 이용하여 StringBuffer 인스턴스에서 String 인스턴스를 추출한다.
    // 그리고 String의 equals()를 사용해서 비교
    System.out.println(s1.toString().equals(s2.toString()));
  }
}


// char 불가능
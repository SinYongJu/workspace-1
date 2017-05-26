/* 1970년 1월 1일 00시 00분 00초 부터
 * 현재까지 경과된 시간을 밀리초(1/1000)로 저장하는 객체
 */
package step08;

public class Test05_2 {
  
  public static void main(String[] args) {
    // 현재 날짜 및 시간 알아내기
    java.util.Date today = new java.util.Date();
    System.out.println(today.getYear() +1900);
    System.out.println(today.getMonth() +1);
    System.out.println(today.getDate());
    System.out.println(today.getDay()); // 일 월 화 수 목 금 토 
    System.out.println(today.getHours()); // 일을 기준으로 한다. 00~23
    System.out.println(today.getMinutes());
    System.out.println(today.getSeconds());
    System.out.println(today.getTime()); //1970년 1월 1일 0시 0분 0초를 기준으로 경과된 밀리초
    
    /* Deprecated method
     * => 향후 제거될 메서드이니 사용하지 말라고 권고하는 메서드이다.
     * => 왜 제거하려는 건가?
     *  좀 더 유지보수 하기 좋게 다른 클래스로 기능을 이전하였기 때문이다.
     * */
  }
}

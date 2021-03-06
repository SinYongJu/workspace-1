/* 유틸리티 클래스 : java.util.Calendar
*/
package step08;

import java.util.Calendar;

public class Test05_7 {

  public static void main(String[] args) {
    //calendar 객체는 new 명령을 사용하여 직접 만들 수 없다.
    //getInstance() 메서드를 호출하여 그 리턴 값을 사용하라!
    Calendar cal = Calendar.getInstance();
    
    //날짜 정보 추출
//    cal.get(꺼낼 값을 숫자로 지정한다.)
    //년도(1) 월(2) 일(5) 요일(7) 시(10) 분(12) 초(13)
    System.out.println(cal.get(1));
    System.out.println(cal.get(2)+1);
    System.out.println(cal.get(5));
    System.out.println(cal.get(7)); // 일(1) ~ 토(7)
    System.out.println(cal.get(11));
    System.out.println(cal.get(12));
    System.out.println(cal.get(13));
  }
}

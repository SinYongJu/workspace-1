/* java.util.Date 클래스와 import 명령문
 * => import를 사용하여 클래스 정보를 명시 할 떄,
 * 와일드 카드(*)를 사용할 수 있다.
 * => 와일드 카드(*)를 사용한 import 명령문이 여러 개 있을 경우,
 * 개발자는 클래스가 어떤 패키지 있는 클래스인지 직관적으로 알 수 없다.
 * 그래서 코드의 가독성을 떨어뜨리는 문제가 있다.
 * 추천!
 * 가능한 와일드 카드를 사용하지 말고 정확하게 패키지명과 클래스명을 기술하라! 
 */
package step08;

import java.util.Date;
import java.net.*;
import java.awt.*;

public class Test05_4 {
  
  public static void main(String[] args) {
    // 현재 날짜 및 시간 알아내기
    Date today = new Date();
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

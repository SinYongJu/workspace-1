/* 유틸리티 클래스 : 같은 이름 다른 패키지
 * => import 명령문에서 와일드카드(*)를 사용할 떄 주의할 점!
 * 여러 패키지에 같은 이름을 갖는 클래스가 있을 때,
 * 컴파일러는 사용할 클래스를 결정할 수 없어서 컴파일 오류를 띄운다.
 * 이런경우, 개발자가 정확하게 패키지명을 지정해야 한다.
 */
package step08;

import java.sql.*;
import java.util.*;

public class Test05_6 {
  
  public static void main(String[] args) {
     //Date today;
    //해결책?  별 수 없다. 정확하게 패 키지 명을 지정하라!
    java.sql.Date today;
    java.util.Date today2;

  }
}

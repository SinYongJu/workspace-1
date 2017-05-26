/* enum 문법 : 상수를 전문적으로 정의하는 문법
 *  => 값을 지정하지 않고 상수의 이름만 지정한다.
 *  => 상수 타입의 변수를 선언할 수 있다.
 * */
package step15;

public enum SchoolLevel {
  /*다음 각각의 상수는 schoollevel2의 객체이다.
  즉 "HIGHT_SCHOOL"의 타입이 "SchoolLevel2"라는 뜻이다.
  이 설명을 좀 더 쉽게 이해하기 위해서 자바 코드로 표현해보자*/
  HIGHT_SCHOOL,
  BACHLOR,
  MASTER,
  DOCTOR
}
/*enum 객체에 값을 지정하고 싶다면
  기본 생성자 대신 그 값을 받는 생성자를 선언해야 한다.
  주의!
  enum 생성자는 외부에서 호출할 수 없다.
  오직 내부에서만 사용되는 생성자이기 때문에
  public, protect private 을 붙일 수 없다.
  */
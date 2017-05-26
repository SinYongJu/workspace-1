/* enum 문법 : 상수를 전문적으로 정의하는 문법
 *  => 값을 지정하지 않고 상수의 이름만 지정한다.
 *  => 상수 타입의 변수를 선언할 수 있다.
 * */
package step15;

public enum SchoolLevel2 {

  HIGHT_SCHOOL(1),
  BACHLOR(2),
  MASTER(3),
  DOCTOR(4);
  
  private final int value;
  
  SchoolLevel2(int value){
    this.value = value;
  }

  public int value() {
    return this.value;
  }
  
  
}

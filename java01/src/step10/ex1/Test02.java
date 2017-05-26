/* 오버라이딩 , 오버리딩 차이점
 * 서브 클래스의 조건에 맞춰서 기능을 바꾸기 위함이다.(오버라이딩)
 * 같은 기능을 하는 메소드에 대하여 같은 이름을 부여해서 프로래밍을 하면서 일관성 있게 해주는것(오버리딩)
 * */

package step10.ex1;

public class Test02 {
  public static void main(String[] args){
    BitStudent s = new BitStudent();
    s.name = "홍길동";
    s.age = 20;
    s.school = "비트대학교";
    s.print();
  }
}

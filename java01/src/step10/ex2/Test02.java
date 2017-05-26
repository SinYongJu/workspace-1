/* 다형성 - 다형적 변수
 *  => 어떤 레퍼런스 변수는 그 타입의 인스턴스 뿐만 아니라,
 *  그 타입의 서브 클래스의 인스턴스 까지 저장할 수 있다.
 * */

package step10.ex2;

public class Test02 {
  public static void main(String[] args){
    //Member m = new Member();
    //Member m = new Student();
    Member m  = new FreeStudent();
    m.name = "홍글동";
    m.id ="hong";
    m.password = "1111";
    m.tel = "1111-1234";
    m.email = "hong@hong.com";
    
    //Student s = new Student();
    Student s = new FreeStudent();
    //Student s = new Member(); // error
    s.name = "홍글동";
    s.id ="hong";
    s.password = "1111";
    s.tel = "1111-1234";
    s.email = "hong@hong.com";
    s.schoolName = "비트대학교";
    s.grade = 4;
  }
}

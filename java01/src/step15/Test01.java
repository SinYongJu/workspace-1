/*상수 값 다루기: enum 문법 적용전*/
package step15;

public class Test01 {
  public static void main(String[] args) {
    Student s = new Student();
    s.setName("홍길동");
    s.setAge(20);
    s.setSchoolLevel(Student.DOCTOR);
//    s.setSchoolLevel(4);
//    s.setSchoolLevel(5);
    
    System.out.println(s);
  }
}

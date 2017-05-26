/*상수 값 다루기: enum 문법 적용 후*/
package step15;

public class Test02 {
  public static void main(String[] args) {
    Student2 s = new Student2();
    s.setName("홍길동");
    s.setAge(20);
    // 임의의 숫자 사용 X
    //s.setSchoolLevel(5);
    
    // 반드시 그 상수 타입의 값을 넣어야 한다.
    s.setSchoolLevel(SchoolLevel.DOCTOR);
    System.out.println(s);
    
    
    // enum 객체의 기본 값
    SchoolLevel[] values = SchoolLevel.values();
    for(SchoolLevel value : values){
      System.out.printf("name = %s\n", value.name());
      System.out.printf("toString = %s\n", value.toString());
      System.out.printf("ordinal = %s\n", value.ordinal());
      System.out.println("------------------------------");
    }
    
    
  }
}

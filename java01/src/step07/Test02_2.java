package step07;

public class Test02_2 {
  
  static class Student{
    // 클래스가 로딩된 후 자동을 method area 영역에 생성
    // => 인스턴스 마다 개별적으로 관리할 필요가 없고 공유해야 하는 값은
    //    클래스 변수에 보관
    static int guest = 0;
    static int member = 1;
    static int admin = 2;
    
    // 인스턴스 변수. new 명령을 실행할 때 생성된다.
    // => 인스턴스 마다 고유의 값을 가지도록 개별적으로 
    // 관리해야 하는 값은 인스턴스 변수에 보관
    String name;
    int age;
    boolean working;
    int level;
  }
  
  public static void main(String[] agrs){
    Student s1 = new Student();
    Student s2 = new Student();
  
    s1.name = "홍길동";
    s1.age = 20;
    s1.working = true;
    s1.level = Student.guest;
    
    s2.name = "임꺽정";
    s2.age = 30;
    s2.working = true;
    s2.level = Student.admin;
    
  }
}

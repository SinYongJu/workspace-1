/* 초기화 블록: 생성자
 * => 인스턴스를 생성한 후 자동으로 호출되는 특별한 메서드.
 * => 인스턴스 블록과 생성자 호출순서
 *     => 인스턴스 생성 --> 인스턴스 블록 실행 -> 생성자 호출
 * => 인스턴스 블록과의 차이점
 *  파라미터를 받아서 인스턴스 변수를 특정 값으로 초기화시킬 수 있다.
 * => 여러개의 생성자를 가질 수 있다.
 *    다만 그 중에서 한개만 호출된다.
 *    new 명령어 작성시에 호출되는 생성자를 개발자가 지정해야 한다.
 * => 클래스명(파라미터선언) {...}
 *    => 리턴 타입은 없다. 
 * */
package step07;

public class Test03_3 {
  
  static class Student{
    static String name = "홍길동";
    int age = 20;
    static {
      System.out.println("static {...1}"); // 클래스 로딩 1번만 일어남
    }
    { // 인스턴스 블록
      // 인스턴스 블록은 인스턴스 주소를 보관한 this 라는 변수가 내장되어 있다. 
      System.out.println("{인스턴스 블록 실행...1}");
    }
    Student(){//파라미터가 없는 생성자를 '기본생성자(default constructor)'라고 부른다.
      System.out.println("Student()... 호출");
    }
  }
  
  public static void main(String[] agrs){
    new Student();
    System.out.println("----------------");
    new Student();
  }
}

/* 초기화 블록: 생성자
 * => 기본 생성자
 *  => 파라미터가 없는 생성자를 "기본 생성자"라 한다.
 *  => 클래스를 작성할 때 생성자를 만들지 않으면,
 *    컴파일러가 자동으로 기본 생성자를 만든다.
 *  => 즉, 모든 클래스는 한 개 이상의 생성자가 반드시 있다.
 *    생성자가 없는 클래스는 없다.
 *  => 그리고 new 명령으로 인스턴스를 생성할 때 반드시 
 *    어떤 생성자를 호출할 것인지 반드시 지정해야한다.  
 * => 문법
 *  new 클래스명()
 * */
package step07;

public class Test03_4 {
  
  static class Student{
    int age = 20;
    Student(){//파라미터가 없는 생성자를 '기본생성자(default constructor)'라고 부른다.
      System.out.println("Student()... 호출");
    }
  }
  
  static class Student2{
    int age = 20;
    // 단 한개의 생성자라도 작성하지 않으면 다음과 같은 기본생성자가 자동으로 추가
    //Student2(){} 
  }
  
  public static void main(String[] agrs){
    //1) 인스턴스를 생성할 때 호출될 생성자를 지정하지 않으면 컴파일 오류 발생
    // new Student();
    
    //2) 존재하는 기본 생성자를 호출
    new Student();
    //3) 컴파일러가 자동으로 추가한 기본 생성자를 호출
    new Student2();
    //4) 주어진 값을 받을 수 있는 생성자가 존재하지 않을 때, 컴파일 오류 발생
    //new Student(20);
  }
}

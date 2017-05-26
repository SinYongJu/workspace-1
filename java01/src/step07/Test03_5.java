/* 초기화 블록: 생성자
 * => 클래스는 여러개의 생성자를 가질 수 있다.
 * => 파라미터의 개수나 파라미터 타입, 파라미터 순서로 구분된다.
 * => 그러나 변수 이름하고는 상관없다.
 * => 인스턴스를 생성할 때 반드시 여러개의 생성자 중에서 호출될 생성자가 실행되게 된다.
 * */
package step07;

public class Test03_5 {
  
  static class Student{
    int age = 20;
    Student(){//파라미터가 없는 생성자를 '기본생성자(default constructor)'라고 부른다.
      System.out.println("Student()... 호출");
    }
    
    Student(int a){
      System.out.println("Student(int)...호출");
      this.age = a;
    }
    
    Student(int a, String n){
      System.out.println("Student(int , String)...호출");
      this.age = a;
    }
    
    Student(String n, int a ){
      System.out.println("Student(String, int)...호출");
      this.age = a;
    }
  }
  
  public static void main(String[] agrs){
    new Student(); // 넘겨주는 값으로 생성자 결정
    new Student(20);
   //new Student(20L); 컴파일 오류
   //new Student(true)  
    new Student("홍길동",20);
    new Student(20, "홍길동");
  }
}

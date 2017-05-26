/* 초기화 블록: 생성자
 * */
package step07;

public class Test03_6 {
  
  static class Student{
    int age = 20;
    
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
   // new Student(); // 넘겨주는 값으로 생성자 결정
    new Student(20);
    new Student("홍길동",20);
    new Student(20, "홍길동");
  }
}

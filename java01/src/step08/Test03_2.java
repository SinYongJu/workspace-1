/*
 * toString();  클래스의 정보를 간단하게 문자열로 리턴
 *          => 인스턴스의 내부 값을 출력할 때 주로 사용
 * equals(); 인스턴스의 주소를 비교하여 true/false 값을 리턴
 * hashCode(); 인스턴스 구별할 때 사용하는 4바이트 숫자로 된 ID값 
 * getClass(); 클래스 정보를 리턴
 * finalize(); 쓰레기 수집기가 가비지를 메모리에서 제거하기 전에
 *             호출하는 메서드 이다.
 * 
 */
package step08;

public class Test03_2 {
  
  static class Student1{
    String name;
    int age;
  }
  
  static class Student2{
    String name;
    int age;

    public String toString() {
      return String.format("이름: %s\n나이: %d\n", name, age);
    }
  }
  
  public static void main(String[] args) {
    Student1 s1 = new Student1();
    s1.name ="홍길동";
    s1.age = 20;
    
    Student2 s2 = new Student2();
    s2.name ="임꺽정";
    s2.age = 30;
    
    System.out.println(s1.toString());
    System.out.println("------------------");
    System.out.println(s2.toString());
  }
}

/* 클래스 변수와 인스턴스 메서드 
 * => 클래스 메서드에서 인ㄴ스턴스 변수를 사용할 수 없다!
 * => 이유?
 *    인스턴스를 생성하지 않고 클래스 메서드를 호출 할 수 있기 때문이다
 * */
package step07;

public class Test04_9 {
  
  static class Calculator{
 
    public static void m1(){
      m2();
    }
    
    public static void m2(){
      m3();
    }
    public static void m3(){
      System.out.println("m3()...");
    }
  }
    
    public static void main(String[] agrs){
      Calculator.m1();

    }
}

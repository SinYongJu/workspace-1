/* 클래스 변수와 인스턴스 메서드 
 * => 클래스 메서드에서 인ㄴ스턴스 변수를 사용할 수 없다!
 * => 이유?
 *    인스턴스를 생성하지 않고 클래스 메서드를 호출 할 수 있기 때문이다
 * */
package step07;

public class Test04_10 {
  
  static class Calculator{
    int value;
    Calculator(int value){
      Calculator.this.value=value;
    }
    public void m1(){
      /* Calculator.this.*/m2();
    }
    
    public void m2(){
      Calculator.this.m3();
    }
    public void m3(){
      System.out.println(Calculator.this.value);
    }
  }
    
    public static void main(String[] agrs){
      Calculator c1 = new Calculator(100);
      Calculator c2 = new Calculator(200);
      Calculator c3 = new Calculator(300);
      c1.m1();
      c2.m1();
      c3.m1();
    }
}

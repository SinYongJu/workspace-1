/* 클래스 변수와 인스턴스 메서드 
 * => 인스턴스 메서드에서도 클래스 변수를 사용할 수 있다.
 *    당연하다. process는 공용
 * */
package step07;

public class Test04_6 {
  
  static class Calculator{
    static int result;
    
    Calculator(int value){
      Calculator.result = value;
    }
    
    public void plus(int value){
      Calculator.result += value;
    }
    
    public void minus(int value){
      Calculator.result -= value;
    }
  }
    
    public static void main(String[] agrs){
      Calculator c = new Calculator(10);
//      Calculator.plus(10); 호출 X 반드시 인스턴스 메서드의 주소를 줭한다.
      c.plus(10);
      System.out.println(Calculator.result);
    }
}

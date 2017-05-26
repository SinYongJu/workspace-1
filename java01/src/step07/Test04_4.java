/* 클래스 변수와 클래스 메서드 
 * => 클래스 변수를 지정할 때는 다음과 같이 클래스 이름을 지정해야 한다.
 *    클래스명.변수명
 * */
package step07;

public class Test04_4 {
  
  static class Calculator{
    static int result;
    
    Calculator(int value){
      Calculator.result = value;
    }
    
    public static void plus(int value){
      Calculator.result += value;
    }
    
    public static void minus(int value){
      Calculator.result -= value;
    }
  }
    
    public static void main(String[] agrs){
      Calculator c1 = new Calculator(10);
      c1.plus(10);
      System.out.println(c1.result);
      
    }
}

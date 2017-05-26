/* 클래스 변수와 클래스 메서드 
 * => 클래스 메서드에서 클래스를 변수로 사용할 때,
 * */
package step07;

public class Test04_5 {
  
  static class Calculator{
    static int result;
    
    Calculator(int value){
      result = value;
    }
    
    public static void plus(int value){
      //this.result += value; // 클래서 메서드나 블록에서는 this변수가 없다. 컴파일오류!
      // 다음 코드는 this가 생략된 것이 아니라 클래스 이름이 생략된 것이다.
      result += value;
    }
    
    public static void minus(int value){
      result -= value;
    }
  }
    
    public static void main(String[] agrs){
      Calculator c1 = new Calculator(10);
      c1.plus(10);
      System.out.println(c1.result);
      
    }
}

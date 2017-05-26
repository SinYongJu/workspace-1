/* 클래스 변수와 인스턴스 메서드 
 * => 클래스 이름이 아닌 this를 사용하여 클래스 이름을 찾아 갈 수 있다.
 * => 다만, 다른 개발자가 오해할 수 있다.
 * this 다음에 변수명을 주면 인스턴스 변수라고 오해할 가능성이 높다.
 * 따라서 실무에서는 가능한 this를 사용하지 못한다.
 * */
package step07;

public class Test04_7 {
  
  static class Calculator{
    static int result;
    
    Calculator(int value){
      Calculator.result = value;
    }
    
    public void plus(int value){
      this.result += value;
      /*인스턴스에 result라는 변수가 없으면
       * 자동으로 클래스 변수를 찾는다.
       * 그래서 위 코드는 오류는 아니다.
       * 다만 회사에 빅 엿을 먹이고 싶을 때,
       * 이런 식으로 코딩하라!
       * */
    }
    
    public void minus(int value){
      result -= value;
      //인스턴스 메서드에서는 로컬 변수가 아닌 경우,
      //변수명 앞에 this를 자동으로 붙인다.
      // 이런상황 때문에
      //this가 붙더라도 클래스 변수를 찾을 수 있도록 하기 위해서
      //this를 붙더라도 클래스 변수를 찾을 수 있도록 하기 위함이다.
     
    }
  }
    
    public static void main(String[] agrs){
      Calculator c = new Calculator(10);
      c.plus(10);
      System.out.println(Calculator.result);
    }
}

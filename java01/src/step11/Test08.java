/* 캡슐화 : 중첩 클래스에 붙일 수 있는 modifier 종류
 * => 클래스 안에 선언된 클래스를 "중첩 클래스(nested class)"라고 부른다.
 *  또는 "내부 클래스(inner class)"라고도 부른다.
 * => inner 클래스는 클래스 안에 선언되기 때문에,
 *  바깥 클래스의 멤버이다.
 *  따라서 클래스의 멤버인 변수나 메서드와 똑같이 modifier를 사용할 수 있다.
 *  
 * */
package step11;

public class Test08{ // 이렇게 가장 바깥 쪽 클래스를 "패키지 멤버 클래스"라 부른다.
  
  private class inner1{} // 클래스 안에 선언된 클래스를 inner 클래스라 부른다.
  class inner2{}   
  protected class inner3{} 
  public class inner4{} 
  
  public static void main(String[] args){
    // 메서드 안에 선언된 inner 클래스는 로컬 변수와 똑같이 modifier를 사용할 수 없다.
    // private/protected/(default)/public modifier를 붙일 수 없다.
    class local1{}
    //private class local2{} // 컴파일 오류!
    //protected class local3{} // 컴파일 오류!
    //public class local4{} // 컴파일 오류!
  }
}

/* 캡슐화 : modifier 종류
 * => private
 *  - 클래스 멤버만이 접근 가능
 * => (default) : 아무것도 붙이지 않는것
 *  - 클래스 멤버 + 같은 패키지의 클래스
 * => protected
 *  - 상속 받아서 만든 변수인 경우 자식 클래스에서 접근 가능
 *  - 클래스멤버 + 같은 패키지의 클래스 + 자식 클래스
 * => public 
 *  - 전부사용 가능
 * */
package step11;

import step11.ex1.A;

public class Test03 {
  public static void main(String[] args){
    A obj = new A();
    //obj.v1 =1; //private
    //obj.v2 = 2; // (defualt)
    //obj.v3 = 3; //protected
    obj.v4 = 4; //public
  }
}

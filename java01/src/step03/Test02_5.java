/* 증가/감소 연산자 - 전위 및 후위 연산자
 * */

package step03;

public class Test02_5 {
  public static void m1(int value){
    System.out.println(value);
  }
  public static void main(String[] args){
    int i = 3;
    m1(++i);
    
    i =3;
    m1(i++);
  } 
}



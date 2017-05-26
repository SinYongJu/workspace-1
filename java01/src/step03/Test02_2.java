/* 증가/감소 연산자 - 전위 및 후위 연산자
 * */

package step03;

public class Test02_2 {
  public static void main(String[] args){
    //전위(pre-fix) 연산자
    int x = 0;
    int i = 10;
    
    x = ++i;
    
    System.out.printf("i = %d, x = %d\n", i, x);
    
    i = 10;
    x = i++;
    System.out.printf("i = %d, x = %d\n", i, x);
    }
}



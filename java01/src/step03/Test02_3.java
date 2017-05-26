/* 증가/감소 연산자 - 전위 및 후위 연산자
 * */

package step03;

public class Test02_3 {
  public static void main(String[] args){
    int i = 10;
    
    i = ++i;

    System.out.printf("i = %d\n",i);
    
    i = 10;
    i = i++;
    
    System.out.printf("i = %d\n",i);
  } 
}



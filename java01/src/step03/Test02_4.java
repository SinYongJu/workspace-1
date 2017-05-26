/* 증가/감소 연산자 - 전위 및 후위 연산자
 * */

package step03;

public class Test02_4 {
  public static void main(String[] args){
    int i = 3;
    int r = ++i + ++i * ++i;

    System.out.printf("i = %d, r = %d\n",i,r);
    
    i = 3;
    r = i++ + i++ * i++;
    System.out.printf("i = %d, r = %d\n", i, r);
    
    i = 3;
    r = ++i + ++i * i++;
    System.out.printf("i = %d, r = %d\n", i, r);
    
  } 
}



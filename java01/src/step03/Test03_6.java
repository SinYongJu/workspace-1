/* 비트 논리 연산자 (>> >>> <<) */

package step03;

public class Test03_6 {

  public static void main(String[] args){
    int a  = 0b0000_1011;
    System.out.println(a );
    
    System.out.println(a >> 1);
    System.out.println(a >> 2);
    System.out.println(a >> 3);
    
    // >>> 연산자: 빈자리를 무조건 0으로 ㅐㅊ운다.
    System.out.println(-10 >> 2);
    System.out.println(-10 >>> 2);
  } 
}



/* 예외처리 : 자원을 자동 해제 try ~ catch ~ 블록(try ~ with ~ resources 문장)
 *  => try ~ catch ~ 문장에서 일반적으로 자원을 해제시키는 방법은
 *    finally 블록에서 해제시킨다.
 *  => JDK 7 부터 사용 가능 
 * */
package step17;

import java.io.FileInputStream;

public class Test14_2 {
  
  public static void main(String[] args) {
    
    
    try(FileInputStream in = new FileInputStream("step17.Test14.data")) {
      int b = 0;
      while((b = in.read()) != -1){
        System.out.printf("%x ",b);
      }
      in.close();
    } catch (Exception e) {
      System.out.println(e.getMessage());
    } 
    System.out.println("안녕!");
  }

}





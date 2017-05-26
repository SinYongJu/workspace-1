/* 리터럴 - 논리 값 리터럴 */
package step01;

public class Test12 {
  
	public static void main(String[] args) {
	  System.out.println("ABC\b으갸갸갸갹"); //backspace 0x0008
	  System.out.println("ABC\t으갸갸갸갹"); //tab 0x0009
	  System.out.println("ABC\n으갸갸갸갹"); //newline 0x000a
	  System.out.println("ABC\f으갸갸갸갹"); //formfeed 0x000c
	  System.out.println("---------------");
	  System.out.println("ABC\r으갸갸갸갹"); //carrage return 0x000d
    // 이크립스에서 실행하면 온전히 실행 되지 않을 수도 있다.
	  System.out.println("ABC\"으갸갸갸갹"); //double quote 0x0022
	  System.out.println("ABC\'으갸갸갸갹"); //single quote 0x0027
	  
	  char c1 = '\''; 
	      // 작은 따옴펴 문자의 유니코드 값을 알고 싶을때.... 
	  System.out.println(c1);
	  System.out.println("\\");// 0x005c
	  
	  System.out.println("C:\\worksapce\\java01\\src\\step01\\Test12.java");
	}
}

/* 이스케이프 문자
 * => 문자로 인식되지 않고 특별한 명령어로 인식되는 문자 
 * => 문법
 *   \문자
 *   
 *   줄바꿈 문자
 *  => Windows: CRLF(0xodoa, 2바이트로 표현)
 *  => Unix/Linux: LF(0x0a, 1바이트로 표현)
 */
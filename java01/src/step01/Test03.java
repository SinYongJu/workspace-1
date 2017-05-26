/* 변수선언 - 리터럴(litral) 표현
 */

package step01;

public class Test03 {

	public static void main(String[] args) {
	  // 1) 그냥 숫자를 작성하는 것은 4바이트 크기의 정수 값 의미
	 System.out.println(-10);
	 System.out.println(10);
	 System.out.println(2147483647); // 4바이트 양의 정수 최대값
   System.out.println(-2147483648); // 4바이트 음의 정수 최대값
   
   // 2) 8바이트 정수 값을 표현할 때는 숫자 뒤에 'L','l'을 붙인다.
   System.out.println(-10L);
   System.out.println(10l); //대소문자 구분 X 주로 대문자 사용
   System.out.println(2147483647L); // 4바이트 양의 정수 최대값
   System.out.println(-2147483648L); // 4바이트 음의 정수 최대값
   
   System.out.println(9223372036854775807L); // 8 바이트 양의 정수 최대 값
   System.out.println(-9223372036854775808L); // 8 바이트 음의 정수 최대 값
   
   
	}
}


/* 리터럴(literal)?
 * 코드에서 값을 표현한것
 * */
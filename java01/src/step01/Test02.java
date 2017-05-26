/* 변수선언 - 리터럴(litral) 표현
 */

package step01;

public class Test02 {

	public static void main(String[] args) {
	  // 기본 데이터 타입
	  // 1) 정수 데이터형
	  System.out.println('가'); // 문자값 2바이트 크기
	  System.out.println(100); // 4 바이트 정수
	  System.out.println(100L); // 8 바이트 정수
	  
	  // 2) 부동소수점 데이터형 
	  System.out.println(3.14f); // 부동소수점 4 바이트 크기
	  System.out.println(3.14); // 부동보수점 8 바이트 크기
	  
	  // 3) 논리형 데이터형
	  System.out.println(true); // 논리값 4바이트 크기
	  
	  // 4) 객체 데이터형
	  System.out.println("문자열");
    //System.out.println('문자열'); // 자바에서는 ' ' 사용 불가
    
	}
}

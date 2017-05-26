/* 변수선언 - 부동소수점과 유효자릿수 
 */
package step01;

public class Test07 {
  public static float f = 12.375f;
  
	public static void main(String[] args) {
	  // 4바이트 메모리
	  System.out.println(987.654f);
	  System.out.println(987.6549f);
    System.out.println(987.65498f); //유효 자릿수를 넘어가면 값이 짤린다.
    
    System.out.println(999.9999f);
    //주의  컴파일 오류가 발생
    
	  // 8바이트 메모리 단정도 배정도
    System.out.println(9999.99999999999);
    System.out.println(9.99999999999999);
    System.out.println(9999999999999.9);
    System.out.println(987.6549);
	  System.out.println(987.65498);
	}
}


/* 리터럴(literal)?
 * 코드에서 값을 표현한것
 * */
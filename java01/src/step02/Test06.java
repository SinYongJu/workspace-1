package step02;

public class Test06 {
  public static void main (String[] args){
   byte[] arr1; 
   /* 설명
    * => new byte[3]
    *   -byte 타입의 메모리를 연속하여 3개 준비한다.
    *   -그리고 시작 메모리의 주소를 리턴한다.
    *  => byte[] arr1
    *   -byte 배열의 주소를 저장할 변수를 선언한다.
    *   -레펀런스 변수 또는 줄여서 레퍼런스라고 부른다.
    *   -일반적인 값을 저장할 수 없다.
    * */
   
//   arr1 = 10; // 일반적인 값을 저장할 수 없다. 컴파일 오류
//   arr1[0] = 10; // 아직 arr1 변수에 주소가 저장되지 않아 오류  
/* 주의!
 * => 자바에서 모든 종류의 변수에 대해 값을 초기화 시키지 않고 사용하려 하면,
 * 컴파일 오류가 발생한다.
 * */
/*   arr1 = null; // arr1에 0 값을 저장한다 즉 주소가 없음을 의미
   arr1[0] = 10; // null로 초기화 시켯다 하더라도 일단 변수의 값은 초기화된 것이기 때문에
                 // 컴파일 오류는 발생하지 않는다.
                 // 다만 실행할 때 arr1의 변수에 주소가 없기때문에 실행오류가 발생
                 // 실행 오류를 runtime exception 이라 부른다.
*/   
   arr1 = new byte[3];
   arr1[0] = 10;
   arr1[1] = 20;
   arr1[2] = 30;
   System.out.printf("%d, %d, %d\n",arr1[0], arr1[1], arr1[2]);
   
  }
}

/* 배열변수
 * => 같은 타입의 메모리를 연속적으로 만들 때 사용하는 문법 
 */
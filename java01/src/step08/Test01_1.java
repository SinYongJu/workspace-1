/* 프로그램 아규먼트
 * => 프로그램을 실행할 때 넘겨주는 값
 * => 예)
 *    > java -cp bin step08.Test01_1 aaa bbb ccc 111 222;
 * => 위와 같이 클래스 이름 뒤에 값을 주게되면 args[] = {aaa, bbb, ccc, 111, 222} 같이 저장
 *    공백을 기준으로 문자열
 * */
package step08;

public class Test01_1 {

  public static void main(String[] args) {
    System.out.println(args.length);
    for(String str: args){
      System.out.println(str);
    }
  }
}

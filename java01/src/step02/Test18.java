package step02;

//public int i = 100; // 클래스 밖에 명령어 작성 ㄴㄴ

public class Test18 {
  static int a = 10; // 클래스 안에서 무제한 사용! "클래스 변수"
  
  public static void main (String[] args){
    System.out.println(a);
    m1(30);
    System.out.println(a);
    
    int b = 20; // main() 메서드 안에서 사용 로컬변수
//    d = 400; // 컴파일 오류
  }
  
  public static void m1(int c){// m1() 메서드 안에서 사용
//    d = 50; // 자바  호이스팅 지원X
    
    int d = 40; // m1() 로컬 변수
    a = 200;
  }
}
/* 자바 프로글래밍 - 프로그램을 실행시킬 때 시작점*/
public class Test08 {
  public static void main(String[] args){
    System.out.print("hello");
    System.out.print("world!\n");
  }
}

/*
소스파일과 바이트 코드 파일이 한 폴더 안에 섞여 있으면 관리하기 불편하다.
-왜냐하면 배포할 때는 소스 파일을 제외하고 클래스 파일(바이트코드 파일)만
배포해야 하기 때문이다.

해결책?
-소스 파일과 클래스 파일을 다른 폴더로 분리시키면 된다.
-컴파일 방법
1) 클래스 파일만 모아 둘 폴더를 생성한다.
 - java01/bin 폴더 생성
2) 컴파일 할 떄 오셥을 주어 클래스 파일이 놓일 위치를 알려준다.
>javac -d bin
javac -encoding utf8 -d ./bin ./Test08.java

프로젝트 폴더에서 bin 폴더에 들어 있는 클래스 파일 실행하기
-즉 다른 폴더에 있는 클래스 파일 실행하기
-실행 옵션을 주어 클래스 파일이 놓인 위치를 알려준다.
java -classpath bin Test08
*/

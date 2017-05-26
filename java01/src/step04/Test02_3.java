package step04;

public class Test02_3 {
   enum Level{ //상수 값을 그룹으로 묶어 쉽게 선언
     GUEST, MEMBER, ADMIN;
   }
  
  public static void main(String[] args){
    byte b = 10;
    short s = 10;
    int i = 10;
    long l = 10;
    float f = 10f;
    double d = 10.0;
    boolean bool = true;
    char c = '가';
    String str = "오호라";
    
    switch (b) {}
    switch (s) {}
    switch (i) {}
    //switch (l) {} 컴파일 오류
    //switch (f) {}
    //switch (d) {}
    //switch (bool) {}
    switch (c) {}
    switch (str) {}
    // enum 타입(enumeration 열거형) 가능 => 결국 4 바이트 정수 값이다.
    switch (Level.GUEST) {}
  }
}

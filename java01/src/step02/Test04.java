package step02;

public class Test04 {
  public static void main (String[] args){
    char c;
    
    short s;
    
    s = -32768;
    s = 32767;
//    s = 65535;
    
//    char 메모리는 유니코드 값을 저장하는 용도이다
//    그래서 유니코드는 0~ 65535 까지 값을 저장
    c = 0;
    c = 65535;
//    c = -1
    
    c = 44032;
    System.out.println(c);
    
    c = '가'; // '가' f라는 문자를 저장하는 것이 아니다. '가'문자의 유니코드를 저장 한다.
    System.out.println(c);
    
    int i1 = '\b';
    int i2 = '\t';
    int i3 = '\n';
    int i4 = '\f';
    int i5 = '\r';
    int i6 = '\'';
    int i7 = '\"';
    int i8 = '\\';
    
    System.out.printf("%x, %x, %x, %x, %x, %x, %x, %x", i1,i2,i3,i4,i5,i6,i7,i8);
    
    
  }
}


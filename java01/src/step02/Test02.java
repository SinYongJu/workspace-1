package step02;

public class Test02 {
  public static void main (String[] args){
  
    // 자바의 최소단위 메모리 => primitive data type (원시타입 = 기본타입)
    //1) 정수변수: 정수 값을 저장할 때 사용하는 메모리....
    byte b;
    short s;
    int i;
    long l;
 
    b = -128;
    b = 127; // Byte.MIN_VALUE, Byte.MAX_VALUE
    // b = -129
    // b = 128
    
    s = -32768;
    s = 32767;  // Short.MIN_VALUE, Byte.MAX_VALUE
    // s = -32769;
    // s = 32768
    
    i = -2147483648;
    i = 2147483647; // Intearger.MIN_VALUE, Byte.MAX_VALUE
    // i = -2147483649;
    // i = 2147483648;
    //i = 100L 4바이트에 8바이트를 담으려고 해서 오류 
    
    l = Long.MIN_VALUE;
    l = Long.MAX_VALUE; // Long.MIN_VALUE, Byte.MAX_VALUE
    //l =  -9223372036854775809l;
    //l =  9223372036854775808l;
  }
}


/*
 * 
 */
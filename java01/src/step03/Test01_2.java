package step03;

public class Test01_2 {
  public static void main(String[] args){
   
    byte b1 = 10;
    byte b2 = 20;
    byte b3 = 10 + 20;
/*    byte b33 = 10 + 118; // 상수값을 메모리에 담을 수 없기 때문에 오류
    byte b4 = b1 + b2;
    byte b5 = b1 + 20;
    byte b6 = 10 + b2; 컴파일 오류 */
    
    int i1 = 10;
    long l1 = 20;
    
    //int i2 = i1 *l1; 연산결과는 long
    long l2 = i1 +l1;
    float f1 = 10.0f;
    //long l3 = f1 + l1;
    float f2 = f1 + l1;
    float f3 =l1 + l2;// float 저장할 수 있다. 그러나 값이 짤릴 수 수있다.
    
    }
}



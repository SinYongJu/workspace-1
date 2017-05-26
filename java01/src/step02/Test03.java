package step02;

public class Test03 {
  public static void main (String[] args){
    float f;
    double d;
    
    f = 9.999999f;
    System.out.println(f);
    
    f = 999999.9f;
    System.out.println(f);
    
    f = 9.9999997f; // 유효자릿수 7자리를 넘기면? 값이 짤리거나 반올림 한다.
                    // 그래서 유효자릿수를 넘지 않는 값을 저장해야 올바르게 꺼낼 수 있다.
    System.out.println(f);
    
    f = 12.373f;
    System.out.println(f);
    
    f = 3.14159234567f;
    System.out.println(f);
    
    d = 3.14159234567f;
    System.out.println(d);
    
    d = 3.14159234567;
    System.out.println(d);
  }
}


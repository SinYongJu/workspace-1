package step10.ex4;

public class C extends B  {
  int c;
  
  public void m2(){ // B.m2 재정의
    System.out.println("C.m2()");
  }
  
  public void m3(){ // A.m3 재정의
    System.out.println("C.m3()");
  }
  
  public void m5(){ // 새로추가
    System.out.println("C.m5()");
  }
  
  public void test1(){
    m1();
    m2();
    m3();   
  }
  public void test2(){
    super.m1();   // 재정의 하지 않았으면 상속받은 메서드를 가리킨다.
                  // super는 무시된다.
    super.m2();
    super.m3();   // super 재정의 하기전의 함수
    m4();
    super.m4();   // 재정의 하지 않았으면 super는 무시된다.
    m5();
  //super.m5();   // 재정의하거나 상속 받은 메서드가 아니기 때문에, 컴파일 오류!
                  // 조상 중에 m5()가 없다.
  }
}

package step06;

public class Test02_7 {

  public static void main(String[] args){
   Member3 m1 = new Member3();
   Member3 m2 = new Member3();
   Member3 m3 = new Member3();
   
   m1.init("홍길동", 100, 100, 100);
   m2.init("임꺽정", 90, 90, 90);
   m3.init("유관순", 80, 80, 80);
   m1.compute();
   m2.compute();
   m3.compute();
   
   m1.print();
   m2.print();
   m3.print();
  }
}

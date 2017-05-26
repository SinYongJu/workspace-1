package step10.ex1;

public class BitStudent extends Student {
  String school;
  
  void print(){
//    System.out.printf("이름 : %s\n", name);
//    System.out.printf("나이 : %d\n", age);
    super.print(); // 재정의 하기전에 매서드를 호출하라
    System.out.printf("학교 : %s\n", school);
  }
}

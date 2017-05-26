/* 프로그램 아규먼트 연습
 * => 두 개의 값과 한개의 연산자를 입력 받아 계산 결과를 출력하라!
 * => 예)
 *    > java -cp bin step08.Test01_3 가위
 *    승! 
 *    패!
 *    무승부!
 * => Math.random() 의 리턴값 0 <= x < 1; 
 *  x는 부동소수점이다
 *  Math.random()*3 
 *  x는 부동 소수점
 * */
package step08;

public class Test01_3 {

  public static void main(String[] args) {
    if(args.length < 1){
      System.out.println("[사용법]");
      System.out.println(">java -cp bin step08.Test01_2 가위 또는 보 또는 바위");
      return;
    }
 
    int user = 0;
    int com = (int)(Math.random() * 3);
    
    if(args[0].equals("바위"))
      user = 0;
    else if(args[0].equals("가위"))
      user = 1;
    else if(args[0].equals("보"))
      user = 2;
 
    if(com == user){
      System.out.println("비겻습니다.");
      System.out.println(user +" " + com);
    }
    else if((user == 0 && com == 2) ||
        (user == 1 && com == 0) ||
        (user == 2 && com == 1)){
      System.out.println("졋습니다.");
      System.out.println(user +" "+ com);
    }
    else {
      System.out.println("승리햇");
      System.out.println(user +" "+ com);
    }
  }
}
/* 멀티태스킹 : critical section(critical region)
 * => 사전 지식
 *  JVM의 메모리 영역 중 "stack"은 각 스레드 별로 관리된다.
 *  Heap과 Method Area 영역은 모든 스레드가 공유한다.
 * => 의미
 *  여러 스레드가 동시에 같은 코드를 실행할 때
 *  인스턴스 변수의 값이 중복 변경되는 문제가 발생하는 
 *  그런 코드 블록을 "크리티컬 섹션(Critical Section)"이라 부른다.
 *  또 다른 말로,
 *  여러 스레드가 접근해서 실행하면 안전하지 않다는 뜻으로,
 *  "Thread Safe 하지 않다."라고 표현하기도 한다. 
 *  거꾸로,
 *  동시에 여러 스레드가 같은 코드를 실행하더라도,
 *  변경하는 것이 아니라 단지 조회하는 경우
 *  실행에 영향을 끼치지 않는다.
 *  이렇게 여러 스레드가 동시에 실행하더라도 안전한 코드 블록을
 *  "스레드 안전(Thread safe) 하다"라고 표현한다.
 **/
package step19;

public class Test05_2 {
 
  static class Account extends Thread{
    long balance;
    
    public Account(long balance){
      this.balance = balance;
    }
    
    // 여러 ATM 스레드가 이 메서드를 호출한다.
    // 이 메서드 안에서는 인스턴스의 변수 값을 변경한다.
    // 문제는 여러 스레드들이 같은 인스턴스에 대해 wirhdraw() 메서드를 호출했을 때
    // 서로 중복하여 값을 변경할 수 있다는 것이다.
    // 이렇게 되면 올바른 값이 저장되지 않는다.
    // 이렇게 여러 스레드가 동시에 접근해서 실행했을 때
    // 문제가 발생하는 코드 블록을 "Critical Section"이라 부른다.
    public long withdraw(long money){
      long temp = this.balance;
     
      temp -= money;
      
      if(temp >= 0){
        this.balance = temp;
        return money;
      }
      return 0;          
    }
  }

  public static class ATM extends Thread {
    Account account;
    
    public ATM(String name, Account account){
      super(name);
      this.account = account;
    }
    
    public void run(){
      long sum = 0;
      for(int i = 0; i< 10000; i++){
        long money = this.account.withdraw(100);
        if(money==0)
          break;
        sum += money;
      }
      System.out.printf("%s = %d\n",this.getName(), sum);
    }
  }
  
  public static void main(String[] args) {
    Account account = new Account(1000000);
    ATM t1 = new ATM("강남",account);
    ATM t2 = new ATM("강북",account);
    ATM t3 = new ATM("강원",account);
    ATM t4 = new ATM("제주",account);
    
    t1.start();
    t2.start();
    t3.start();
    t4.start();
  }
}

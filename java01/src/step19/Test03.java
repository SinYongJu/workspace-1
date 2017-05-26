/* 멀티태스킹 : 스레드 만들기
 *  => 방법
 *    1) Thread를 상속 받아서 만들기
 *    만들기: class MyTread extends Thread {}
 *    실행하기: new MyThread().start()
 *    2) Runnable 규칙에 따라 만들기
 *    만들기: class Myjob implement 
 *    */
package step19;

public class Test03 {
  static class MyThread extends Thread{
    //"main" 스레드와 병행하여(동시에) 실행할 코드는 반드시
    // run() 메서드를 오버라이딩 하여 그 메서드에 둔다.
    public MyThread(String name){
      this.setName(name);
    }
    public void run(){
      for(int i =0; i< 1000; i++){
        System.out.printf("[%s] %d\n", this.getName(), i);
      }
    }
  }
  
  static class MyJob implements Runnable{
    //"main" 스레드와 병행하여(동시에) 실행할 코드는 
    // Runnable 규칙에 따라 만든 클래스에서 run() 메서드 안에 둔다.
    public void run(){
      System.out.println("MyJob.....");
    }
  }
  public static void main(String[] args) {
    MyThread t1 = new MyThread("t1");
    MyThread t2 = new MyThread("t2");
    MyThread t3 = new MyThread("t3");
    
    t1.start(); // t1 스레드를 독립적으로 실행시킨 후 즉시 리턴한다.
    t2.start(); // t2 스레드를 독립적으로 실행시킨 후 즉시 리턴한다.
    t3.start(); // t3 스레드를 독립적으로 실행시킨 후 즉시 리턴한다.
    
    for(int i =0; i < 1000; i++){
      System.out.printf("[main] %d\n", i);
    }
  }
}

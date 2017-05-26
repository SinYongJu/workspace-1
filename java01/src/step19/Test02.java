/* 멀티태스킹 : 스레드 만들기
 *  => 방법
 *    1) Thread를 상속 받아서 만들기
 *    만들기: class MyTread extends Thread {}
 *    실행하기: new MyThread().start()
 *    2) Runnable 규칙에 따라 만들기
 *    만들기: class Myjob implement 
 *    */
package step19;

import java.io.IOException;
import java.nio.CharBuffer;

public class Test02 {
  static class MyThread extends Thread{
    //"main" 스레드와 병행하여(동시에) 실행할 코드는 반드시
    // run() 메서드를 오버라이딩 하여 그 메서드에 둔다.
    public void run(){
      System.out.println("MyThread....");
    }
    
  }
  
  static class a {
    public void aa (){
      System.out.println("ㅎㅎㅎㅎ");
    }
  }
  
  static class MyJob implements Runnable, Readable{
    //"main" 스레드와 병행하여(동시에) 실행할 코드는 
    // Runnable 규칙에 따라 만든 클래스에서 run() 메서드 안에 둔다.
    public void run(){
      System.out.println("MyJob.....");
    }

    @Override
    public int read(CharBuffer cb) throws IOException {
      // TODO Auto-generated method stub
      return 0;
    }
  }
  public static void main(String[] args) {
    //1) thread 상속 받아 만든 스레드를 실행하기
//    MyThread t = new MyThread();
//    t.start();

    //2) runnable 규칙에 따라 만든 클래스를 스레드로 실행하기
    Thread t2 = new Thread(new MyJob());
    
    t2.start();
//    job.aa();
  }
}

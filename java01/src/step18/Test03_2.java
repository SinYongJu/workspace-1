/* 소켓 프로그래밍 : 서버 소켓 만들기
 * 
 */
package step18;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Test03_2 {
  
  static class MyThread extends Thread{
    Socket socket;
    
    public MyThread(Socket socket){
      this.socket = socket;
    }
    
    public void run(){
      try(
          InputStream in0 = socket.getInputStream();
          OutputStream out0 = socket.getOutputStream();
          
          Scanner in = new Scanner(in0);
          PrintStream out = new PrintStream(out0); ){
        
          System.out.println("=> 클라이언트 접속 완료");
          String str = in.nextLine();
          out.println(str);
        } catch(Exception e){}
      // 클라이언트와 통신 중 오류가 발생하더라도 특별히 뭔가 작업을 수행하지 않는다.
    }
  }
  public static void main(String[] args) throws Exception {
    System.out.println("서버 실행중....");

    // ServerSocket( 포트번호, 대기열의수)
    // port : 포트번호
    // backlog : 대기열의 크기
    ServerSocket serverSocket = new ServerSocket(8888);
    System.out.println("=> 서버 소켓 생성완료!");
    
    Socket socket = null;
    
    while(true){
      MyThread t = new MyThread(serverSocket.accept());
      
      t.start();
    }
  }
}

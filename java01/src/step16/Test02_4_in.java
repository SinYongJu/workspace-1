/* File I/O - 바이너리 스트림 클래스 - InputStream III
 * => 바이트 배열을 읽은 후 퍼버에 저장하기
 * 
 **/
package step16;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Test02_4_in {

  public static void main(String[] args) throws Exception{
FileInputStream in = new FileInputStream("test02_4.data");
    
    byte b;
    b = (byte)in.read();
    
    short s;
    s = (short)(in.read() << 8);
    s |= (short)(in.read());
    
    int i;
    i = (in.read() << 24);
    i |= (in.read() << 16);
    i |= (in.read() << 8);
    i |= (in.read());
    
  
    int len;
    len = (in.read() << 24);
    len |= (in.read() << 16);
    len |= (in.read() << 8);
    len |= (in.read());
    
    // 문자열 배열의 크기 만큼 바이트 배열을 만든다.
    byte[] buf = new byte[len];
    // 문자열 배열을 읽어 바이트 배열에 저장한다.
    in.read(buf);
    // 바이트 배열에 들어 있는 값을 가지고
    // => 이때
    String str = new String(buf, "UTF-8");
    System.out.printf("%x %x %x %s\n",b,s,i,str);
    
    in.close();
  }
}

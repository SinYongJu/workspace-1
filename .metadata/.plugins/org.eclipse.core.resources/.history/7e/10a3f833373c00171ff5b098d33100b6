/* File I/O - 바이너리 스트림 클래스 - OutputStream
 * => 바이트 스트림(binary stream, byte stream)
 *  중간에 변경없이 바이트 단위 그대로 읽고 쓰는 클래스들.
 * => 상속 계층 구조
 *  InputStream
 *    1) Data Sink Stream 클래스(데이터를 직접 읽고/ 쓰는 클래스)
 *    -> FileInputStream
 *    -> ByteArrayStream
 *    -> PipedInputStream
 *    2) Data Processing Stream 클래스(중간에서 데이터 가공)
 *    -> BufferedInputStream
 *    -> DataInputStream
 *    -> ObjectInputStream
 *  OutputStream
 *    1) Data Sink Stream 클래스(데이터를 직접 읽고/쓰는 클래스)
 *    -> FileOutputStream
 *    -> ByteArrayOutputStream
 *    -> PipedOutputStream
 *    2) Data Processing Stream 클래스(중간에서 데이터가공)
 *    -> BufferedOutputStream
 *    -> DataOutputStream
 *    -> ObjectOutputStream
 *    -> PrintStream
 *  */
package step16;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Test02_1_out {

  public static void main(String[] args) throws Exception{
    FileInputStream in = new FileInputStream("test02_1.data");
    
    //read(): int
    //=> 무조건 1 바이트만 읽는다.
    //=> 하지만 리턴 x
    int b = in.read();
    System.out.printf("%x\n",b);
    
    b = in.read();
    System.out.printf("%x\n",b);
    
    b = in.read();
    System.out.printf("%x\n",b);
    
    in.close();
  }
}

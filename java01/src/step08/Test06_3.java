/*  컬렉션 클래스: 사용자 정의 컬렉션 클래스 사용 - LinkedList
 * => linked list  알고리즘을 이용하여 데이터 목록을 다루는 LinkedList 구현
 * 배열
 * => 단점
 * 1) 배열은 고정된 크기의 메모리를 만들어 사용하기 때문에, 
 *  배열의 크기를 늘리게 되면 이전 배열의 값을 새 배열로 복사해야 하는
 *  작업이 필요하다.
 *  => 시간 소요
 *  => 가비지 생성
 * 2) 입력이나 삭제할 떄 마다 배열의 값을 밀고 당기는 작업이 필요
 * => 배열의 크기가 늘어날 수록 시간이 많이 소요
 * => 배열의 그기나 늘어나거나 줄어들게 되면 메모리 작업이 필요하기 때문에 비효율적이다.
 * 
 * => 장점
 * 1)인덱스를 통 해 값을 빠 르게 찾을 수 있어 조회나 변경 속도가 빠르다.
 *
 * LinkedList 
 * => 배열의 단점을 제걱한다.
 *  1) 연결 고리를 이용하여 값과 값을 연결한다.
 *  2) 삽입, 삭제 속도가 빠르다.
 *  
 * => 단점
 *  1)값을 찾기 위해 계속 그 링크를 따라가야 하기 떄문에 느리다.
*/
package step08;

import java.sql.Date;

public class Test06_3 {
  
  public static void main(String[] args) {
     Test06_3_LinkedList dateList = new Test06_3_LinkedList();
     
     dateList.add(Date.valueOf("2017-3-1"));
     dateList.add(Date.valueOf("2017-5-3"));
     dateList.add(Date.valueOf("2017-5-5"));     
     dateList.add(Date.valueOf("2017-5-9"));
     dateList.add(Date.valueOf("2017-6-6"));
    
      System.out.println(dateList.size());
      dateList.add(3, Date.valueOf("2017-2-22"));
   
     Object removeObj = dateList.remove(3);

     Object oldObj = dateList.set(2, Date.valueOf("2017-5-4"));
   
      
     // 인덱스가 가리키는 버킷 객체의 주소를 알아낸다.
     for(int i = 0; i < dateList.size(); i++){
       System.out.println(dateList.get(i));
     }
     /*
     System.out.println("=>" + removeObj);
     System.out.println("=>" + oldObj);
     System.out.println(dateList.get(6));
     */
   }
}

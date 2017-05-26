/*  컬렉션 클래스 II: java.lang.LinkedList 
*/
package step08;

import java.sql.Date;
import java.util.LinkedList;

public class Test07_2 {
  
  public static void main(String[] args) {
     LinkedList dateList = new LinkedList();
     
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

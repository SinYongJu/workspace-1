/*  컬렉션 클래스: 사용 전 - 네네릭 적용
*/
package step08;

import java.sql.Date;
import java.util.ArrayList;

public class Test07_11 {
  
  public static void main(String[] args) {
     ArrayList<Date> dateList = new ArrayList<>();
     
     dateList.add(Date.valueOf("2017-3-1"));
     dateList.add(Date.valueOf("2017-5-3"));
     dateList.add(Date.valueOf("2017-5-5"));     
     dateList.add(Date.valueOf("2017-5-9"));
     dateList.add(Date.valueOf("2017-6-6"));
     
     dateList.add(2, Date.valueOf("2017-2-22"));
     Date removeObj = dateList.remove(3);
     
     Date oldObj = dateList.set(1, Date.valueOf("2017-5-4"));
     
     for(Date date : dateList){
       System.out.printf("%d월 %d일\n", date.getMonth()+1, date.getDate());
     }
     System.out.println("=>" + removeObj);
     System.out.println("=>" + oldObj);
//     System.out.println(dateList.get(6));
   }
}

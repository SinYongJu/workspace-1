/*  컬렉션 클래스: 사용 전 - ArrayList 제네릭 적용
*/
package step08;

import java.sql.Date;

public class Test06_5 {
  
  public static void main(String[] args) {
     Test06_5_ArrayList<Date> dateList = new Test06_5_ArrayList<>();
     
     dateList.add(Date.valueOf("2017-3-1"));
     dateList.add(Date.valueOf("2017-5-3"));
     dateList.add(Date.valueOf("2017-5-5"));
     dateList.add(Date.valueOf("2017-5-9"));
     dateList.add(Date.valueOf("2017-6-6"));
     
     
     for(int i = 0; i < dateList.size(); i++){
       Date date= dateList.get(i);
       
       System.out.print(date.getMonth() +1 +"월");
       System.out.println(date.getDate() + "일");
     }
   }
}

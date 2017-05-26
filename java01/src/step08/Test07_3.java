/*  컬렉션 클래스 II: java.lang.HashSet
 *  => 저장하려는 객체데 대해 hashCode()를 호출하여 
 *    그 리턴 값을 가지고 저장할 위치를 계산한다.
 */
package step08;

import java.sql.Date;
import java.util.HashSet;
import java.util.Iterator;

public class Test07_3 {
  
  public static void main(String[] args) {
     HashSet dateSet = new HashSet();
     
     dateSet.add(Date.valueOf("2017-3-1"));
     dateSet.add(Date.valueOf("2017-5-3"));
     dateSet.add(Date.valueOf("2017-5-5"));
     dateSet.add(Date.valueOf("2017-5-9"));
     dateSet.add(Date.valueOf("2017-6-6")); // 데이터 중복을 허용 하지 않는다.
   
     // Set 컬렉션에서 값을 꺼내는 방법
     
     // 방법1) 배열을 리턴 받기 : 입력 순서대로 리턴 받을 수 없다.
     Object[] valueLsit = dateSet.toArray();
     for(int i = 0; i < valueLsit.length; i++){
       System.out.println(valueLsit[i]);
     }
     // 방법2) 값을 꺼내주는 도구를 이용하여 처리한다.
     Iterator iterator = dateSet.iterator();
     while (iterator.hasNext()){
       System.out.println(iterator.next());
     }
   }
}

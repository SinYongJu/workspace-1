/*  컬렉션 클래스 II: java.lang.HashSet
 *  => 저장하려는 객체데 대해 hashCode()를 호출하여 
 *    그 리턴 값을 가지고 저장할 위치를 계산한다.
 */
package step08;

import java.sql.Date;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class Test07_10 {
  static class MyKey {
    String value;

    public MyKey(String value){
      this.value = value;
    }
    
    public String toString(){
      return value;
    }

    @Override
    public int hashCode() {
      final int prime = 31;
      int result = 1;
      result = prime * result + ((value == null) ? 0 : value.hashCode());
      return result;
    }

    @Override
    public boolean equals(Object obj) {
      if (this == obj)
        return true;
      if (obj == null)
        return false;
      if (getClass() != obj.getClass())
        return false;
      MyKey other = (MyKey) obj;
      if (value == null) {
        if (other.value != null)
          return false;
      } else if (!value.equals(other.value))
        return false;
      return true;
    }
    
    
  }
  
  
  static class Book {
    String title;
    String press;
    int page;
    
    public Book(String title, String press, int page){
      this.title = title;
      this.press = press;
      this.page = page;
    }
  
  public String toString(){
    return String.format("%s,%s,%d", title, press, page);
  }
 }
  public static void main(String[] args) {
     HashMap map = new HashMap();
     
     map.put(new MyKey("key1"), new Book("aaa","비트출판사",100));
     map.put(new MyKey("key2"), new Book("bbb","비트출판사",200));
     map.put(new MyKey("key3"), new Book("ccc","비트출판사",300));
     map.put(new MyKey("key4"), new Book("ddd","비트출판사",400));
     
     //Map 컬렉션에서 값 꺼내기
     //방법1) 값 목록을 리턴 받아 꺼내기
     //=> 값 목록을 리턴 받는다.
     Collection valueLsit = map.values();
     //값이 들어 있는 컬렉션에서 값을 한 개씩 꺼내줄 도구를 얻는다.
     Iterator iterator = valueLsit.iterator();
     
     //=> 그 도구를 사용하여 값을 꺼낸다.
     while (iterator.hasNext()){   
       System.out.println(iterator.next());
     }
     System.out.println("-------------------");
     
     // 방법2) key 목록을 리턴 받아 꺼내기
     // => key 목록을 리턴 받는다.
     Set keySet = map.keySet();
     
     // => key 목록에서 key 배열을 얻는다.
     
     Object[] keyArray = keySet.toArray();
     for(int i = 0; i< keyArray.length; i++){
       System.out.println(map.get(keyArray[i]));
     }
     System.out.println("-------------------"); 
     
     // => Set은 Collection의 서브 타입이다.
     //   Collection에 있는 값을 꺼낼 때 for(변수선언 : 배열 또는 collection객체 ) 
     for(Object key : keySet){
       System.out.println(map.get(key));
     }
     System.out.println("-------------------"); 
      
     // 방법3) key와 value를 한쌍으로 하는 목록 리턴 받기
     // => key/value 한 묶음으로 만든 목록을 리턴 받는다.
     Set entrySet =map.entrySet();
     for(Object object : entrySet){
       Entry entry = (Entry)object;
       System.out.printf("%s=%s\n",entry.getKey(), entry.getValue());
     }
   }
}

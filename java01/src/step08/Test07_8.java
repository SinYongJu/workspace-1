/*  컬렉션 클래스 II: java.lang.HashSet
 *  => 저장하려는 객체데 대해 hashCode()를 호출하여 
 *    그 리턴 값을 가지고 저장할 위치를 계산한다.
 */
package step08;

import java.sql.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Test07_8 {
  
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
     /* put(key, value)
      * => key 객체: key 객체의 hashCode() 리턴 값을 사용하여
      *    value를 저장할 때 사용할 위치를 계산한다.
      * => 그래서 key객체는 같은 값을 가진 객체인 경우
      *    같은 hashCode()를 리턴하는 클래스를 사용한다.
      *    예) String, 랩퍼 클래스(Byte, Short, Integer, Long, Double, Float, Char, Boolean)
      * -> value 객체: Map 컬렌션에 보관될 값
      * */
     map.put(new String("key1"), new Book("aaa","비트출판사",100));
     map.put("key2", new Book("bbb","비트출판사",200));
     map.put("key3", new Book("ccc","비트출판사",300));
     map.put("key4", new Book("ddd","비트출판사",400));
     map.put(new Integer(1), new Book("eee","비트출판사",500));
     map.put(2, new Book("fff","비트출판사",600));
     map.put(3, new Book("fff","비트출판사",600));
        //  ㄴ오토박싱
     // 값을 꺼내는 방법
     // => 값을 저장할 때 사용한 key를 가지고 꺼낸다.
     // => 반드시같은 인스턴스일 필요는 없다.
     //    저장할 때 사용한 key의 hashCode() 리턴 값과
     //    같은 hash value를 가진다면 값을 꺼내는 key로 사용할 수 있다.
     //    물론, equlas()의 결과도 true여야 한다.
     System.out.println(map.get(new String("key1")));
     System.out.println(map.get(1));
     System.out.println(map.get(2));
     System.out.println(map.get(3));
     
     String s1 = new String("Hello");
     String s2 = new String("Hello");
     
     if(s1==s2)
       System.out.println("s1==s2");
     else
       System.out.println("s1!=s2");
     System.out.printf("%d, %d\n", s1.hashCode(), s2.hashCode());
     System.out.println(s1.equals(s2));
   }
}

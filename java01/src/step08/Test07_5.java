/*  컬렉션 클래스 II: java.lang.HashSet
 *  => 저장하려는 객체데 대해 hashCode()를 호출하여 
 *    그 리턴 값을 가지고 저장할 위치를 계산한다.
 */
package step08;

import java.sql.Date;
import java.util.HashSet;
import java.util.Iterator;

public class Test07_5 {
  
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
     HashSet set = new HashSet();
     
     set.add(new Book("aaa","비트출판사",100));
     set.add(new Book("bbb","비트출판사",200));
     set.add(new Book("ccc","비트출판사",300));
     set.add(new Book("ddd","비트출판사",400));
     set.add(new Book("eee","비트출판사",500));
     set.add(new Book("fff","비트출판사",600));
     set.add(new Book("fff","비트출판사",600));
 
     Iterator iterator = set.iterator();
     while (iterator.hasNext()){
       System.out.println(iterator.next());
     }
     
     /* "ffff" 제목의 책이 중복 저장되었다. 이유는?
      * => hashCode()의 리턴 값이 다르기 때문이다.
      * => hashSet은 값을 저장할 때 hashCode()의 리턴값을 가지고 위치를 계산하는데,
      *    같은 값을 갖고 있더라도 hashCode()의 리턴 값이 다르기 때문에,
      *    다른 위치로 저장되어서 중복된 것이다. */
     System.out.println(new Book("fff","비트출판사",600).hashCode());
     System.out.println(new Book("fff","비트출판사",600).hashCode());
     System.out.println(new Book("fff","비트출판사",600).hashCode());
     
     /* 어? 아까 String인 경우 값이 같으면 */
     
   }
}

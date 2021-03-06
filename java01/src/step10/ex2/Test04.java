/* 다형성 
 * */

package step10.ex2;

public class Test04 {
  public static void main(String[] args){
    checkReference(new Member());
    checkReference(new Student());
    checkReference(new Manager());
    checkReference(new Teacher());
    checkReference(new FreeStudent());
  }
  
  static void checkReference(Object obj){
    if(obj instanceof Member) System.out.println("member의 인스턴스 이다.");
    if(obj instanceof Student) System.out.println("Student의 인스턴스 이다.");
    if(obj instanceof Manager) System.out.println("Manager의 인스턴스 이다.");
    if(obj instanceof Teacher) System.out.println("Teacher의 인스턴스 이다.");
    if(obj instanceof FreeStudent) System.out.println("FreeStudent의 인스턴스 이다.");
    System.out.println("------------------------------");
  }
} 
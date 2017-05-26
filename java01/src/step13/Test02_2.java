/* nested class: static nested class
 * 
 * */

package step13;

public class Test02_2 {
  static class Member{
    String name;
    String tel;
    int schoolLevlel;
    int userType;
    int working;
    int language;
    
  }
  
  public static void main(String[] args){
    // static nested 클래스 대신 일반 클래스로 만든 사수 값을 사용해 보자!
    Member m = new Member();
    m.name = "홍길동";
    m.tel = "1111-1111";
    m.schoolLevlel = CSchool.BACHLOR;
    m.userType = CUserType.TEACHER;
    m.working = CWork.NOT_WORKING;
    m.language =CLanguage.JAVA;
  }
}

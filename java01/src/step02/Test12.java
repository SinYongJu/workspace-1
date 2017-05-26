package step02;

public class Test12 {
  public static void main (String[] args){
    //새 데이터 타입 정의
    // => 설계도만 있는 상태이다. 메모리는 아직 준비되지 않았다.
    class Student{
      String name;
      byte[] scores;
      short total;
      float aver;
    }

    // 새 데이터 타입에 따라 만든 메모리의 주소를 담을 변수 선언
    Student s1;
    // 새데이터 타입에 따라 메모리 준비
    // => 이 메모리를 인스턴스라 한다.
    // => 리턴 값은 새로 준비한 메모리 주소이다.
    s1 = new Student();
    // 메모리에 값넣기
    s1.name = "홍길동";
    s1.scores = new byte[3];
    s1.scores[0] = 100;
    s1.scores[1] = 100;
    s1.scores[2] = 100;
    s1.total = (short)(s1.scores[0] + s1.scores[1] + s1.scores[2]);
    s1.aver = s1.total / 3f;
    
    System.out.printf("%s, %d, %d, %d, %d, %.2f\n", s1.name, s1.scores[0], s1.scores[1], s1.scores[2], s1.total, s1.aver);
    
    Student s2 = s1;
    s2.name = "임꺽정";
    System.out.printf("%s, %d, %d, %d, %d, %.2f\n", s1.name, s1.scores[0], s1.scores[1], s1.scores[2], s1.total, s1.aver);

    //자바는 자바스크립트와 다르게. 설계도에 따라 만든 메모리 외에는 추가할 수 없다.
    //임의로 다른 메모리를 추가 할 수 없다.
   //s1.tel = "1111-1111"; // 컴파일 오류
  }
}

/* 인스턴스?
 * 
 * -> class 설계도에 따라 준비한 메모리
 * -> 보통 객체(object)라고 한다.
 * 
 * 
 * 레퍼런스?
 * -> 배열이든 인스턴스이든 메모리의 주소를 저장하는 변수를 말한다.
 * 
 * class 문법?
 * 1)사용자 정의 데이터 타입을 만들 때
 * 2)메서드를 기능이나 역활에 따라 분류했을 때
 * 
 * 필드(field)?
 * -> 인스턴스를 구성하는 메모리 항목을 말한다.
 * -> field == attribute != peoperty
 *
 * 프로퍼티(property)?
 * -> 인스턴스의 필드를 다루는 getXxx()/setXxx() 메서드를 가리키는 용어다.
 */
package step02;

class Student{
  String name;
  int[] scores ;
  int total;
  float aver;
  
  Student(){}
  
  // 사용자 정의 클래스를 만들때,
  // 다음과 같이 인스턴스를 초기화 시키는 특별한 메서드(생성자)를 추가할 수 있다.
  Student(String name, int kor, int eng, int math){
    // 생성자에는 this 라는 내장 변수가 있다.
    // 생성자를 호출할 때 그 인스턴스의 주소를 담고 있는 변수이다.
    // 인스턴스의 필드를 사용하고 싶다면 이 내장 변수 this를 사용하라.
    this.name= name;
    this.scores = new int[]{kor, eng, math};
    this.total = kor + eng + math;
    this.aver = this.total / 3f;
  }
  
  // Student의 인스턴스 값을 출력하는 함수인s데, 굳이 printStudent()라는 이름을 지을 필요 X
  // 이름에서 Student를 빼더라도 이 메서드가 어떤 값을 출력하는지 충분히 알 수 있다.
  public static void print(Student s){ /* Student 인스턴스의 주소를 받을 변수*/
    System.out.printf("%s, %d, %d, %d, %d, %.2f\n", 
        s.name, s.scores[0], s.scores[1], s.scores[2], s.total, s.aver);
  }

}
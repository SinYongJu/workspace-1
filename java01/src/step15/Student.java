package step15;

public class Student {
  public static final int HIGHT_SCHOOL = 1;
  public static final int BACHLOR = 2;
  public static final int MASTER =3;
  public static final int DOCTOR = 4;
  
  private String name;
  private int age;
  private int schoolLevel;
  
  
  
  @Override
  public String toString() {
    return "Student [name=" + name + ", age=" + age + ", schoolLevel=" + schoolLevel + "]";
  }
  
  public void setName(String name){
    this.name = name;
  }
  public String getName(){
    return name;
  }
  
  public void setAge(int age){
    this.age = age;
  }
  public int getAge(){
    return age;
  }
  
  public void setSchoolLevel(int schoolLevel){  
    // 최종 학력의 값이 무효한지 검사한다.
    if(schoolLevel < 1 || schoolLevel > 4){  
      throw new RuntimeException("유효값 X");
    }
    this.schoolLevel = schoolLevel;
  }
  public int getSchoolLevel(){
      return schoolLevel;    
  }
}

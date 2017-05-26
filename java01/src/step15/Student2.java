package step15;

public class Student2 {

  private String name;
  private int age;
  private SchoolLevel schoolLevel;
  
  @Override
  public String toString() {
    return "Student2 [name=" + name + ", age=" + age + ", schoolLevel=" + schoolLevel + "]";
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
  
  public void setSchoolLevel(SchoolLevel schoolLevel){  
    this.schoolLevel = schoolLevel;
  }
  public SchoolLevel getSchoolLevel(){
      return schoolLevel;    
  }
}

package step02;

public class Test {
  public static void main(String[] args){
    int num = 3; 
    
    for(int i = num; i > 0; i--){
      for(int j = 0; j < i; j++){
        System.out.print('*');
      }
      System.out.println();
    }
  }
}
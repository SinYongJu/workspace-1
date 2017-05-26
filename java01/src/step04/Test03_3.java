package step04;

public class Test03_3 {
  
  public static void main(String[] args){
    int i = 0;
    int r = 0;
    while(i < 10){
      i++;
      if(i == 5)
        continue;
      r += i;
    }
    System.out.printf("i = %d, r = %d",i,r);
  }
}

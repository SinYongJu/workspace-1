package step02;

public class Test11 {
  public static void main (String[] args){
    String[] names = {"홍길동", "임꺽정", "유관순"};
    byte[][] scores ={{100, 100, 100}, {90, 90, 90},{80, 80, 80}};
    short[] totals = {300, 270, 240};
    float[] aver = {100f, 90f, 80f};
    
    for(int i =0; i< names.length; i++){   
        System.out.printf("이름: %s, 국어: %d, 수학: %d, 영어: %d, 합계: %d, 평균:%.2f\n ", names[i], scores[i][0], scores[i][1], scores[i][2], totals[i], aver[i]);
    }
  }
}
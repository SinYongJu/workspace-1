package step05;

public class Test07 {
 public static void m1(int a){
   m2(++a);
   System.out.println("m1 : " + a);
   m2(++a);
   System.out.println("m1 : " + a);
   
 }
 public static void m2(int a){
   m3(++a);
   System.out.println("m2 : " + a);
 }
 
 public static void m3(int a){
   ++a;
   System.out.println("m3 : " + a);
 }
  public static void main(String[] args){
   int a= 20;
   m1(20); // a 변수를 넘기는 것이 아니라, a변수의 값을 넘긴다.
   System.out.println("main : " + a);
  }
}
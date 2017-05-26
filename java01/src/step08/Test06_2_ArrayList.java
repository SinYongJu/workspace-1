/*  컬렉션 클래스: 사용 전 - 목록을 다루는 클래스 구현
 * - 배열을 이용하여 데이터 목록을 다루는 array-list 구현
*/
package step08;

class Test06_2_ArrayList {
  /* 값을 조회하는 용도로만 사용하고 싶은 변수가 있다면,  읽기 전용으로 만들어라!
   final을 붙인다.
   => 조회용임을 직관적으로 알 수 있도록 보통 대문자로 변수명을 짓는다.
   그리고 단어와 단어 사이에는 _ 를 사용하여 문자를 구분한다.
   => 이렇게 조회용으로만 사용하는 변수를 상수 변수라 한다. 보통 "상수"라고 줄여서 표현한다.
   => 상수는 인스턴스 마다 고유의 값을 가지지 않는다. 모든 인스턴스가 같은 값을 갖는다.
   그래서 모든 인스턴스가 같은 값을 갖는 변수인 경우는 보통 클래스 변수로 선언한다.
   클래스 변수로 선언하면 인스턴스마다 그 변수를 만들 필요가 없어 메모리가 절약된다.
   => 상수 변수 중에서 공개하는 변수인경우 public을 붙인다. */
  public static final int DEFAULT_SIZE = 10;
  public static final int GROW_SIZE = 1000;
  
  // 클래스 멤버만 접근할 수 있도록 제한한다.
  private Object[] list;
  private int length;
  
  public Test06_2_ArrayList(){
    list = new Object[DEFAULT_SIZE];
  }
  
  public Test06_2_ArrayList(int capacity){
    if(capacity < DEFAULT_SIZE || capacity > GROW_SIZE){
      list = new Object[DEFAULT_SIZE];
    } else{
      list = new Object[capacity];
    }
  }
  
  // 맨 끝 빈방에 값을 넣는다.
  public void add(Object obj){
    list[length++] = obj;
    if(length == list.length){
      increaseList();
    }
  }
  
  // 값이 들어 있는 중간 방에 새 값을 끼워 넣는다.
  public void add(int index, Object obj){
    if(length == list.length){
      increaseList();
    }
    
    if(index < 0 || index > length){
      throw new RuntimeException("인덱스 번호가 범위를 넘어 갑니다.");
    }
    
    if(index < length){
      // 맨 마지막 값부터 index가 가리키는 방의 값까지 반복하면서 뒤로 한 칸씩 미룬다.
      for(int i = length; i > index; i--){
        list[i] = list[i-1];
      }
    }
    list[index] = obj;
    length++;
  }

  // ArrayList 클래스 내부에서만 사용할 메서드라면 굳이 공개하지 말라!
  // => 메서드 선언 앞에 private을 붙인다. 
  
  private void increaseList() {
      Object[] newList = new Object[list.length + GROW_SIZE];
      for(int i = 0; i <list.length; i++){
        newList[i] = list[i];
    }
    list = newList;
  }
  
  public int size(){
    return length;
  }
  
  public Object get(int index){
    if(index >= 0 || index <= length){
      return list[index];
    }
    throw new  RuntimeException("배열 인덱스의 범위를 벗어났습니다.");
  }
  
  public  Object remove(int index){
    if(index < 0 && index >= length){
      throw new  RuntimeException("배열 인덱스의 범위를 벗어났습니다.");
    }
    
    Object removeObj = list[index];
    
    if(index < (length -1)){
      for(int i =  index; i < length-1; i++){
        list[i] = list[i+1];
      }
    }
    length--;
    return removeObj;
  }
  
  public Object set(int index, Object obj){
    if(index < 0 && index >= length){
      throw new  RuntimeException("배열 인덱스의 범위를 벗어났습니다.");
    }
    Object oldObj = list[index];
    list[index] = obj;
    return oldObj;
  }
}


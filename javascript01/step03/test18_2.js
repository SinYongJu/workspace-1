"use strict"

/*
 프로그램 실행 중 예외 상황이 발생했을 때, 에외 정보를 알리는 명령어
*/

function divide(a, b) {
  if(b == 0)
    return -12121212
  return a/b
}

var result = divide(12121212 , -1)
if( result == -12121212){
  console.log('0으로 출력 X');
}
else{
  console.log(result);
}

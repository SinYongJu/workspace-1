"use strict"

/*
 프로그램 실행 중 예외 상황이 발생했을 때, 에외 정보를 알리는 명령어
*/

function divide(a, b) {
  return a/b
}

var result = divide(10,2)
console.log(result);

result = divide(10 , 0)
console.log(result);  

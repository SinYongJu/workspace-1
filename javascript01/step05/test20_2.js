//read only 적용 후
//result 변수를 객체의 프로퍼티로 만들지 않는다
"use strict"

//함수 객체 응용
function Calculator() {
  // const result = 0;
}
let result = 0;

Calculator.prototype.plus = function (value) {result += value};
//함수에서 바깥 쪽의 변수를 사용할 떄,
//그 변수가 "로컬 변수"이거나 'let'으로 선언된 변수인 경우,
//언제든(함수 호출이 끝나거나 블록을 벗어날 때) 제거될 수 있는 위험이 있다.
//이런 경우를 해소하기 위해 그 변수의 값을 클로저가 관리하는 별도의 영역에 복제해 둔다.
Calculator.prototype.minus = function (value) {result -= value};
//같은 영역에서 만든 함수는 클로저 영역을 공유한다.
//plus()나 minus()는 같은 크로저의 메모리 영역을 사용한다.

Calculator.prototype.getResult = function (value) {
    return result;
}

var calc1 = new Calculator();
calc1.plus(100)
calc1.minus(20);
calc1.plus(10);
//result = 999;
console.log(calc1.result); // 실행오류
//console.log(result);
console.log(calc1.getResult());

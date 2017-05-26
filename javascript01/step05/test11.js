/*생성자 함수의 이름
 -생성자 함수는 어떤 역활의 객체를 만드는지
  그 이름 속에서 추측할 수 있도록
  함수 이름을 짓도록 하라!
*/
"use strict"

function Calculator() {
  this.result = 0;

  this.plus = function (value) {this.result += value}
  this.minus = function (value) {this.result -= value}
  this.multiple = function (value) {this.result *= value}
  this.divide = function (value) {this.result /= value}
}

var calc = new Calculator();

//10 + 20 * 3 - 7 / 2 = ?
calc.plus(10);
calc.plus(20);
calc.multiple(3);
calc.minus(7);
calc.divide(2);
console.log(calc.result);

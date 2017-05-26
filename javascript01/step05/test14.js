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

var c1 = new Calculator();
var c2 = new Calculator();
var c3 = new Calculator();

c1.plus(10);
c2.minus(20);
c3.plus(300);
//10 + 20 * 3 - 7 / 2 = ?
console.log(c1.result);
console.log(c2.result);
console.log(c3.result);


//문제점 함수들이 중복해서 생성됨 

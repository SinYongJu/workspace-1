/*생성자 함수의 이름
 -생성자 함수는 어떤 역활의 객체를 만드는지
  그 이름 속에서 추측할 수 있도록
  함수 이름을 짓도록 하라!
*/
"use strict"

function Calculator() {
  this.result = 0;

  // Calculator.prototype.plus = function (value) {this.result += value};
  // Calculator.prototype.minus = function (value) {this.result += value};
  // Calculator.prototype.multiple = function (value) {this.result += value};
  // Calculator.prototype.divide = function (value) {this.result += value};
}

Calculator.prototype.plus = function (value) {this.result += value};
Calculator.prototype.minus = function (value) {this.result -= value};
Calculator.prototype.multiple = function (value) {this.result *= value};
Calculator.prototype.divide = function (value) {this.result /= value};
//공통으로 사용될 것만/

var c1 = new Calculator();
var c2 = new Calculator();
var c3 = new Calculator();

c1.plus(10);
c2.minus(20);
c3.plus(300);

console.log(c1.result);
console.log(c2.result);
console.log(c3.result);
//c1에 만약 result라는게 있으면..?


//console.log(Calculator.prototype.plus(10)); //undefined
//console.log(c1.prototype.plus(10)); //console.error();

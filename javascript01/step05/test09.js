/*new 연산자와 생성자*/
"use strict"

function init() {
  this.result = 0;

  this.plus = function (value) {this.result += value}
  this.minus = function (value) {this.result -= value}
  this.multiple = function (value) {this.result *= value}
  this.divide = function (value) {this.result /= value}
}

var calc = new init();

console.log(calc);

//10 + 20 * 3 - 7 / 2 = ?
calc.plus(10);
calc.plus(20);
calc.multiple(3);
calc.minus(7);
calc.divide(2);
console.log(calc.result);

var calc2 = {
  result : 0,
  plus : function (value) {this.result += value},
  minus : function (value) {this.result -= value},
  multiple : function (value) {this.result *= value},
  divide : function (value) {this.result /= value}
 }

calc2.plus(10);
calc2.plus(20);
calc2.multiple(3);
calc2.minus(7);
calc2.divide(2);
console.log(calc2.result);


var c1 = new init();
c1.plus(20);
var c2 = new init();
c2.plus(30);
var c3 = new init();
c3.plus(40);

console.log(c1.result, c2.result, c3.result);

var c4 = {
  result : 0,
  plus : function (value) {this.result += value},
  minus : function (value) {this.result -= value},
  multiple : function (value) {this.result *= value},
  divide : function (value) {this.result /= value}
}
c4.plus(400);

var c5 = {
  result : 0,
  plus : function (value) {this.result += value},
  minus : function (value) {this.result -= value},
  multiple : function (value) {this.result *= value},
  divide : function (value) {this.result /= value}
}
c5.plus(500);

var c6 = {
  result : 0,
  plus : function (value) {this.result += value},
  minus : function (value) {this.result -= value},
  multiple : function (value) {this.result *= value},
  divide : function (value) {this.result /= value}
}
c6.plus(600);

console.log(c4.result, c5.result, c6.result);

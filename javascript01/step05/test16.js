"use strict"

function Calculator() {
  this.result = 0; // 인스턴스 변수
  //this.plus3 = (a, b) => a + b;
}

Calculator.prototype.plus = function (value) { this.result += value}// 인스턴스 변수 사용
Calculator.prototype.plus2 = function (a, b) { return a + b}// 인스턴스 변수 사용 X
                                                            //this.resulrt a + b로 바꾸면 undefine

var c1 = new Calculator();
var c2 = new Calculator();

c1.plus(100)
var r1 = c1.plus2(100, 200)
console.log(c1.result, r1);
//console.log(c1.result, c1.plus2(100,200), c1.plus3(100,200));

c2.plus(200);
var r2 = c2.plus2(1000,2000)
console.log(c2.result, r2);

//1번
function plus2(a, b) {
  return a + b;
}
//2번
Calculator.plus2 = function (a, b) { return a + b}

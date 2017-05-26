"use strict"

//함수 객체 응용
function Calculator() {
  this.result = 0;
}

//인스턴스 함수 추가
Calculator.prototype.plus = function (value) {this.result += value};
Calculator.prototype.minus = function (value) {this.result -= value};

//일반 함수 추가
Calculator.plus = function(a, b) {return a+b};
Calculator.minus = function(a ,b) {return a - b};

var calc1 = new Calculator();

calc1.plus(100)
calc1.minus(20);
calc1.plus(10);
console.log(calc1.result);

var r1 = Calculator.plus(100,200)
var r2 = Calculator.minus(100,200)
console.log(r1, r2);

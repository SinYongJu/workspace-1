"use strict"

function Calculator(){
  this.result = 0;

  this.plus = function(value){ this.result += value }
  this.minus = function(value){ this.result -= value }
  this.mul = function(value){ this.result *= value }
  this.div = function(value){ this.result /= value }
}

var aaa = new Calculator();

aaa.plus(20);
console.log(aaa.result);
console.log('-------------------');

function Cal (name, kor, eng, math) {
  this.name = name;
  this.kor = kor;
  this.eng = eng;
  this.math = math;
  this.sum = kor + eng + math;
  this.avg = (kor + eng + math) / 3;
  // this.getsum = function(kor, eng , math) {
  //   return kor + eng + math;
  this.getsum = function() {
      return kor + eng + math};
}

var calcu = new Cal('길',10 ,20, 30);
// console.log(calcu.getsum(10,12,12));
console.log(calcu.getsum());
console.log(calcu);

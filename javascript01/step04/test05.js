"use strict"

function f1() {
  console.log("okok");
}

var f2 = function() {
  console.log("익명함수....");
}

var f3 = function() {
  console.log("익명함수2....");
}

var f4 = function ok() {
  console.log("일반함수인데 익명함수처럼 변수에 저장할 수 있다.");
}

f1();
f2();
f3();
f4();

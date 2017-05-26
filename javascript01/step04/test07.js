"use strict"

var f1 = function (){
  console.log("익명함수...");
}

//ECMAScript 2015 버전에서 추가된
var f2 = () => {
  console.log("Arrow 함수");
}

var f3 = () => console.log("Arrow 함수 2");

f1();
f2();
f3();

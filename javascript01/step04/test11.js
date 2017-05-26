"use strict"

function caller(f){
  var value = f(20, 30);
  console.log(value);
}

function plus(a, b) {
  return a + b;
}

caller(plus);

var plus2 = function(a, b) {
  return a + b;
}

caller(plus2)

caller(function plus3(a, b) {
  return a + b;
});

caller(function(a, b) {
  return a + b;
});

//ECMAScript 2015 부터 익명함수를 간단하게 저의할 수 있는 문법 제공.
//Arrow function
caller((a, b) => {
  return a + b;
});

caller((a, b) => {return a + b;});

caller((a, b) => a + b);

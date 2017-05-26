"use strict"

function calculator(op) {
  switch (op) {
    case "+":
      return function(a, b) {
        return a + b;
      };
    case "-":
      return function(a, b) {
        return a - b;
      };
  }
}

var f = calculator("+");

var value = f(10, 20);
console.log(value);

f = calculator("-");
value = f(10 ,20);
console.log(value);

/* 실무에서는 리턴 받은 함수를 바로 사용하는 경우가 많다. */
calculator("-")(10 , 20);
console.log(value);

console.log(calculator("-")(10 , 20));

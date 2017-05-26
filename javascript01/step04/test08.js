"use strict"

var f1 = () => "hello";

var value = f1();
console.log(value);

var f2 = () => console.log("okok");
var value = f2();
console.log(value);

var f3 = () => {
  console.log("----------");
  console.log("f3() 호출됨");
  console.log("Arrow 함수임");
  return "Hello2";
}

value = f3();
console.log(value);

//파마라미터를 받는 Arrow함수
var f4 = (a, b) => a + b;
value = f4(10, 20);
console.log(value);

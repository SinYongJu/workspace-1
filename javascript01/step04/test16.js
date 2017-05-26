"use strict"

var v1 = 100;
function f1(){
  console.log("f1(): " +v1);

  v1 = 200;
}

console.log(v1);
f1();
console.log(v1);

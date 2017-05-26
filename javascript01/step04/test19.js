"use strict"

function f1(){
  console.log("f1().. 호출됨");
  for(var i = 0; i < 1000000000; i++){
    var d = 3.1415792;
    var d2 = 3456.987;
    var result = d / d2 / d2 / d2 / d;
  }
}

f1();
console.log("Hello~~");

"use strict"

var prompt = require('prompt');

//prompt 시작
prompt.start();

prompt.get(['a','b'], function(err, result) {
  console.log("입력 값 출력 ---------------");
  console.log(result.a, result.b);
});
console.log("Hahahaahhaahahahahahhahahahaha");

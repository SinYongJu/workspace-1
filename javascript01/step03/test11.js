/*흐름제어문 -연습
 -사용자로부터 숫자 a,b와 연산자 op값을 받아서
  계산 결과를 출력하는 프로그램을 작성하라
  >node test11.js
    prompt: a: 10
    prompt: b: 20
    prompt: op: -
    계산결과:
    10 - 20 = -10
  */
"use strict"

//모듈 가져오기
var prompt = require('prompt');

//prompt 시작
prompt.start();

prompt.get(['a','b','op'], function (err, result) {
  var a = parseInt(result.a);
  var b = parseInt(result.b);
  var op = result.op;

  console.log('계산결과');
  if(op == '+')
    console.log('%d + %d = %d', a, b, a + b);
  else if(op == '-')
    console.log('%d - %d = %d', a, b, a - b);
  else if(op == '*')
    console.log('%d * %d = %d', a, b, a * b);
  else if(op == '/')
    console.log('%d / %d = %d', a, b, a / b);
  else if(op == '%')
    console.log('%d % %d = %d', a, b, a % b);
  else {
    console.log("알수 없는 기호입니다.");
  }

});

"use strict"

//모듈 가져오기
var prompt = require('prompt');

//prompt 시작
prompt.start();

prompt.get(['a','b'], function (err, result) {
  var a = parseInt(result.a);
  var b = parseInt(result.b);

  console.log('계산결과');
  console.log('a + b ' , a + b);
  console.log('a - b ' , a - b);
  console.log('a * b ' , a * b);
  console.log('a / b ' , a / b);
  console.log('a % b ' , a % b);

});

"use strict"

//모듈 가져오기
var prompt = require('prompt');


//prompt 시작
prompt.start();


prompt.get(['name','tel'], function (err, result) {
  console.log('입력결과');
  console.log('이름= ' + result.name);
  console.log('전화번호= ' + result.tel);
});

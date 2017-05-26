"use strict"

/* 별찍기???
  node test17.js
  prompt: step: 5
  5*1 = 5
  5*1 = 10
  ...
  5*9 = 45
*/

var prompt = require('prompt');

//prompt 시작
prompt.start();

aaa();

function aaa(){
  prompt.get(['step'], function (err, result) {
  var step = parseInt(result.step);

  for (var i=1; i<=9; i++){
    console.log(step + " * " +  i + " = " + step*i);
  }
    bbb();
  });
}

function bbb() {
  console.log("다시 하시려면 YES를 눌러주세요.");
  prompt.get(['step2'], function (err, result) {
  var step2 = result.step2;
  if(step2 =="yes")
    aaa();
});
}

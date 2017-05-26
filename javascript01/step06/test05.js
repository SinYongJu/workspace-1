//setTimeout(callback, delay[,... args])
//           ㄴ지정된 시간이 지나면 호출
'use strict'

var count = 0;
var timer = setInterval(function() {
  //let timer2= timer;
  console.log("1초 지났음!");
  if(++count == 10){
    clearInterval(timer);
  }
}, 1000) // 비동기 방식 호출 3초 후에 호출될 함수를 등혹 후 바로 리턴한다.
//var timer2 = timer;
timer = 'ok';
console.log(timer);

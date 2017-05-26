//setTimeout(callback, delay[,... args])
//           ㄴ지정된 시간이 지나면 호출

function f1() {
  console.log("1초 지났음!");
}
setTimeout(f1, 1000); // 비동기 방식 호출 1초 후에 호출될 함수를 등혹 후 바로 리턴한다.

console.log('첫 번쨰 타임아웃 함수를 심었다.');
setTimeout(function() {
  console.log("3초 지났음!");
}, 3000) // 비동기 방식 호출 3초 후에 호출될 함수를 등혹 후 바로 리턴한다.

console.log('두 번쨰 타임아웃 함수를 심었다.');

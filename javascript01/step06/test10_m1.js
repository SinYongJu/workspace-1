/* 모듈 안에서 모듈 밖의 변수를 사용할 수 있는가?
*/
'use strict'

//v1 = 200;
var v1 = 200;
console.log('test10_m1.js => v1 :',v1);
//module esports에 아뭇것도 넣지 않으면 빈객체를 반환

global.v2 = 200;
global.v3 = 300;
console.log('test10_m1.js => global.v2:', global.v2);

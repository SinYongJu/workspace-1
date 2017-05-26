/*모듈 만들기
  모듈 정의
    -> test06_m1.js
    -> test06_m2.js
  모듈 사용
*/
'use strict'

var m1 = require('./test06_m1.js');
console.log(m1.plus(10,20));
console.log(m1.minus(10,20));
console.log(m1.multiple(10,20));
//console.log(m1.divide(10,20));

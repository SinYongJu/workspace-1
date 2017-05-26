/* exports 객체를 다른 객체로 대체하기
*/
'use strict'

var m1 = require('./test07_m1.js');
console.log(m1.plus(10,20));
console.log(m1.minus(10,20));
console.log(m1.multiple(10,20));
console.log(m1.divide(10,20));

//require()가 리턴한 객체에서 plus(), minus() 함수 주소만 꺼내서 저장
var {plus, minus} = require('./test07_m1.js');
/*
var plus = require('./test07_m1.js').plus
var minus = require('./test07_m1.js').minus

var m = require('./test07_m1.js')
var plus = m.plus
var minus = m.minus
*/

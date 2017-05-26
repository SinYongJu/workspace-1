/*모듈 만들기
  모듈 정의
    module.exports
*/
'use strict'

function plus(a,b){return a+b}
function minus(a,b){return a-b}
function multiple(a,b){return a*b}
function divide(a,b){return a/b}

module.exports.plus = plus;
exports.minus = minus;
exports.multiple = multiple;
//module.exports.divide = divide;

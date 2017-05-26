"use strict"

var obj = {}
obj.result = 10;

//read only!
//객체를 전문적으로 조작 (read only 사용가능)
Object.defineProperty(obj, 'result2', {
  value: '100'
})

console.log(obj.result);
console.log(obj.result2);
console.log('----------------------');

obj.result = 20;
console.log(obj.result);
obj.result2 = 200;
console.log(obj.result2);

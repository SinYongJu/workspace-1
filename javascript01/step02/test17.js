//delete 연산자

"use strict"

var v1 = 100;
console.log(v1);

// delete v1; 객체에 속하지 않은 변수는 사용 X
// console.log(v1);

var obj = {}
obj.v1 =100;
console.log(obj.v1);

delete obj.v1; //객체에 소속된 변수는 delete 가능
console.log(obj.v1);

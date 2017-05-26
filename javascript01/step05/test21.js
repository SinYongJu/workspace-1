/* 주제: 객체 - 배열에서 여러 개의 항목 받기*/

"use strict"

// 1)
var a = 10;
var b = 20;
var c = 30;
console.log(a, b, c);

// 2)
var i = 10, j = 20, k = 30;
console.log(i, j, k);

// 3)
 var [x,y,z] = [10 ,20 ,30, 40, 50];
console.log(x, y, z);

var obj = {
  name: '홍길동',
  age: 20,
  tel: '1111-1111',
  email: 'host@test.com'
}
/*
var name = obj.name;
var age = obj.age;
*/
var {name, age} = obj;
console.log(name, age);

var {age, email} = obj;
console.log(age, email);

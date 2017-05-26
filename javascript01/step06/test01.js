//Object

//1. 함수 사용
var obj1 = {};
console.log(obj1);

var obj2 = new Object();
console.log(obj2);

var obj2 = {
  name : '홍길동',
  age : 20
}

//2. 인스턴스 함수
console.log(obj2.hasOwnProperty('name'));
console.log(obj2.hasOwnProperty('age'));
console.log(obj2.hasOwnProperty('tel'));

//3. 함수
var obj3 = Object.create(null);
console.log(obj3);

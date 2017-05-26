"use strict"


// if(x == undefined){
//   console.log("x는 undefined이다");
//}
var v0;
if(v0 == undefined) console.log("v0는 변수는 존재하지만 값이 없는 상태이다.");

var v1 = 20; // 변수는 존재하되, 값을 지정하지 않아 타입이 정의되지 않음
v1 = undefined;
if(v1 == undefined) console.log("v1는 변수는 존재하지만 값이 없는 상태이다.");

v1 = 3;
if(v1) console.log("v1는 ?이다.");

var v2 = null;
console.log("v2의 타입 =",typeof v2);
if(v2==null) console.log("v2는 NULL이다.");

var v3 = NaN;
console.log("v3의 타입 =",typeof v3);
if(v2==NaN) console.log("v3는 NaN이다.");

if(isNaN(v3)) console.log("v3는 isNaN(v3) == true이다.");

var v4 = Infinity;
if(v4 == Infinity) console.log("v4는 Infinity이다.");

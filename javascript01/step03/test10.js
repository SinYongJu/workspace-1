"use strict"

switch (NaN) {
    case "문자열1":
      console.log("문자열 가능!");
      break;
    case 1:
      console.log("숫자 가능");
      break;
    case 3.14159:
      console.log("부동소수점 가능");
      break;
    case true:
      console.log("boolean 값 가능");
      break;
    case undefined:
      console.log("undefined 가능");
      break;
    case null:
      console.log("null 가능");
      break;
    case NaN: //isNaN
      console.log("NaN 가능");
      break;

}
console.log("----------------------------------------------");

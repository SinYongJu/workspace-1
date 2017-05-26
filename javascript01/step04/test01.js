"use strict"

function hr() {
  console.log(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
}

var a = 10;
if ((a % 2) == 0)
  console.log("짝수입니다.");
hr(); // hr() 함수를 사용 = "hr() 호출"

a = 11;
if ((a % 2) != 0)
  console.log("홀수입니다.");
hr();

/*
  주제: 예외처리 try ... catch ...
  => throw 명령어가 던지는 예외 정보를 받아서 처리하는 문법
  => 목적?
    예외가 발생하더라도 시스템을 멈추지 않고 계속 실행하게 만드는 것.
*/

"use strict"

function divide(a, b) {
  if(b == 0)
    throw {errorCode: 400 , message: '0으로 나눌 수 없다.'}
  return a/b
}

try{
  // throw 명령어로 예외를 던지는 함수를 호출할 떄는 항상 try 블록안에서 호출
  var result = divide(12121212 , 0)
  console.log(result);
} catch (error) {
  //try에서 예외가 발생시, 시스템을 멈추지 않고 catch 실행
  console.log(error.message);
}

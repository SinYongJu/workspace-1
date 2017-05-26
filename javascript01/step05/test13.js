/**/
"use strict"

var obj = {
  v1 : 0,
  f1 : function() {
    // 이 함수가 소속된 객체의  v1 변수를 사용할 때,
  this.v1 = 100;
  }
}

obj.f1();
console.log(obj.v1);
console.log('----------------');

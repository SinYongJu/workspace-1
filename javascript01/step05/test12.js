/**/
"use strict"

function f1() {
  console.log(this);
}

new f1(); //this 생성 O

f1(); // this 생성 X

function f1() {
  console.log(this);
}

var obj = {
  f2 : function () {
    console.log(this);
  }
}

//obj.f1();// 오류 f1()은 obj 객체에 포함X 그래서 this 변수 넘길 수 없음

new f1();

//f2() 실행오류

var obj = {
  f2 : function () {
    console.log(this);
  }
}
obj.f2();

f2();

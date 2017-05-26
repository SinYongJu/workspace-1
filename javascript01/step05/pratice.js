"use strict"

function info(name, kor, eng, math){
  return{
    name : name,
    kor : kor,
    eng : eng,
    math : math,
    sum : kor + eng + math,
    avg : (kor + eng + math) / 3
  }
}

var info2 = [
  info('홍길동', 80, 70 ,80),
  info('임꺽정', 70 , 50 ,40)
]

console.log(info2);

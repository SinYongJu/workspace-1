/* 주제: 함수  -연습
-----------------------------------
  prompt: command: list
     [학생 성적 목록]  점수  합계 평균
  0: "홍길동", 100, 90, 80 , 270, 90
  1: "홍길동", 100, 90, 80 , 270, 90
  2: "홍길동", 100, 90, 80 , 270, 90
  3: "홍길동", 100, 90, 80 , 270, 90
-----------------------------------
  prompt: command : add
  학생 성적 입력
  prompt: name: 홍길동5
  prompt: kor : 100
  prompt: eng : 100
  prompt: math: 100
  성적
  이름: 홍길동5
  국어: 100
  영어: 100
  수학: 100
  합계: 300
  평균: 100

  prompt: command: list
    [학생 성적 목록]   점수  합계 평균
  0:  "홍길동", 100, 90, 80 , 270, 90
  1:  "홍길동", 100, 90, 80 , 270, 90
  2:  "홍길동", 100, 90, 80 , 270, 90
  3:  "홍길동", 100, 90, 80 , 270, 90
  4:  "홍길동", 100,100,100 , 300,100
  --------------------------
  prompt: command: delete
  prompt: no: 2
  "홍길동"의 정보가 삭제되었습니다.
  ----------------------------
    [학생 성적 목록]   점수  합계 평균
  0:  "홍길동", 100, 90, 80 , 270, 90
  1:  "홍길동", 100, 90, 80 , 270, 90
  2:  "홍길동", 100, 90, 80 , 270, 90
  3:  "홍길동", 100,100,100 , 300,100
  -----------------------------
  prompt: command: quit
  안녕히가세요!
  >
*/

"use strict"

var prompt = require('prompt');
var studentList =[
  ['홍길동1',100,100,100,300,100],
  ['홍길동2',90,90,90,270,90],
  ['홍길동3',80,80,80,240,80],
  ['홍길동4',70,70,70,210,70],
  ['홍길동5',60,60,60,180,60]];

var commandHandlerMap = {
  'quit' : doQuit,
  'list' : doList,
  'add' : doAdd,
  'delete': doDelete
}

prompt.start();

inputCommand();

function inputCommand(){
  prompt.get(['command'], function(err, result) {
    var handler = commandHandlerMap[result.command]
    if (handler) {
      handler();
    }
    else
      doDefault();
  });
}

function doQuit() {
  console.log('안녕히 가세요!');
}

function doList() {
    console.log('[학생목록]');
    var count = 0;
    for (var student of studentList) {
      console.log(count++ +
        student[0] + "," +
        student[1] + "," +
        student[2] + "," +
        student[3] + "," +
        student[4] + "," +
        student[5]);
    }
    inputCommand();
}

function doAdd() {
  console.log("[학생입력]");
  prompt.get(['name', 'kor', 'eng', 'math'], function (err, result) {
    var student =[result.name,
      parseInt(result.kor),
      parseInt(result.eng),
      parseInt(result.math)];
      student[4] = student[1] + student[2] + student[3];
      student[5] = student[4] / 3;

      studentList[studentList.length] = student;
      console.log('입력 되었습니다.');
      console.log('------------------------');
      inputCommand();
  });
}

function doDelete() {
  console.log('[학생삭제]');
  prompt.get(['no'],function (err, result) {
    var no = parseInt(result.no);
    if(studentList.length == 0 ){
      console.log('삭제할 항목이 없습니다.');
      inputCommand();
      return;
    }

    if(no < 0 || no >= studentList.length){
      console.log("학생 번호가 옳지 않습니다.");
      inputCommand();
      return;
    }
    studentList.splice(no, 1);
    console.log('삭제했습니다.');
    console.log('------------------------');
    inputCommand();
  });
}

function doDefault() {
  console.log('해당 명령은 지원하지 않습니다.');
  inputCommand();
}

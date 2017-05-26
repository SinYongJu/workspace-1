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
var arr = [];
arr = [["홍길동1",100,90,80,270,90],
       ["홍길동2",94,87,74,255,85],
       ["홍길동3",93,80,86,259,86],
       ["홍길동4",92,100,82,274,91]];

var eventHendler ={
  'list' : list,
  'add' : add,
  'delete' : del,
  'quit' : quit
}
//prompt 시작
prompt.start();

start();

function start() {
  prompt.get(['command'], function(err, result) {
      var command = eventHendler[result.command];

      if(command){
        command();
      }
      else{
        console.log('실행ㄴ 할 수 없는 명령어입니다.');
        start();
      }
    });
};

function list() {
  var countNum = 0;
  var arrnum = arr.length;
  var count = 0;

    console.log("[학생 성적 목록] ");
    for (var j = 0; j <= arrnum; j++) {
      if(arr[j] != undefined){
        console.log(countNum+": "+arr[j]);
        countNum++;
      }
    }
    console.log("------------------------------");
    start();
}

function add() {
  var arrnum = arr.length;

  prompt.get(['name','kor','eng','math'], function(err, result) {
      var name = result.name;
      var kor = parseInt(result.kor);
      var eng = parseInt(result.eng);
      var math = parseInt(result.math);

      arr[arrnum] = [name, kor, eng, math,(kor+eng+math),((kor+eng+math)/3)];

      // console.log("성적");
      // console.log("이름: " + arr[arrnum][0]);
      // console.log("국어: " + arr[arrnum][1]);
      // console.log("영어: " + arr[arrnum][2]);
      // console.log("수학: " + arr[arrnum][3]);
      // console.log("합계: " + arr[arrnum][4]);
      // console.log("평균: " + arr[arrnum][5]);
      // console.log("------------------------------");
      start();
     });
}

function del() {
    prompt.get(['no'], function(err, result) {
        var no = parseInt(result.no);
        var arrnum = arr.length;

        if(arrnum == 0){
          console.log('삭제할 항목이 없습니다.');
          start();
          return;
        }

        if(no < 0 || no >= arrnum){
          console.log("학생 번호가 옳지 않습니다.");
          start();
          return;
        }

        arr.splice(no,1);
        console.log('삭제 되었습니다.');
        console.log('-------------------');
        start();
    });
}

function quit(){
  console.log("안녕히가세요!");
}

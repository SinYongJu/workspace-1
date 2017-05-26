/* 주제: NodeJS 빌트인 글로벌 변수 */
'use strict'

//node가 실행하는 파일의 디렉토리 경로
console.log(__dirname);

//node가 실행하는 파일의 경로
console.log(__filename);

//path 모듈 사용법
const path = require('path')
console.log(path.join('c:/workspace/', 'javascript01/', 'step05/', 'test01.js'));
//path.join() 사용의 이점: 앞의 경로에 '/'가 붙었으면, 두의 경로르 붙일 때 '/'를 안붙인다.
//앞의 경로에 '/'가 안붙었으면 뒤의 경로에 붙일 때 '/'를 자동으로 붙인다
console.log(path.join(__dirname, 'test01.js'));

//경로를 붙일 떄, 상위 폴더로 인동하는 '..' 명령이나
//현재 폴더를 의마히는 '.' 명령을 자동으로 처리하여 계산한다.
console.log(path.join(__dirname, '../../electron01/step04/main.js'));

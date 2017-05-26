/*주제: Electron 모듈 가져오기
-Electron은 크로스 플랫폼을 지원하는 데스크탑 애플리케이션을
만들 떼 사용하는 NodeJS용 자바스크립트 프레임워크이다.
HTML, CSS, JavaScript를 사용하여 윈도우 프로그래밍을 한다.
-내부적으로 오픈소스 웹브라우저 컴포넌트인 Chromium과 NodeJS를 사용하여 실행한다.
-Chromium은 구글 크롬(chrome) 브라우저의 오픈소스판이다.
-사용법:
1) 노드 패키지 관리자(npm)를 사용하여  Electron 모듈을 가져온다.
  > npm install electron -g <---- 글로벌로 설치
  >electron -v <---- 버전확인
2) Electron을 사용해서 윈도우 생성
  => package.js - 프로그램 설정 파일
  => main.js - 자바스크립트 실행 시작 파일
  => index.html -  메인 윈도우 설정 파일
3) 실행
  => electron .
  =>현재 폴더에서 package.json 파일에 동록된 자바스크립트 파일을 읽어 실행한다.
*/
const {app, BrowserWindow} = require('electron')// npm으로 설치한 모듈은 이름만 지정하면 됨
const path = require('path')

//윈도우 객체의주소를 저장할 변수
let win

/*app.on(이벤트명, 콜백함수(이벤트 리스너))
 *이벤트는 애플리케이션의 실행 상태를 가리킨다
 *리스너 = 이벤트리스너 = 이벤트 핸들러 = 콜백함수
 *어떤 객체의 실행이 특정상태에 놓일 때 자동으로 호출되는 함수
 *이벤트가 발생할 때, 호출되는 함수
 *이 함수가 하는 일은 이벤트에 따라 적절한 작업을 처리 그래서 '이벤트를 다루는 자'
*/
//application이 실행할 준비를 마쳤으면, 윈도우를 생성하는 함수 호출
app.on('ready', createWindow)
//모든 윈도우가 닫았을 때 보통 애플리케이션을 종료한다.
app.on('window-all-closed', quitApp)


//윈도우 생성 후 출력하는 함수
function createWindow() {
  console.log('윈도우 생성하기...');
}

//앱을 종료시키는 함수
function quitApp() {
  console.log('애플리케이션 종료하기');
}

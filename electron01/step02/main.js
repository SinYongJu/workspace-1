/*주제: 윈도우생성하기

*/
const {app, BrowserWindow} = require('electron')// npm으로 설치한 모듈은 이름만 지정하면 됨

//윈도우 객체의주소를 저장할 변수
let win

//application이 실행할 준비를 마쳤으면, 윈도우를 생성하는 함수 호출
app.on('ready', createWindow)


//윈도우 생성 후 출력하는 함수
function createWindow() {
   win = new BrowserWindow({width: 500, height: 400})
}

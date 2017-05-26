/*주제: 윈도우생성하기

*/
const {app, BrowserWindow} = require('electron')
const path = require('path')

let win

app.on('ready', createWindow)

function createWindow() {
   win = new BrowserWindow({width: 800, height: 600})
   win.loadURL(path.join('file://', __dirname,  '../../index.html'))
}

console.log(path.join('file://', __dirname,  '/index.html'));
/*
index.html 파일의 경롤르 + 연산자를 사용하여 문자열을 연결하는 방식으로 지정했다.
index.html 경로를 path 객체의 join() 기능을 이용하여 처리했다.
문제점 : URL의 표기형식을 준수하고 있지 않다.
=> URL은 항상 슬래시 '/'로 표현해야 한다.
=> 프로토콜 명 다음에 '://'가 와야 한다.
URI(Uniform Resource Identifier)
인터넷의 자원(파일 또는 컴퓨터) 위치를 표현하는 공통 표기법
1)URN(Uniform Resource Name)
2)URL(Uniform Resource Locator)
*/

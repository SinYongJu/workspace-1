/*주제: 윈도우생성하기

*/
const {app, BrowserWindow} = require('electron')
const path = require('path')
const url = require('url') //url 경로를 쉽게 다루기 위한 모듈

let win

app.on('ready', createWindow)

function createWindow() {
   win = new BrowserWindow({width: 800, height: 600})
   var htmlURL = url.format({
     protocol : 'file:', //http, https
     pathname: path.join(__dirname, 'index.html'),
     slashes: true
   });
   console.log(htmlURL);
   win.loadURL(htmlURL)
}

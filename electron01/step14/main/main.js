/* 주제: 응용 II
=> 비지니스 로직을 분리하여 xxx-service.js 파일에 담는다.
 */
const {app, BrowserWindow} = require('electron')
const path = require('path')
const url = require('url')

const datasource = require('./util/datasource')
const connection = datasource.getConnection()

const studentDao =require('./dao/student-dao')
studentDao.setConnection(connection)

const memberDao = require('./dao/member-dao')
memberDao.setConnection(connection)

const studentService = require('./service/student-service')
studentService.setMemberDao(memberDao)
studentService.setStudentDao(studentDao)

// global 빌트인 객체에 값을 보관하면, renderer 프로세스()에서 꺼내 쓸 수 있다.
global.studentService = studentService
let win

app.on('ready', createWindow)

function createWindow() {
  win = new BrowserWindow({width: 800, height: 600})
  win.loadURL(url.format({
    protocol: 'file:',
    pathname: path.join(__dirname, '../renderer/index.html'),
    slashes: true
  }))
  //win.webContents.openDevTools() // 웹브라우저의 개발도구창을 띄운다.

}
//



//

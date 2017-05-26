/*주제: 윈도우생성하기*/

const {app, BrowserWindow} = require('BrowserWindow')
const {path} = require('path')

let win

app.on('ready', windowCreate)

function windowCreate() {
  win = new browserWindow(width 800, hright:600)
  win.loadURL(url.format({
      protocol: 'file:',
      pathname: path.join(__dirname, index.html)
      slashes: true
  }))
}

"use strict"
const net = require('net')
window.$ = window.jQuery = require('jquery')

var host = $('#host'),
    port = $('#port'),
    textarea = $('#textarea'),
    chat = $('#chat'),
    nickname = $('#nickname'),
    connection = $('#connection')

var socket = new net.Socket()
var str = "";
connection.click(() => {
  socket.connect(parseInt(port.val()), host.val())
  // socket.setTimeout(500)
})

$('#send').click(() => {
  var obj ={
    'nickname': nickname.val(),
    'chat': chat.val()
  }
  socket.write(JSON.stringify(obj) +'\n')
})

var buffer = "";

socket.on('data', (data) => {
  buffer += data.toString();
    str = str + data + "\n"
    textarea.val(str)
  // 줄바꿈 코드를 찾아서 값을 추출한다.

  while (true) {
    var newLineIndex = buffer.indexOf('\n')
    if(newLineIndex < 0){ // 주바꿈 코드가 없다면,
      return;  // 아직 데이터를 다 받지 못했다는 의미이다. 다음 데이터를 받을 때 계속한다.
    }

    // 줄바꿈 코드 앞에 문자열과 줄바꿈 코드 뒤의 문자열을 분리한다.
    // => 줄바꿈 코드 뒤의 문자열은 다시 버퍼에 담는다.
    var value = buffer.substring(0, newLineIndex);
    buffer = buffer.substring(newLineIndex + 1)

    if(value.length > 0)
      break;
  }
  result.val(value);
})

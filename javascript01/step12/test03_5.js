/*
요청벙보 다루기
=> 계산기 서비스를 구현하라
요청예) http://localhost:8888.calculator?a=100&b
*/

const http = require('http')

const url = require('url')

const server = http.createServer(function (request, response) {
  if(request.url == '/favicon.ico'){
    response.end();
    return;
  }
  console.log('클라이언트 요청이 들어왓네');
  
  response.writeHead(200, {
    'Content-Type' : 'text/html;charset=UTF-8'
  })
  response.write(name +'안녕하세요!')
  response.end();

})

var urlInfo = url.parse(request.url, true)

  if(urlInfo.pathname != '/hello'){
    response.end('잘못된 url 입니다.')
    return
  }

  var name = urlInfo.query.name

  server.listen(8888)

console.log("서버 실행 중...");

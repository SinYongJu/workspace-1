/* 응답 데이터의 콘텐츠 타입을 지정하기
  => 서버가 클라이언트에게 보내는 데이터가 어떤 형식인지
  HTTP 응답 헤더를 통해 알려준다.
  => Content-Type : text/plain;charset=UTF-8
 */

// !) HTTP 모듈로딩

const http = require('http')


const server = http.createServer(function (request, response) {
  console.log('클라이언트 요청이 들어왓네');

  response.writeHead(200, {
    'Content-Type' : 'text/plain;charset=UTF-8'
  })

  response.write('Hello World')
  response.write('안녕하세요')
  response.end();
})


server.listen(8888)

console.log("서버 실행 중...");

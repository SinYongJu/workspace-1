/* 클라이언트에게 응답하기 */

// !) HTTP 모듈로딩

const http = require('http')


const server = http.createServer(function (request, response) {
  console.log('클라이언트 요청이 들어왓네');

  response.end()
})


server.listen(8888)

console.log("서버 실행 중...");

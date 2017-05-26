/* HTTP  서버 만들기 */

// !) HTTP 모듈로딩

const http = require('http')

// 2) httpserver 객체 생성
// => 파라미터는 클라이언트 요청이 들어왔을 때, 호출될 함수이다.
// => 즉 클라이언트에서 요청이 들어오면 파라미터로 넘긴 함수를 호출한다.

const server = http.createServer(function (request, response) {
  console.log('클라이언트 요청이 들어왓네');
})

// 3) 서버 실행
server.listen(8080)

console.log("서버 실행 중...");

/* 싱글스레드 방식 */

// !) HTTP 모듈로딩

const http = require('http')

const url = require('url')

const server = http.createServer(function (request, response) {

  if(request.url == '/favicon.ico'){
    response.end();
    return;
  }
  console.log('클라이언트 요청이 들어왓네');

  // 요청 URL 추출
  console.log('url =',request.url);

//url http://localhost:8888/aaa/bbb/ccc.html?v1=xxxx&v2=yyy&v3=zzz

// parse()의 두번째 파라미터 값을 true로 설정하면, 개발자가 뽑아
// 쓰기 쉽도록 query 문자열을 잘라서 정리해 둔다.

  var urlInfo = url.parse(request.url, true)
  console.log("query=", urlInfo.query);
  console.log('v1=', urlInfo.query.v1);
  console.log('v2=', urlInfo.query.v2);
  console.log('v3=', urlInfo.query.v3);

  response.writeHead(200, {
    'Content-Type' : 'text/html;charset=UTF-8'
  })
  response.write('안녕하세요!')
  response.end();

})


server.listen(8888)

console.log("서버 실행 중...");

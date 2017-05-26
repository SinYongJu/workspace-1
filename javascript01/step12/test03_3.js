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
  var urlInfo = url.parse(request.url)
  console.log('href =', urlInfo.href);
  console.log('pathname =',urlInfo.pathname );
  console.log("search=",urlInfo.search);
  console.log("query=", urlInfo.query);

  response.writeHead(200, {
    'Content-Type' : 'text/html;charset=UTF-8'
  })
  response.write('안녕하세요!')
  response.end();

})


server.listen(8888)

console.log("서버 실행 중...");

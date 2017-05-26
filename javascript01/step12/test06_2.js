/*
POST요청으로 대량의 데이터를 보낼 수 있기 때문에 서버쪽에서도 대량의 데이터를
받는 방식으로 처리한다.
*/

const http = require('http')
const url = require('url')
const qs = require('querystring')// name=123321&age=312&tel=312 행태의 문자열 분석

const server = http.createServer(function(request, response) {
  var urlInfo = url.parse(request.url, true)
  if(urlInfo.pathname != '/post.do'){
    response.end()
    return
  }
  response.writeHead(200, {
    'Content-Type' : 'text/plain;charset=UTF-8'
  })
// 1)post요청으로 들어온 데이터를 저장할 변수
  var buf = ''

// 2) Post 요청 데이터를 읽을 때마다 'data' 이벤트가 발생하는데,
// 이 이벤트를 처리해야 한다.
// 즉 데이터를 읽을 때 마다, 그 읽은 데이털르 buf 변수에 저장시킨다.

  request.on('data',(data) => {
    buf += data
  })

// 3) post요청 데이터 읽기를 마쳤으면, 'end'이벤트가 발생
// 따라서 'end' 이벤트가 발생했을때, 클라이언트 요청 처리
  request.on('end',()=> {

    var params = qs.parse(buf)
    response.write('name = ' + params.name + '\n')
    response.write('age = ' + params.age + '\n')
    response.write('tel = ' + params.tel + '\n')
    response.end()
  })

})
server.listen(8888)

console.log("서버 실행 중...")

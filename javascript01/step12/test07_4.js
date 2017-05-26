/* 기존 코드에 새 서비스 추가 II
=> 한 개의 서비스를 한 함수로 묶자!
  코드를 해석하기 쉽게 하자
*/
const http = require('http')
const url = require('url')
const qs = require('querystring')

var handlerMapping = {}

handlerMapping['/get.do'] = (request, response) => {
  response.write("GET 요청 처리! \n")
  response.write('name =' + request.query.name + '\n')
  response.write('age = ' + request.query.age + '\n')
  response.write('tel = ' + request.query.tel + '\n')
  response.end();
}

handlerMapping['/post.do'] = (request, response) => {
  var buf = ''

  request.on('data',(data) => {
    buf += data
  })
  request.on('end',()=> {
    var params = qs.parse(buf)
    response.write("POST 요청 처리! \n")
    response.write('name = ' + params.name + '\n')
    response.write('age = ' + params.age + '\n')
    response.write('tel = ' + params.tel + '\n')
    response.end()
  })
}

handlerMapping['/hello.do'] = (request, response) => {
  response.write('안녕하세요!')
  response.end()
}

function notfound(request, response) {
  response.write('해당 url을 지원하지 않습니다.')
  response.end()
}



const server = http.createServer(function(request, response) {
  var urlInfo = url.parse(request.url, true)
  if(request.method == "GET"){ //get 요청일대만 파라미터 값을 request로 보관
    request.query = urlInfo.query
  }
  response.writeHead(200, {
    'Content-Type' : 'text/plain;charset=UTF-8'
  })

  var fn = handlerMapping[urlInfo.pathname]
  if(fn != undefined){
    fn(request, response)
  } else {
    notfound(request, response)
  }
})
server.listen(8888)

console.log("서버 실행 중...")

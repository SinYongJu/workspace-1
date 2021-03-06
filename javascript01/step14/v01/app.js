/* express 프레임워크 적용
*/

var express = require('express')

// POSt 요청 파라미터 값을 처리할 모듈 로딩
var bodyParser = require('body-parser')
var app = express()

// 정적 자원이 저장된 폴더를 지정한다.
app.use(express.static('public'))

//post 요청 파라미터를 처리할 body-parser 모듈을 express에 등록하기
app.use(bodyParser.urlencoded({ extended: false }))


app.get('/get_test.do', function (request, response) {
  response.writeHead(200,{'Content-Type': 'text/plain;charset=UTF-8'})
  response.write('get 요청처리\n')
  response.write('name = ' + request.query.name +'\n')
  response.write('age = ' + request.query.age +'\n')
  response.write('tel = ' + request.query.tel +'\n')
  response.end()
})

app.post('/post_test.do', function (request, response) {
  response.writeHead(200,{'Content-Type': 'text/plain;charset=UTF-8'})
  response.write('post 요청처리\n')
  response.write('name = ' + request.body.name +'\n')
  response.write('age = ' + request.body.age +'\n')
  response.write('tel = ' + request.body.tel +'\n')
  response.end()
})



app.listen(8888, function () {
  console.log('서버가 시작되었습니다.');
})

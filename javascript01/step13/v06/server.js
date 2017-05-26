/* express 프레임워크 적용
*/

var express = require('express')

var app = express()

// 정적 자원이 저장된 폴더를 지정한다.
app.use(express.static('public'))


app.get('/get_test.do', function (request, response) {
  response.writeHead(200,{'Content-Type': 'text/plain;charset=UTF-8'})
  response.write('get 요청처리')
  response.write('name = ' + request.query.name)
  response.write('age = ' + request.query.age)
  response.write('tel = ' + request.query.tel)
  response.end()
})

app.post('/post_test.do', function (request, response) {
  response.writeHead(200,{'Content-Type': 'text/plain;charset=UTF-8'})
  response.write('post 요청처리')
  response.write('name = ' + request.query.name)
  response.write('age = ' + request.query.age)
  response.write('tel = ' + request.query.tel)
  response.end()
})



app.listen(8888, function () {
  console.log('서버가 시작되었습니다.');
})

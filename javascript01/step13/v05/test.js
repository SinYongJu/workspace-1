/* get, post 요청 처리 테스트  */
var miniExpress = require('./mini-express')

var app = miniExpress()

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

/* express 프레임워크 적용
*/

var express = require('express')

// POSt 요청 파라미터 값을 처리할 모듈 로딩
var bodyParser = require('body-parser')

//템플릿 엔진을 통합하여 관리해주는 모듈
var cons = require('consolidate');
var path = require('path')
//사용할 템플릿 엔진 모듈 로딩
// var handlebars = require('handlebars')
var app = express()

// 정적 자원이 저장된 폴더를 지정한다.
app.use(express.static('public'))

//post 요청 파라미터를 처리할 body-parser 모듈을 express에 등록하기
app.use(bodyParser.urlencoded({ extended: false }))
var router = require('./aa')
app.use('/aa', router) // /aa 경로에대한 요청을 처리할 담당자를 설정한다.
// 템플릿 엔진을 등록
app.engine('html', cons.handlebars)
// Express에서 HTML을 출력할 때 사용할 엔진을 지정
app.set('view engine', 'html')
//템플릿 파일이 있는 경로지정
app.set('views', path.join(__dirname, '/templates'))


app.get('/test.do', function (request, response) {
  response.render('test', {name: "홍길동"})
})

app.get('/test2.do', function (request, response) {
  response.render('test2', {name: ['홍길동','임꺽정','유관순']})
})

app.get('/test3.do', function (request, response) {
  response.render('d/test3', {name: ['홍길동2','임꺽정2','유관순2']})
})

app.listen(8888, function () {
  console.log('서버가 시작되었습니다.');
})

/*
  express 프레임워크 적용 - ajax 웹 프로그래밍 방식
  => 서버에서 기본 html을 클라이언트로 보낸다.
  => 서버에서 데이터를 json형식으로 만들어 클라이언트로 보낸다.
  => 웹페이지 출력 절파
  1) 웹브라우져 --> 웹서버 : 기본 html을 요청한다.
  2) 웹서버 --> 웹브라우저 : 요청한 html을 보낸다.
  3) 웹브라우저 : html 을 렌더링한다.
  4) 웹브라우저 --> 웹서버 : 화면을 만들 때 사용할 데이터를 요청한다.
  5) 웹서버 --> 웹브라우저 : json 형식 데이터를 보낸다.
  6) 웹브라우저 : json 형식 데이터를 사용하여 화면을 변경한다.
*/

var express = require('express')
var bodyParser = require('body-parser')
var path = require('path')
var cons = require('consolidate');

var app = express()
app.use(express.static('public')) //웹브라우저가 요청하는 파일이 어떤 폴더에 있는지 지정한다.
app.use(bodyParser.urlencoded({extended: false}))
// POST 요청데이터 분석기를 등록한다.
// => 이 분석기를 등록해야만 POST 요청으로 들어온 데이터를 꺼낼 수 있다.

// 사용할 템플릿 엔진을 등록한다.
app.engine('hbs', cons.handlebars)
app.set('view engine', 'hbs')  // 기본 템플릿 엔지으로 어떤것을 사용할 지 지정한다.
app.set('views', path.join(__dirname, '/views')) // 템플릿 파일이 있는 위치를 지정한다.

// 서비스 라우터를 등록한다.
// => httl://localhost:8888/student/.... 요청을 처리할 라우터를 등록한다.
app.use('/student', require('./control/student-control'))
app.use('/teacher', require('./control/teacher-control'))
app.use('/manager', require('./control/manager-control'))
app.use('/lecture', require('./control/lecture-control'))


app.get('/', function(request, response) {
  response.render('index')
})

app.listen(8888, function() {
  console.log('서버가 시작되었습니다.')
})

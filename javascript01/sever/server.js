var express = require('express')  //express와
   , http = require('http')  // http 모듈을 로딩하고
   ,app = express()  //저장된 express를 함수로 실행해 app객체생성
   , server = http.createServer(app);
       //createServer함수를 이용해서 app객체와 http서버를 연결한다.

  app.get('/', function(req, res) {  //이 함수는 웹브라우저 접속시 매번 실행됨
              //app객체에서 get함수를 사용해 http의 get메소드를 처리함을 의미.
       res.send('Hello /');     //req:요청객체(response), res:응답객체(response)
   });
  app.get('/world.html', function(req, res){ //웹브라우저에 접속하면
       res.send('Hello World');   //콜백함수에서 res의 send함수를 실행해
   });                       //웹브라우저에 나올 내용(Hello World)을 내보낸다.
               // app 객체에 경로마다 응답할 함수를 지정하면 여러개 파일처리 가능
   server.listen(8000, function() { //브라우저가 8000 포트에 접속하면
       console.log('Express server listen on port ' + server.address().port);
   });  // 이 콜백함수에서 res의 send함수를 실행해 웹브라우저에 보낸다.

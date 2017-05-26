var miniExpress = require('./mini-express')

var app = miniExpress()

app.get('/', function (request, response) {
  console.log('222222');
  response.writeHead(200,{'content-Type': 'text/html;charset=UTF-8'})
  response.end('<html>\
  <body>\
  <h1>안녕안녕안녕</h1>\
  </body>\
  </html>')
})

app.listen(8888, function () {
  console.log('서버가 시작되었습니다.');
})

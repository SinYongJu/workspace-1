/* mini express 만들기*/
var http = require('http')
var url = require('url')
var path = require('path')
var fs = require('fs')

var getHandler = {}
var postHandler = {}

function notFound(request, response) {
  console.log('1111');
  response.writeHead(200, {
    'Content-Type' : 'text/html;charset=UTF-8'
  })
  fs.readFile(path.join(__dirname, './html/http-404.html'), function (err, data) {
    if(err) throw err
    response.end(data)
  })
}
var server =http.createServer(function (request, response) {
  console.log('3333');
  var urlInfo = url.parse(request.url, true)

  var handler = null;
  if(request.method == 'GET'){
    handler = getHandler[urlInfo.pathname]
    request.query = urlInfo.query
  } else if(request.method == "POST"){
    handler = PostHandler[urlInfo.pathname]
  }
  if(handler){
    handler(request, response)
  } else{
    notFound(request, response)
  }
})

module.exports =function () {
  return {
    get(url, handler){
      getHandler[url] = handler
    },
    post(url, handler){
      postHandler[url] = handler
    },
    //웹서버를 시작시킨다.
    listen(port, cb){
      server.listen(port, cb)
    }
  }
}

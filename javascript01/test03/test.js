var ad = require('./mini-express')

var app = ad()

app.get('/', (request, response) => {
  response.writeHead(200,{'contnent-Type': 'text/html;charset=UTF-8'})
  response.end('<html>\
  <body>\
  <h1>안녕안녕아녕</h1>\
  </body>\
  </html>')
})

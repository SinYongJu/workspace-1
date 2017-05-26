/* 템플릿 엔진 사용하기 외부에서 템플릿 소스를 가져오기 II
=>'템플릿 엔진적용*/
const fs = require('fs')
const path = require('path')
const handlebars = require('handlebars')

var data ={
  name: '홍길동'
}

var templatePath  = path.join(__dirname,'test05_3_template.txt');
console.log(templatePath);

fs.readFile(templatePath, "utf8", (err, src) => {
  if(err) throw error
  console.log(data);

  var template = handlebars.compile(src)
  var result = template(data)
  console.log(result);
})
// fs.readFile('/etc/passwd', (err, data) => {
//   if (err) throw err;
//   console.log(data);
// });

/* 템플릿 엔진 사용하기 외부에서 템플릿 소스를 가져오기
=>'fs' 모듈을 이용한다.*/
const fs = require('fs')
const path = require('path')

var templatePath  = path.join(__dirname,'test05_3_template.txt');
console.log(templatePath);

fs.readFile(templatePath, "utf8", (err, data) => {
  if(err) throw error
  console.log(data);
})
// fs.readFile('/etc/passwd', (err, data) => {
//   if (err) throw err;
//   console.log(data);
// });

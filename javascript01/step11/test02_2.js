/* DATABASE Programming*/

const mysql = require('mysql');

const connection = mysql.createConnection({
  host     : 'localhost',
  user     : 'root',
  password : '1111',
  database : 'webappdb'
});

console.log('MySQL 서버에 연결할 도구 생성완료!');
connection.connect();
console.log('MySQL 서버와 연결됨!');

connection.query('INSERT INTO memb(name,email,tel, pwd)'+
  'values ("망나니","test@test.com","1111-1111",password("1111"))',
  function(error, results){
    console.log('결과를 가져왓음');
    if(error) throw error;

    console.log(results);
})

connection.end();
console.log("MySQL 서버와 연결을 끊음!");

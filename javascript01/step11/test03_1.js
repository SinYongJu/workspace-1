/* in-parameter 활용
  => insert나 update 할 떄 여러개의 값을 지정하기 위해 문자열을 '+' 연산자를
  사용하여 문자열을 연결해야 한다.
  이런 불편함을 없애기 위해 in-parameter 문법이 나왓다.
*/

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

connection.query('INSERT INTO memb(name,email,tel, pwd) values(?,?,?,password(?))',
 ["망나니","test@test.com","1111-1111","1111"],
  function(error, results){
    console.log('결과를 가져왓음');
    if(error) throw error;

    console.log(results);
})

connection.end();
console.log("MySQL 서버와 연결을 끊음!");

/* DATABASE Programming*/

const mysql = require('mysql');

var connection = mysql.createConnection({
  host     : 'localhost',
  user     : 'root',
  password : '1111',
  database : 'webappdb'
});

console.log('MySQL 서버에 연결할 도구 생성완료!');
connection.connect();
console.log('MySQL 서버와 연결됨!');


connection.end();
console.log("MySQL 서버와 연결 끊기가 예약됨!");

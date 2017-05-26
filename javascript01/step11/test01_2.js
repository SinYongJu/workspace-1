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
// connection.query('SELECT 1 + 1 AS solution', function (error, results, fields) {
//   if (error) throw error;
//   console.log('The solution is: ', results[0].solution);
// });
connection.query('SELECT * from memb',function(error, results){
  console.log('결과를 가져왓음');
  console.log(results);
})

connection.end();
console.log("MySQL 서버와 연결을 끊음!");

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

connection.query('SELECT mno,name,tel from memb',function(error, results){
  console.log('결과를 가져왓음');
  if(error) throw error;

  //results에 들어있는 값을 한 개씩 꺼내 출력한다.
  for(var row of results){
    console.log(row.mno, row.name, row.tel);
  }
})

connection.end();
console.log("MySQL 서버와 연결을 끊음!");

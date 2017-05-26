// 데이터 처리를 담당하는 자바스크립트
module.exports ={
  setConnection(con){
    this.Connection = con
  },

  selectlist(pageNo, successFn, errorFn) {

    this.connection.query(
      'select m.mno, m.name, m.tel, m.email, s.work \
      from stud s inner join memb m on s.sno=m.mno  \
      order by m.name asc \
      limit ?, ?',
      [(pageNo - 1) * 3, 3],
      function(error, results) {
        if (error) {
          errorFn(error)
        } else {
          successFn(results)
        }
    }) // connection.query()
  },// selectlist

  countall(successFn, errorFn) {
    this.connection.query(
      'select count(*) cnt from stud',
      function(error, results) {
        if (error) {
          errorFn(error)
        } else {
          successFn(results)
        }
    }) //connection.query()
  },

  selectone(no, successFn, errorFn) {
    this.connection.query(
      'select m.mno, m.name, m.tel, m.email, s.work, s.schl_nm \
      from stud s inner join memb m on s.sno=m.mno \
      where s.sno=?',
      [no],
      function(error, results) {
        if (error) {
          errorFn(error)
        } else {
          successFn(results[0])
        }
    }) // connection.query()
  }, //selectOneStudent()

  insert(student, successFn, errorFn) {
    this.connection.query(
      'insert into stud(sno,work,schl_nm) values(?,?,?)',
      [ student.no, student.working, student.schoolName],
      function(error, result) {
        if (error) {
          errorFn(error)
        } else {
          successFn(result)
        }
    }) //connection.query()
  },//insertStudent()

  update(student, successFn, errorFn) {
    this.connection.query(
      'update stud set work=?, schl_nm=? where sno=?',
      [student.working, student.schoolName, student.no],
      function(error, result) {
        if (error) {
          errorFn(error)
        } else {
          successFn(result)
        }
    }) //connection.query()
  }, //updateStudent()

  delete(no, successFn, errorFn) {
    this.connection.query(
      'delete from stud where sno=?',
      [no],
      function(error, result) {
        if (error) {
          errorFn(error)
        } else {
          successFn(result)
        }
    })
  }//delete()
} // createStudentDao()

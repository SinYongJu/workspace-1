// 학생 정보를 다루는 서비스를 정의한다.
const express = require('express')
const datasource = require('../util/datasource')
const teacherDao = require('../dao/teacher-dao')
const teacherService = require('../service/teacher-service')
const memberDao = require('../dao/member-dao')

const connection = datasource.getConnection()
teacherDao.setConnection(connection)
memberDao.setConnection(connection)
teacherService.setMemberDao(memberDao)
teacherService.setTeacherDao(teacherDao)

const router = express.Router()

router.get('/list.json', (request, response) => {
  var pageNo = 1,
      pageSize = 3;
  if(request.query.pageNo){
    pageNo = parseInt(request.query.pageNo)
  }
  if(request.query.pageSize){
    pageSize = parseInt(request.query.pageSize)
  }
  teacherService.list(pageNo, pageSize, function (results, totalCount) {
    response.json({'list' : results, 'totalCount' : totalCount})//문자열화 시켜라
  }, function (error) {
    response.status(200)
            .set('Content-Type', 'text/plain;charset=utf-8')
            .end("error")
      console.log(error);
  })
})

router.get('/detail.json', function (request, response) {
  var no = parseInt(request.query.no)
  teacherService.detail(no, function (result) {
    response.render('teacher/view',{
      'detail' : true,
      'data': result
    })
  }, function (error) {
      response.render('error', {'mesaage': '학생 목록 데이터 얻어오는 중 오류입니다.'})
  })

})
////////////////////////////////////////////////////////////////////
router.post('/update.json', function (request, response) {

  teacherService.update({
    no: request.body.no,
    hmpg: request.body.hmpg,
    fcbk: request.body.fcbk,
    twit: request.body.twit,
    name: request.body.name,
    tel: request.body.tel,
    email: request.body.email,
    password: '1111'
  }, function (result) {
    response.redirect('list.do')
  }, function (error) {
    response.render('error',
      {'mesaage': '학생 목록 데이터 얻어오는 중 오류입니다.'})
  })
})

router.get('/delete.json', function (request, response) {
  var no = parseInt(request.query.no)
  teacherService.delete(no, function (result) {
    response.redirect('list.do')
  }, function (error) {
  response.render('error',
    {'mesaage': '강사 목록 데이터 얻어오는 중 오류입니다.'})
  })
})

router.get('/form.json', function (request, response) {
  response.render('teacher/view')
})

router.post('/add.json', function (request, response) {
  teacherService.insert({
    posi: request.body.posi,
    fax: request.body.fax,
    path: request.body.path,
    name: request.body.name,
    tel: request.body.tel,
    email: request.body.email,
    password: '1111'
  }, function (result) {
    response.redirect('list.do')
  }, function (error) {
    response.render('error',
      {'mesaage': '매니저 목록 데이터 등록 중 오류입니다.'})
  })
})

module.exports = router

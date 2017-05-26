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

router.get('/list.do', (request, response) => {
  var pageNo = 1,
      pageSize = 3;
  if(request.query.pageNo){
    pageNo = parseInt(request.query.pageNo)
  }
  if(request.query.pageSize){
    pageSize = parseInt(request.query.pageSize)
  }
  teacherService.list(pageNo, pageSize, function (results, totalCount) {
    var lastPageNo = parseInt(totalCount/ pageSize) + ((totalCount % pageSize > 0) ? 1: 0)
    // response.setHeader('Content-Type', 'text/html;charsey=UTF-8')
    response.render('teacher/index', {
      'data': results,
      'pageNo': pageNo,
      'nextPageNo': pageNo +1,
      'prevPageNo': pageNo-1,
      'disabledPrevBtn': (pageNo == 1) ? 'disabled' : '',
      'disabledNextBtn': (pageNo == lastPageNo) ? 'disabled' : ''
    })

  }, function (error) {
    response.render('error', {'mesaage': '강사 목록 데이터 로딩 중 오류입니다.'})
  })
})

router.get('/detail.do', function (request, response) {
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
router.post('/update.do', function (request, response) {

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

router.get('/delete.do', function (request, response) {
  var no = parseInt(request.query.no)
  teacherService.delete(no, function (result) {
    response.redirect('list.do')
  }, function (error) {
  response.render('error',
    {'mesaage': '강사 목록 데이터 얻어오는 중 오류입니다.'})
  })
})

router.get('/form.do', function (request, response) {
  response.render('teacher/view')
})

router.post('/add.do', function (request, response) {
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

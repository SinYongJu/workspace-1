"use strict"

window.$ = window.jQuery = require('jquery')

var tbody = $('#student-tbl > tbody')


dispalayList(1)

$('#add-btn').click(function() {
  location.href = 'view.html'
})

$('#prev-btn').click(function() {
  var currPageNo = parseInt($('#page-no').text())
  dispalayList(currPageNo - 1)
})

$('#next-btn').click(function() {
  var currPageNo = parseInt($('#page-no').text())
  dispalayList(currPageNo + 1)
})

function preparePagingBar(pageNo) {
  $('#page-no').text(pageNo)

  if (pageNo == 1) {
    $('#prev-btn').attr('disabled', true)
  } else {
    $('#prev-btn').attr('disabled', false)
  }

  countAllStudent(function (results) {
    var totalCount = results[0].cnt;
    var totalPage = parseInt(totalCount / 3) + (totalCount % 3 > 0 ? 1 : 0);
    console.log(results);
    if (pageNo == totalPage) {
      $('#next-btn').attr('disabled', true)
    } else {
      $('#next-btn').attr('disabled', false)
    }
  },
  function (error) {
    alert('데이터 조회 중 발생!')
    throw error;
  }) //listStudent
} //dispalayList

function onClickViewLink(event) {
  location.href = 'view.html?no=' + $(this).attr('data-no')
  event.preventDefault()
}

function dispalayList(pageNo) {

  selectListStudent(
    pageNo, //PageNo
    function (results) { //successFn
    // 기존에 있던 tr 태그 삭제
    tbody.html('');

    for (var i = 0; i < 3; i++) {
      if (i < results.length) {
        let s = results[i]
        $("<tr>").html("<td>" + s.mno +
        "</td><td><a href='#' data-no='" + s.mno + "' class='view-link'>" + s.name +
        "</a></td><td>" + s.tel +
        "</td><td>" + s.email +
        "</td><td>" + (s.work == "Y" ? "재직중" : "실업") + "</td>")
        .appendTo(tbody)
      } else {
        $("<tr><td colspan='5'>&nbsp;</td></tr>").appendTo(tbody)
      }
    }

    $('table .view-link').click(onClickViewLink)

    preparePagingBar(pageNo)

    console.log('list 가져오는 거 처리끝!')
  }, function (error) { //errorFn
      alert('데이터 조회 중 발생!')
      throw error;
  })
}

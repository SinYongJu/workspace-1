var pageNoTag= $('#page-no'),
    tbody = $('#teacher-tbl > tbody'),
    prevBtn = $('#prev-btn'),
    nextBtn = $('#next-btn'),
    pageSize = 3;

var currPageNo = parseInt(pageNoTag.text())

displayList(1)

function displayList(pageNo) {
  // 서버에서 학생 목록 데이터를 받아온다.
  $.getJSON('list.json', {'pageNo' : pageNo, 'pageSize' : pageSize}, function (result) {
    var list = result.list;
    var totalCount = result.totalCount;
    var lastPageNo = parseInt(totalCount / pageSize) + (totalCount %  pageSize > 0 ? 1 : 0)
    tbody.text('')
    for(var s of list){
      $('<tr>').append($('<td>').text(s.mno))
               .append($('<td>').append(
                 $('<a>').attr('href', 'view.html?no=' +s.mno)
                         .attr('data-no', s.mno)
                         .text(s.name == '' ? '(이름 없음)' : s.name)))
      .append($('<td>').text(s.tel))
      .append($('<td>').text(s.email))
      .append($('<td>').text(s.hmpg))
      .appendTo(tbody)
    }

    currPageNo = pageNo
    pageNoTag.text(currPageNo)

    if(currPageNo == 1){
      prevBtn.prop('disalbled', true)
    } else{
      prevBtn.prop('disabled', false)
    }

    if(currPageNo == lastPageNo)
      nextBtn.prop('disabled', true)
    else
      nextBtn.prop('disabled', false)
  }) //getJson
}// displatList

// .get을 한번더 감싼 것이 getJSON 이유는 .get 으로 받을때 파라미터명 json 귀차니즘 때문에

prevBtn.click(function () {
  // var currPageNo = parseInt($('#page-no').text()) 매번 돔트리 탐색
  // var currPageNo = parseInt(pageNoTag.text())
  displayList(currPageNo - 1)
})

nextBtn.click(function () {
  // var currPageNo = parseInt($('#page-no').text())
  // var currPageNo = parseInt(pageNoTag.text())
  displayList(currPageNo + 1)
})

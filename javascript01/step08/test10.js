function bit(value) {
  var el = []

  if (value instanceof HTMLElement) { // 파라미터 값이 태그라면,
    el[0] = value // 무조건 태그를 배열로 포장한다.

  } else if (value.startsWith('<')) { // 새 태그 생성으로 간주한다.
    el[0] = document.createElement(value.substr(1, value.length - 2))

  } else { // CSS selector 문법으로 간주한다.
    var list = document.querySelectorAll(value)
    for (var e of list) {
      el.push(e)
    }
  }

  // 배열에 나만의 유용한 함수를 붙이자!

  // 1) 배열에 들어있는 태그에 대해 자식 태그를 추가하는 아주 편리한 함수
  el.append = function(children) {
    if (!(children instanceof Array)) {
      console.error('배열이 아닙니다.');
      return;
    }

    for (var e of this) {
      for (var child of children) {
        e.appendChild(child)
      }
    }

    return this
  }

  // 2) 배열 안에 있는 태그의 콘텐츠를 설정하는 함수
  el.html = function(content) {
    for (var e of this) {
      e.innerHTML = content
    }
    return this
  }

  // 3) 배열 안에 있는 태그에 클릭 이벤트 핸들러를 추가하는 함수
  el.click = function(listener) {
    for (var e of this) {
      e.addEventListener('click', listener)
    }
    return this
  }

  // 4) 배열 안에 있는 태그의 속성 값을 다루는 함수

  el.attr = function(name, value) {
    if (arguments.length < 2) {
      return this[0].getAttribute(name)

    } else {
      for (var e of this) {
        e.setAttribute(name, value)
      }
      return this
    }
  }

  // 5) 배열 안에 있는 태그를 부모 태그에 추가시키는 함수
  el.appendTo = function(parents) {
    for (var p of parents) {
      for (var e of this) {
        p.appendChild(e)
      }
    }
    return this;
  }

  // 6) 배열 안에 있는 각각의 태그에 대해 CSS 스타일을 다루는 함수
  el.css = function(name, value) {
    for (var e of this) {
      e.style[name] = value
      console.log(e);
    }
    return this
  }

  // 7) 배열 안에 있는 태그의 콘텐츠를 설정하는 함수(textContent 속성)
  el.text = function(content) {
    for (var e of this) {
      e.textContent = content
    }
    return this
  }

  // 8) 배열 안에 있는 폼 항목 태그의 콘텐츠를 설정하는 함수(value 속성)
  el.val = function(value) {
    if(arguments.length == 0){
      return this[0].value
    }
    for (var e of this) {
      e.value = value
    }
    return this
  }

  // 9) 배열 안에 있는 태그의 프로퍼티 값(?)을 다루는 함수

  el.prop = function(name, value) {
    if (arguments.length < 2) {
      return this[0][name]

    } else {
      for (var e of this) {
        e[name] = value
      }
      return this
    }
  }


  return el
}

bit.ajax = function(url, settings) {
  if (settings == undefined) {
    settings = {
      method: 'GET',
      dataType: 'text'
    }
  } else {
    if (settings.method == undefined) settings.method = 'GET'
    if (settings.dataType == undefined) settings.dataType = 'text'
  }

  var xhr = new XMLHttpRequest()
  xhr.onreadystatechange = function() {
    if (xhr.readyState < 4)
      return

    var rv;
    if (settings.dataType == 'json') {
      rv = JSON.parse(xhr.responseText)
    } else {
      rv = xhr.responseText
    }

    if (settings.success) {
      settings.success(rv)
    }
  }
  xhr.open(settings.method, url, true)

  if (settings.method == 'POST'){
    xhr.setRequestHeader('Content-Type', 'application/x-www-form-urlencoded')
    var queryString = ""
    if(settings.data){
      for(var propName in settings.data){
        if(queryString.length > 0){
          queryString += "&"
        }
        queryString += propName + '=' + settings.data[propName]
      }
    }
    console.log(queryString);
    //xhr.send(queryString)
  } else {
    xhr.send()
  }
}

bit.getJSON = function(url, success) {
  bit.ajax(url, {
    dataType: 'json',
    success: success
  })
}

bit.post =function(url, data, success, dataType){
  bit.ajax(url,{
    method: 'POST',
    dataType: dataType,
    data: data,
    success: success
  })
}

var $ = bit;

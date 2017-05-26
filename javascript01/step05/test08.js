/*new 연산자와 생성자*/
"use strict"

function init() {
  console.log(this);
}

new init();
init();

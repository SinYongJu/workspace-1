"use strict"
//sigma(n) 꼬리 재귀호출로 구현
function sigma(n, sum) {
  if(n == 1)
    return sum + n;
  return sigma(n-1, sum + n);
}

var result = sigma(5, 0);
console.log(result);

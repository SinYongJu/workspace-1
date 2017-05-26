"use strict"

//sigma(n) 반복문으로 구현

var sum = 0;
for (var i=1; i <= 5; i++) {
  sum += i;
}
console.log(sum);
console.log('---------');

//sigma(n) 재귀호출로 구현
function sigma(n) {
  if(n == 1)
    return 1;
  return n+sigma(n-1);
}

var sum2 = sigma(5);
console.log(sum2);
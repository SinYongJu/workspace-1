//Object

/* % ^.^ % */

console.log("--------------------------");
var arr1 = new Array()
console.log(arr1);
console.log(typeof arr1);
console.log("--------------------------");

var arr2 = []
console.log(arr2);
console.log(typeof arr2);
console.log("--------------------------");

var arr3 = ['홍길동','임꺽정','유관순','안중근']
console.log("배열 길이 = ", arr3.length);
arr3.push('윤봉길')
arr3.push('김구','신채호')
console.log("배열 길이 = ", arr3.length);
var value = arr3.pop() // 배열 끝값을 꺼내어 리턴 꺼내고 제거
console.log(arr3);
value = arr3.shift();
console.log(arr3);
value = arr3.splice(2, 1)
console.log(arr3);
value = arr3.splice(1,3)
console.log(arr3);

console.log("--------------------------");

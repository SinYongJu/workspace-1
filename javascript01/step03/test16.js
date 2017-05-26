"use strict"

var names = ["홍길동","임꺽정","유관순","안중근","윤봉길","김구"];

for (var index in names){
   console.log(index);
}
console.log("------------------------");
for (var value of names){
   console.log(value);
}
console.log("------------------------");

var student ={
    name: "홍길동",
    age:20,
    tel:"1111-1111",
    email:"test@test.com"
};

for(var label in student){
  console.log(label);
}
console.log("-------------");

// for(var value of student){
//   console.log(value);
// }
// console.log("-------------");

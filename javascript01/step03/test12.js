"use strict"

var count = 1;

while(count <= 10){
  console.log(count++);
}
console.log("------------------------");

var a = 2;
while(a <= 9){

  var b = 1;
  while (b <= 9) {
    console.log(a + " * " + b + " = " + a*b);
    b++;
  }
  a++;
}
console.log("------------------------");

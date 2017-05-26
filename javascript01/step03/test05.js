"use strict"

var age;

age = 11;

if(age < 8)
  console.log("유아");
else{
  if(age >= 8 && age < 14)
    console.log("어린이");
  else{
    console.log("청소년 이상입니다.");
  }
}
console.log("--------------------");

age = 40;

if(age < 8)
  console.log("유아");
else if(age >= 8 && age < 14)
    console.log("어린이");
else
    console.log("청소년 이상입니다.");
console.log("--------------------");

age = 65;

if(age < 8)
  console.log("유아");
else
  if(age >= 8 && age < 14)
    console.log("어린이");
else
  if (age >= 14 && age < 20)
    console.log("청소년");
else
  if(age >= 20 && age < 65)
    console.log("성인");
else
  console.log("노인");
console.log("--------------------");

age = 65;

if(age < 8)
  console.log("유아");
else if(age >= 8 && age < 14)
  console.log("어린이");
else if (age >= 14 && age < 20)
  console.log("청소년");
else if(age >= 20 && age < 65)
  console.log("성인");
else
  console.log("노인");
console.log("--------------------");

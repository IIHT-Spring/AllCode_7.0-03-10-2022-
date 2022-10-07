let name = "NishANT";
let age;
age = 65;
console.log(name + " " + age);

// types of variables
var marks = 90; // how you would defins a var keyword
console.log(marks);
{
  const a = 67;
  const b = 70;
  let num = 100;
  // the scope of the var varible stays inside a function
  function add() {
    console.log(b);
    var c = a + b;
    console.log("addition : " + c);
  }
  add();
  function multiply() {
    const c = a * b ;
    console.log("multiplication value is " + c);
  }
  multiply();
  function division() {
    const c = a / b ;
    console.log("division value is " + c);
  }
  division();
  function mod() {
    const c = a % b ;
    console.log("mod value is " + c);
  }
  mod();
  console.log("post fix increment "+ num++ ) // post fix increment 
  console.log(num);
  console.log("post fix decrement "+  num--); // post fix decrement
  console.log(num);
  console.log("pre fix increment "+ ++num ); // pre fix increment 
  console.log(num);
  console.log("pre fix decrement "+ --num ); // pre fix decrement 
  console.log(num);

  let hello;
 // alert(!hello); // not -> logical operator use* does not*

 // and operator 
  alert(5 && 10 && 80 ); // and operator gives us the bigger number 

// or opreator
console.log(10 || 50 || 100); // or opreator gives us the value of the smallest data 






}

// console.log(a);

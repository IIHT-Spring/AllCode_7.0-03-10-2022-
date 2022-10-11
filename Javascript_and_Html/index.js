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
    const c = a * b;
    console.log("multiplication value is " + c);
  }
  multiply();
  function division() {
    const c = a / b;
    console.log("division value is " + c);
  }
  division();
  function mod() {
    const c = a % b;
    console.log("mod value is " + c);
  }
  mod();
  console.log("post fix increment " + num++); // post fix increment
  console.log(num);
  console.log("post fix decrement " + num--); // post fix decrement
  console.log(num);
  console.log("pre fix increment " + ++num); // pre fix increment
  console.log(num);
  console.log("pre fix decrement " + --num); // pre fix decrement
  console.log(num);

  let hello;
  // alert(!hello); // not -> logical operator use* does not*

  // and operator
  // alert(5 && 10 && 80 ); // and operator gives us the bigger number

  // or opreator
  console.log(10 || 50 || 100); // or opreator gives us the value of the smallest data

  // array

  const names = ["nishant", "raj", "sam"];
  names[3] = "Ram";
  names[0] = "vijay";
  console.log(names);

  const food = [];
  food[0] = "pasta";
  food[1] = "pizza";
  food[2] = "Curd rice";

  const menu = [...food, "biryani", "dosa", "chicken curry", "fish"];
  console.log(menu);

  const marks = [12, 32, 123, 445, 3121, 42211];
  let maxMark = Math.max(...marks);
  console.log(maxMark);

  const students = new Map([
    [29, 80],
    ["Rishav", true],
    ["Rohit", 31],
    ["Vijay", 32],
  ]);

  students.set("John", 33); // set method allows us to add a key- value paid after setting the data

  console.log(students);
  console.log(students.get("Rohit")); // get allows to retrieve a data

  for (let index = 0; index < menu.length; index++) {
    console.log(menu[index]);
  }

  if (menu.length > 10) {
    console.log("we have more than 10 food items ");
  }
  if (menu.length == 10) {
    console.log("we have 10 food items ");
  } else {
    console.log("we have less than 10 food items ");
  }

  switch (menu.length) {
    case 0:
      console.log("no items in menu");
      break;
    case 1:
      console.log("1 items in menu");
      break;
    case 2:
      console.log("2 items in menu");
      break;
    case 3:
      console.log("3 items in menu");
      break;
    case 4:
      console.log("4 items in menu");
      break;
    case 5:
      console.log("5 items in menu");
      break;
    case 6:
      console.log("6 items in menu");
      break;
    case 7:
      console.log("7 items in menu");
      break;
    case 8:
      console.log("8 items in menu");
      break;
    default:
      console.log("more than 8 items ");
  }
  // arrow function

  function Area(num1, num2) {
    console.log(num1 * num2);
    return num1 * num2;
  }
  // traditional way to write a function

  Area(70, 50);

  area1 = (num1, num2) => {
    console.log(num1 * num2);
    return num1 * num2;
  }; // arrow function
  area1(10, 50);

  // set is js collection which can store only unique values

  const id_no = new Set([12, 13, 14, 15, 16, 17, 12, 18]);

  id_no.add(122);

  id_no.delete(13);
  console.log(id_no);

  console.log(id_no.has(14));
}
var promise = new Promise(function(resolve,reject){
  const passingMarks = 500;
  const securedMarks = 400;

  if( passingMarks <= securedMarks) {
      resolve()
  } else {
      reject()
  }
})
promise.then(function(){
  console.log("Congrats you have passed the exam");
}).catch(function() {
  console.log("Try again next year , work harder, all the best!");
})
// console.log(a);




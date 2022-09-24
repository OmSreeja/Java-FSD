let num1 = []; //memory creation in literal style
let num2 = []; //generic 
let num3 = new Array();
num1.push(10);
num1.push(20);
let names = new Array();
let info1 = new Array();
info1.push(100);
info1.push("sree");
let emp1 = { id: 100, name: "sree", age: 22 };
let emp2 = { id: 101, name: "mouni", age: 22 };
let emp3 = { id: 102, name: "sai", age: 24 };
let emp4 = { id: 103, name: "surya", age: 20 };
let employees = new Array();
employees.push(emp1);
employees.push(emp2);
employees.push(emp3);
employees.push(emp4);
employees.forEach(e => console.log(e.id + " " + e.name + " " + e.age));
let res1 = employees.find(e => e.id == 101);
let res2 = employees.find(e => e.id == 1000);
let res3 = employees.findIndex(e => e.id == 101);
let res4 = employees.findIndex(e => e.id == 1000);
console.log(res1);
console.log(res2);
console.log(res3);
console.log(res4);

//literal style object cretaion
let emp='{"id":100,"name":"mouni","age":21}' ; //it is string consider
let emp1={id:100,name:"sree",age:22}
document.write("<br>object creation in literal style ")
document.write("<br>Id is "+emp1.id)
document.write("<br>name is "+emp1.name)
document.write("<br>age is "+emp1.age)
//we have to convert js object to string
let empString =JSON.stringify(emp1)
document.write("<br>object Property ")
document.write("<br>Id is "+empString.id)
document.write("<br>name is "+empString.name)
document.write("<br>age is"+empString.age)
//we jave to convert string to Json
let empJSON=JSON.parse(empString)
document.write("<br>object Property ")
document.write("<br>Id is "+empJSON.id)
document.write("<br>name is "+empJSON.name)
document.write("<br>age is "+empJSON.age)
//convertinj Json to string
let empStr=JSON.stringify(empJSON)
document.write("<br>object Property ")
document.write("<br>Id is "+empStr.id)
document.write("<br>name is "+empStr.name)
document.write("<br>age is "+empStr.age)
//converting empstring to json we can do directly parse beacuse emp is a string
let empS=JSON.parse(emp)
document.write("<br>object Property direct string")
document.write("<br>Id is "+empS.id)
document.write("<br>name is "+empS.name)
document.write("<br>age is "+empS.age)

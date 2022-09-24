//normal function
/*display1() //we can this func before declaration
function display1(){
    document.write("Normla function declaration<br>");
}
display1();
//expression style function with name
let display3=function display2(){
    document.write("expression style function with name")
}
display3();
//display4(); //we cant cal this function before declaration
let display4=function(){
    document.write("<br>expression style without name")
}
display4();
// arrow function
let display5=()=> document.write("<br>simple array function");
display5();
// passing parameter with expression function
let addNumber1=function(a,b){
    var sum=a+b;
    return sum;
}
document.write("<br>addition of two numbers using expression style "+addNumber1(10,20));
//parameter passing with arrow style function
let addNumber2=(a,b)=>a+b;
document.write("<br>addition of two numbers using arrow function "+addNumber2(5,6));
//find largest of two number using expression style
let findLargest1=function(a,b){
    if(a>b){
        return "a is largest"
    }
    else{
        return "b is largest"
    }
}
document.write("<br> largest of two numbers using expression style "+findLargest1(3,2));
//find largest of two numbers using arroe style
let findLargest2=(a,b)=>{if(a>b){
    return "a is largest"}
    else{
        return "b is largest"
    }
}
    document.write("<br> largest of two numbers using arrow style "+findLargest2(5,9));*/
    /*function greeting(fname,callback){
        return "Welcome "+callback(fname);

    }
    let maleInfo=function(fname){
        return "Mr "+fname;
    }
    let femaleInfo=(fname)=>"Miss"+fname;
    document.write("<br>"+greeting("Sree",maleInfo))
    document.write("<br>"+greeting("Sreeja",femaleInfo))
    document.write("<br>"+greeting("sai",function(fname){
        return "Mr "+fname;
    }))
    document.write("<br>"+greeting("mouni",(fname)=>"Miss"+fname))*/
(function(){
    document.write("IIFE Function")
})();
document.write("<br>");
(function(a,b){
    document.write(a+b)
})(100,200);

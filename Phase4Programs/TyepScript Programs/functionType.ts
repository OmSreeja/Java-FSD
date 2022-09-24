function add(a,b){
    console.log(a+" "+b)
}
add(100,200)
add("A","B")
//error in ts add(1)
//error in is add()but in js we dont get error
function addNumber(a:number,b:number){
    console.log(a+b)
}
addNumber(1,2)
addNumber(10.20,20.20)
//addNumber("A","B")
//no return type
function info():void{

}
//string return type
function sayHello():string{
    return "Welocme"
}
//number return type
function getNumber():number{
    return 100;
}
//any return type
function display():any{
    //rteurn 100
    //return "welcome"
    return true;
}
//optional parameter
//to declare optional parameter we have to use ?
//opreation optional declaration must be right to left
//declare all varaiable must be optional or 1 or more than one but
//indeclaration we cant leave any normal value default value for those optional varailable is undefined
/*function empInfo(id?:number,name?:string,age?:number):void{
    console.log(id)
    console.log(name)
    console.log(age)
}
empInfo(1,"sree",21)
empInfo(2,"mouni")
empInfo(3)
empInfo()*/
function empInfo(id:number=0,name:string="unkonowm",age:number=18):void{
    console.log(id)
    console.log(name)
    console.log(age)
}
empInfo(1,"sree",21)
empInfo(2,"mouni")
empInfo(3)
empInfo()
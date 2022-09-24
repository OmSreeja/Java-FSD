interface greet{
    name:string;
    age:number;
}
let myGreet:greet={
    name:"sree",
    age:22
}
interface user{
    (name:string,
    lang:string):string
}
let myUser:user;
myUser=function(n:string,lan:string):string{
  if(lan=="en"){
    return `welcome ${n}`
  }
  else{
    return `sry ${n}`
  }
}
console.log(myUser("sree","en"))
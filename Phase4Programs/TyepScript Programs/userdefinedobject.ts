//literal style
//let emp1={id:100,name:"sree",age:22}
//console.log(emp1.id)
//console.log(emp1.name)
//console.log(emp1.age)
 //function style : es5 style
 /*function Employee(){
          this.eid=101;         // it is consider as instance varaible
          this.ename="mouni";
          this.salary=124000;
          this.dispaly=function(){      //it is consider as employee object function
            console.log("id is "+this.eid);
            console.log("name is "+this.ename);
            console.log("salary is "+this.salary);
          }
 }
 let emp2=new Employee();
 emp2.dispaly();*/
 //obj creation using class style
 //typescript supports access specifiers
 /*class Employee{
      private id:number=102;
      private name:string="sai";
      private salary:number=12000;
      display():void{
        console.log("id is "+this.id)
        console.log("name is "+this.name)
        console.log("salary is "+this.salary)
      }
 }
 let emp=new Employee();
 emp.display();*/
 //constructor
 /*class Employee{
    constructor(){
        console.log("object created..")
    }
    display() : void{
        console.log("dispaly function ")
    }
 }
 let emp=new Employee();
 emp.display();*/
 //parameterized constructor
 class Employee{
    id:number
    name:string;
    age:number;
    constructor(id:number=0,name:string="unknown",age:number=22){
        this.id=id;
        this.name=name;
        this.age=age;
    }
    display() : void{
        console.log("id is "+this.id);
        console.log("name is "+this.name)
        console.log("age is "+this.age)
    }
}
let emp=new Employee(1,"sree",22);
let emp1=new Employee(2,"mouni")
let emp3=new Employee(3)
let emp4=new Employee()
emp.display();
emp1.display();
emp3.display();
emp4.display();
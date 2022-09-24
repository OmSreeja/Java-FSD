import { Component, OnInit } from '@angular/core';
import { Employee } from '../employee';

@Component({
  selector: 'app-structure-directive',
  templateUrl: './structure-directive.component.html',
  styleUrls: ['./structure-directive.component.css']
})
export class StructureDirectiveComponent implements OnInit {
 f1:boolean=true;
 f2:boolean=false;
 f3:boolean=false;
 b1:string="show";
 f4:boolean=false;
 num1:number[]=[10,20,30,40,50];
 names:string[]=["sree","mouni","sai","suri","bhavs"]
 employees:Array<Employee>=[];  //array object

  constructor() { }
  //it is a life cycle method or func which will get call automatically after construction
  //this funct call only once which is use to do some initialization
  ngOnInit(): void {
    /*let emp1=new Employee(100,"sree",12000);
    let emp2=new Employee(101,"mouni",14000);
    let emp3=new Employee(103,"sai",16000);
    this.employees.push(emp1);
    this.employees.push(emp2);
    this.employees.push(emp3);*/
    let emp1:Employee={id:100,name:"sree",salary:12000}
    let emp2:Employee={id:101,name:"mouni",salary:14000}
    let emp3:Employee={id:103,name:"sai",salary:16000}
    this.employees.push(emp1);
    this.employees.push(emp2);
    this.employees.push(emp3);
  }
  addEmployeeDetails(idRef:any,nameRef:any,salaryRef:any){
    let idValue=idRef.value;
    let nameValue = nameRef.value;
    let salaryValue = salaryRef.value;
    let emp:Employee={id:idValue,name:nameValue,salary:salaryValue};
    this.employees.push(emp);
    idRef.value="";
    nameRef.value="";
    salaryRef.value="";
  }
  
  changeValue(){
    this.f3=true;
  }
  toggle(){
    if(this.f4){
      this.f4=false;
      this.b1="show";
    }
    else{
      this.f4=true;
      this.b1="hide";
    }
  }
}

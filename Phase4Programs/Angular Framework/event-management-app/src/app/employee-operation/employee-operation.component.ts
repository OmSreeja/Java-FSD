import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { EmployeeService } from '../employee.service';

@Component({
  selector: 'app-employee-operation',
  templateUrl: './employee-operation.component.html',
  styleUrls: ['./employee-operation.component.css']
})
export class EmployeeOperationComponent implements OnInit {
  employee:any
  constructor(public router:Router,public es:EmployeeService) { }

  ngOnInit(): void {
    let obj = sessionStorage.getItem("empInfo");
    if(obj != null){
        this.employee= JSON.parse(obj);
    }
  }
  ViewAll(){
    this.router.navigate(["employee"]);
}

deleteEmployee(id:any){
    this.es.delete(id).subscribe({
      next:(result:any)=>console.log(result),
      error:(error:any)=>console.log(error),
      complete:()=>console.log("completed")
    })
}
updateemp(){
  this.router.navigate(["update"]);
}


}

import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Employee } from './employee';


@Injectable({
  providedIn: 'root'
})
export class EmployeeService {

  constructor(public http:HttpClient) { }
  loadEmployeeData():Observable<Employee[]>{
    return this.http.get<Employee[]>("http://localhost:3000/employees");
  }

  // in post method 1st parameter url and 2nd parameter data in json format. 
  storeEmployeeData(employee:any):Observable<Employee>{
    return this.http.post<Employee>("http://localhost:3000/employees",employee);
  }

  // it is consider as path param 
  findEmployeeById(id:any):Observable<Employee>{
    return this.http.get<Employee>("http://localhost:3000/employees/"+id);
  }

  // it will delete using path param 
  delete(id:any):Observable<any>{
    return this.http.delete<any>("http://localhost:3000/employees/"+id);
  }
  updateemployeeData(employee:any):Observable<Employee>{
    return this.http.put<Employee>("http://localhost:3000/employees",employee);
  }
  getCurrentEmp(id:any){
    return this.http.get("http://localhost:3000/employees/"+id);
  }
  
  updateCurrentEmp(id:any,data:any){
    return this.http.put("http://localhost:3000/employees/"+id,data);
  }
  
}

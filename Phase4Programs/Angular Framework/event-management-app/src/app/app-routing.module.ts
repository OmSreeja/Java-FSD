import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { EmployeeOperationComponent } from './employee-operation/employee-operation.component';
import { EmployeeComponent } from './employee/employee.component';
import { LoginComponent } from './login/login.component';
import { UpdateComponent } from './update/update.component';

const routes: Routes = [
  {path:"employee",component:EmployeeComponent},
  {path:"employee-operation",component:EmployeeOperationComponent},
  {path:"update/:id",component:UpdateComponent},
  {path:"login",component:LoginComponent}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

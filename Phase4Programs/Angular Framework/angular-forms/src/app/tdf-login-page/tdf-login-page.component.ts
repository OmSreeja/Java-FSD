import { Component, OnInit } from '@angular/core';
import { CustomService } from './custom.service';
import { LoginService } from './login.service';

@Component({
  selector: 'app-tdf-login-page',
  templateUrl: './tdf-login-page.component.html',
  styleUrls: ['./tdf-login-page.component.css']
})
export class TdfLoginPageComponent implements OnInit {
  msg:string=""
  constructor(public ls:LoginService) { }            //DI for service class

  ngOnInit(): void {
  }
  checkUser(loginRef:any){
   //console.log(loginRef)
   let login=loginRef.value;
   /*if(login.email=="sree@gmail.com" && login.pass=="123"){
   this.msg="succesfully login"
  }
  else{
    this.msg="failure";
  }
  loginRef.reset();*/
   //let cs=new CustomService();
   //this.msg=cs.checkUserDetails(login);
   this.msg=this.ls.checkUserDetails(login);
   loginRef.reset();
  }
  
}

import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { CustomService } from '../tdf-login-page/custom.service';
import { LoginService } from '../tdf-login-page/login.service';

@Component({
  selector: 'app-mdf-login-page',
  templateUrl: './mdf-login-page.component.html',
  styleUrls: ['./mdf-login-page.component.css']
})
export class MdfLoginPageComponent implements OnInit {
   loginRef=new FormGroup({
    email:new FormControl("",[Validators.required]),       //1st parameter is value in text field
    pass:new FormControl("",[Validators.required])
   })
   msg:string="";
  constructor(public ls:LoginService) { }

  ngOnInit(): void {
  }
  checkUser(){
    let login=this.loginRef.value;
    //console.log(login)
    /*if(login.email=="sree@gmail.com" && login.pass=="123"){
      this.msg="succcessfully login"
    }
    else{
      this.msg="failure try once again"
    }
    this.loginRef.reset();*/
    //let cs=new CustomService();
   //this.msg=cs.checkUserDetails(login);
   this.msg=this.ls.checkUserDetails(login);
   this.loginRef.reset();
  }

}

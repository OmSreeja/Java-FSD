export class CustomService{
  checkUserDetails(login:any):string{
    if(login.email=="sree@gmail.com" && login.pass=="123"){
        return "success"
    }
    else{
        return "failure"
    }
  }
}
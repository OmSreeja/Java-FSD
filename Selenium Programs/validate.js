function validate(){
    //alert("hello");
    let email=document.getElementById("n1").value;
    let password=document.getElementById("n2").value;
    if(email.length==0){
        alert("plz enter email id")
        return false;
    }else if(password.length==0){
        alert("plz enter password")
        return false;
    }else if(email=="sree@gmail.com" && password=="123"){
        alert("successfully login")
        return true;
    }else{
        alert("failure try once again");
        return false;
    }
}
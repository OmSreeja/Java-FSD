function login(){
    
    var idValue = document.getElementById("n1").value
    var password = document.getElementById("n2").value;
    var obj = sessionStorage.getItem("obj");
    if(obj!=null){
        let empData = JSON.parse(obj);
        let result=empData.find((l)=>l.id==idValue&&l.password==password);
        if(result!=undefined){
            alert("success");
            return true;
        }
        else{
            alert("failure");
            return false;
        }
        

    }

}
function search(){
    var cour=document.getElementById("j1").value;
    var obj = sessionStorage.getItem("obj");
    if(obj!=null){
        let empData = JSON.parse(obj);
        let result=empData.find((l)=>l.course==cour);
        if(result!=undefined){
            alert("success");
        }
        else{
            alert("failure")
        }
    }
}
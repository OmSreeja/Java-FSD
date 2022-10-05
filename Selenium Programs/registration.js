var empInfo;
function register(){
   var idValue = document.getElementById("txt1").value
    var password = document.getElementById("txt2").value;
    var obj = sessionStorage.getItem("obj");
    let emp = {id:idValue,password:password};
    if(obj==null){
        empInfo = new Array();
        empInfo.push(emp);
        sessionStorage.setItem("obj",JSON.stringify(empInfo));
    }else {
        obj = JSON.parse(obj);
        obj.push(emp);
        sessionStorage.setItem("obj",JSON.stringify(obj));
    }
   document.getElementById("txt1").value=""
   document.getElementById("txt2").value=""
   document.getElementById("out").innerHTML="Dta added"
}
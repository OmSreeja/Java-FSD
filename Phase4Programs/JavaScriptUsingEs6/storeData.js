var empInfo;
function addData(){
   /*var name="sreeja";
   sessionStorage.setItem("obj1",name);
   localStorage.setItem("obj2",name);
   //alert("Data added...")
   document.getElementById("out").innerHTML="Data Added"*/
   var idValue = document.getElementById("id").value
    var nameValule = document.getElementById("name").value;
    var obj = sessionStorage.getItem("obj");
    let emp = {id:idValue,name:nameValule};
    if(obj==null){
        empInfo = new Array();
        empInfo.push(emp);
        sessionStorage.setItem("obj",JSON.stringify(empInfo));
    }else {
        obj = JSON.parse(obj);
        obj.push(emp);
        sessionStorage.setItem("obj",JSON.stringify(obj));
    }
   document.getElementById("id").value=""
   document.getElementById("name").value=""
   document.getElementById("out").innerHTML="Dta added"
}
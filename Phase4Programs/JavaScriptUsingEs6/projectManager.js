var budInfo;
function addClient(){
    var clientName=document.getElementById("cname").value
    var projectName=document.getElementById("pname").value
    var budgetValue=document.getElementById("budget").value
    var obj=sessionStorage.getItem("obj")
    let pm={ClientName:clientName,ProjectName:projectName,Budget:budgetValue}
    if(obj==null){
        budInfo=new Array();
        budInfo.push(pm)
        sessionStorage.setItem("obj",JSON.stringify(budInfo))
    }
    else{
        obj=JSON.parse(obj)
        obj.push(pm)
        sessionStorage.setItem("obj",JSON.stringify(obj))
    }
    document.getElementById("cname").value=""
    document.getElementById("pname").value=""
    document.getElementById("budget").value=""
    document.getElementById("out").innerHTML="Data added"
}

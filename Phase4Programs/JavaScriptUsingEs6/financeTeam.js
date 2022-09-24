function retrieveData(){
    var obj = sessionStorage.getItem("obj");
    if(obj==null){
        document.getElementById("out").innerHTML="Record not present"
    }else {
        let budData = JSON.parse(obj);
        for(let i =0;i<budData.length;i++){
            let pTag = document.createElement("p");
            let ptTagValue = document.createTextNode("Client Name is "+budData[i].ClientName+" Project Name is "+budData[i].ProjectName+" Budget is "+budData[i].Budget);
            pTag.appendChild(ptTagValue);
            document.getElementById("result").appendChild(pTag);
        }

    }
    
}
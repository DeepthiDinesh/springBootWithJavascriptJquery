function detailValidate(){
    var id= document.getElementById("userid").value;
    var name =document.getElementById("username").value;
    var callAdd = true;

        if (isNaN(id)) {
            document.getElementById("iderror").innerHTML = "<p style=\"color:red\">User ID must be a number!</p>";
            callAdd =false;
            //alert("inside nan");
        }

        if (!isNaN(name)) {
            document.getElementById("nameerror").innerHTML = "<p style=\"color:red\">User Name should not contain numbers!</p>";
            callAdd =false;
            //alert("inside not nan");
        }

        if(callAdd) {
           // alert("calling");
            addData(id, name);
        }


    alert("done");
}

function addData(id,name){

    var xmlhttp=new XMLHttpRequest();
    xmlhttp.onreadystatechange=function () {
        if(xmlhttp.readyState==4 &&xmlhttp.status==200)
            displayData(id);
    }
    xmlhttp.open("GET","http://localhost:8080/sample/adddata?name="+name+"&id="+id,true);
    xmlhttp.send();
}
function displayData(id) {
    var xmlhttp = new XMLHttpRequest();
    xmlhttp.onreadystatechange = function () {
        if (xmlhttp.readyState == 4 && xmlhttp.status == 200) {
            var resultjson = xmlhttp.responseText;
            var parsejson = JSON.parse(resultjson);
            var response="Hi "+parsejson.name+"! Your roll no is: "+parsejson.rollno+".";
            document.getElementById("result").innerText = response;
        }
    }
    xmlhttp.open("GET","http://localhost:8080/sample/databyid?id="+id,true);
    xmlhttp.send();
}
$(document).ready(function(){

/*    $("form").validate({
        rules: {
            username: { lettersonly: true }
        }
    });*/
    $('#buttonid').click(function(){
        var id=$('#userid').val();
        var name=$('#username').val();
     $.ajax({
         'url': 'http://localhost:8080/sample/adddata?name='+name+'&id='+id,
         'type': 'GET',
         'success': function(){
             $.ajax({
                 'url': 'http://localhost:8080/sample/databyid?id='+id,
                 'type': 'GET,
                 'success': function(data){
                     var response="Hi "+data.name+"! Your roll no is: "+data.rollno+".";
                     $('#result').html(response);
                 }
             })
         }
     })
    })
    });

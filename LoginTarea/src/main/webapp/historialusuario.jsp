<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
 <script src="http://code.jquery.com/jquery-latest.js"> </script>
  <script type="text/javascript">
     $(document).ready(function(){
       
          $.post('servelethistorial',{

          }, function(response){
          let datos = JSON.parse(response);
          //console.log(datos);
          var tabladatos = document.getElementById('tablaDatos');

           for(let item of datos){
            tabladatos.innerHTML += ` 
             

            `

           }

         

         });
     
     });
   </script>
<body>
<table class ="table table-dark" id="tablaDatos">
   <thead>
    <th>ID</th>
     <th>USUARIO</th>
      <th>FECHA</th>
       <th>NOMBRE</th>
        <th>APELLIDO</th>
   </thead>
   
   </table>
</body>
</html>
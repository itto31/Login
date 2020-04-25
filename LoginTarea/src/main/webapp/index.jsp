<!DOCTYPE html>
<html lang="en" dir="ltr">
  <head>
    <meta charset="utf-8">
    <link rel="stylesheet" type="text/css" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
      <link rel="stylesheet" href="css/login.css">
    <title></title>
  </head>
  <body>
    <form class="" action="ServelerUser" method="post">
       <div class="container" margin-top= 15px>
      <div class="d-flex justify-content-center h-100">
        <div class="card" id=contenedor>
          <div align="center" class="card-header" id=Cabezera>
            <h3>Login</h3>
          </div>
          <div class="card-body" id=cuerpo>
            <form>
              <div class="input-group form-group">
                <div class="input-group-prepend">
                  <span class="input-group-text"><img src="imagenes\usuario.png"></span>
                </div>
                <input type="text" class="form-control" placeholder="Usuario" name="Usuario">

              </div>
              <div class="input-group form-group">
                <div class="input-group-prepend">
                  <span class="input-group-text"><img src="imagenes\contrasena.png"></span>
                </div>
                <input type="password" class="form-control" placeholder="Contraseña" name="contra">
              </div>
              <div class="form-group">
                <input type="submit" value="Login" class="btn float-right btn-outline-secondary">
              </div>
            </form>
          </div>
          
        </div>
      </div>
    </div>            
    </form>
  </body>
</html>

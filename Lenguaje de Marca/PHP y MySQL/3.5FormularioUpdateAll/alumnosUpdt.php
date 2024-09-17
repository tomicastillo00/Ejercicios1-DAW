<html>
<html>

<head>
  <title>Problema</title>
</head>

<body>
  <?php
  
  $conexion = mysqli_connect("localhost:3307", "root","", "datos alumnos") or
    die("Problemas con la conexión");

    //Ejecutamos la query con el update para la actualizacion del alumno
    

  mysqli_query($conexion, "update datosalumnos set 
                          nombre='$_POST[nombre]', 
                          apellido1='$_POST[apellido1]', 
                          apellido2='$_POST[apellido2]', 
                          NIF='$_POST[NIF]', 
                          fechaNacimiento='$_POST[fechaNacimiento]', 
                          email='$_POST[email]', 
                          localidad='$_POST[localidad]', 
                          sexo='$_POST[sexo]', 
                          cuenta_twitter='$_POST[cuenta_twitter]'
                          where idAlumno=$_POST[idAlumno]")
    or die("Problemas en el select" . mysqli_error($conexion));


  mysqli_close($conexion);

  echo "El perfil del alumno ha sido actualizado.";
  ?>

</body>

</html>
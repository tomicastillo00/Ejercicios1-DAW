<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
<?php
$conexion = mysqli_connect("localhost:3307", "root", "", "datos alumnos") or
die("Problemas con la conexión");



$registros=mysqli_query($conexion, "update datosalumnos set 
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
echo "El alumno se ha actualizado correctamente";
?>

    
</body>
</html>
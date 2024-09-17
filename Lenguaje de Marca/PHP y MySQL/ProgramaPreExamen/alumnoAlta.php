<!DOCTYPE html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<style>
    body{
        text-align: center;
        position: absolute;
    }
    h1{
        color: green;
        background-color: aquamarine;
        border-radius: 3px;
        border-color: aqua;
    }
    a{
        color: floralwhite;
        background-color: chocolate;
        border-radius: 3px;
        border-color: aqua;
    }
</style>
<body>

<form method="post" action="alumnoAlta.php">
    Introduce nombre:
<input type="text" name="nombre" required>
<br>
    Introduce el primer apellido:
    <input type="text" name="apellido1" required>
<br>
    Introduce el segundo apellido:
    <input type="text" name="apellido2" required>
<br>
    Introduce tu NIF:
    <input type="text" pattern='[0-9]{8}[TRWAGMYFPDXBNJZSQVHLCKE]{1}$' name="NIF"required>
<br>
    Introduce la fecha de nacimiento:
    <input type="date" name="fechaNacimiento" required>
<br>
    Introduce tu email:
    <input type="text" name="email" required>
<br>
    Introduce la localidad:
    <input type="text" name="localidad" required>
<br>
    Introduce el sexo:
    <select name="sexo"required>
        <option value="Hombre">Hombre</option>
        <option value="Mujer">Mujer</option>
        <option value="No binario">No binario</option>
    </select>
<br>
    Introduce tu cuenta de twitter
    <input type="text" pattern='^([\\w-]+\\.)*?[\\w-]+@[\\w-]+\\.([\\w-]+\\.)*?[\\w]+$' name="cuenta_twitter" required>
    <br>
    <input type="submit" name="Agregar alumno">

</form>



<?php
if($_SERVER['REQUEST_METHOD']=="POST"){
$conexion = mysqli_connect("localhost:3307", "root", "", "datos alumnos") or
    die("Problemas con la conexión");

$query_insert="insert into datosalumnos(nombre,apellido1,apellido2,NIF,fechaNacimiento,email,localidad,sexo,cuenta_twitter) values 
('$_POST[nombre]','$_POST[apellido1]','$_POST[apellido2]','$_POST[NIF]','$_POST[fechaNacimiento]','$_POST[email]','$_POST[localidad]','$_POST[sexo]','$_POST[cuenta_twitter]')";

  mysqli_query($conexion, $query_insert)
    or die("Problemas en el select" . mysqli_error($conexion));

  mysqli_close($conexion);
    echo"El alumno se ha añadido a la base de datos";
}
?>
</body>
</html>
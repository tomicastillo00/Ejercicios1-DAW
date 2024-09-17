<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="refresh" content="3;url=Menu.html">
    <title>AlumnoAgregado</title>
</head>
<body>
    <?php
    $conexion=mysqli_connect("localhost", "root","", "alumnos") or die ("Problemas en la conexion");

    mysqli_query($conexion, "INSERT INTO datos_alumnos(Nombre,Apellido1,Apellido2,NIF,Fecha_Nacimiento,Email,Localidad,Sexo,Cuenta_Twitter) values
    ('$_POST[Nombre]','$_POST[Apellido1]','$_POST[Apellido2]','$_POST[NIF]','$_POST[Fecha_Nacimiento]','$_POST[Email]','$_POST[Localidad]','$_POST[Sexo]','$_POST[Cuenta_Twitter]')")
    or die ("Problemas en el insert" .mysqli_error($conexion));

    mysqli_close($conexion);

    echo "El alumno fue dado de alta satisfacctoriamente"
    ?>
</body>
</html>
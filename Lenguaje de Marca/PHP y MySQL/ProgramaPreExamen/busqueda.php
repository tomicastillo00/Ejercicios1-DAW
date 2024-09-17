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

$query_insert="select *
                from datosalumnos
                where nombre like '%$_POST[nombre]%'";

$registros=mysqli_query($conexion, $query_insert)
or die("Problemas en el select" . mysqli_error($conexion));

while ($alumno = mysqli_fetch_array($registros)) {
    echo "Nombre: ".$alumno['nombre']. "<br>";
    echo "Primer apellido: ".$alumno['apellido1']. "<br>";
    echo "Segundo apellido: ".$alumno['apellido2']. "<br>";
    echo "NIF: ".$alumno['NIF']. "<br>";
    echo "Fecha de nacimiento: ".$alumno['fechaNacimiento']. "<br>";

    echo "<a href='alumnoActualizar.php?idAlumno=" .$alumno['idAlumno']."'>Actualizar</a>";
    echo"<br>";
    echo "-----------------------------";
    echo "<br>";

}

mysqli_close($conexion);
?>

</body>
</html>
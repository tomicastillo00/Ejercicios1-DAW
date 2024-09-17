<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Consulta</title>
</head>
<body>
    <?php
$conexion = mysqli_connect("localhost", "root", "", "alumnos") or
die("Problemas con la conexión");

$registros=mysqli_query($conexion, "SELECT *
                                    FROM datos_alumnos
                                    WHERE Apellido1 like '%$_POST[Apellido1]%' ")
or die ("Problemas en la query" .mysqli_error($conexion));

while ($reg=mysqli_fetch_array($registros)) {
    echo "Codigo: " .$reg['Codigo_Alumno'] . "<br>";
    echo "Nombre: " .$reg['Nombre'] . "<br>";
    echo "Primer Apellido: " .$reg['Apellido1'] . "<br>";
    echo "Segundo Apellido: " .$reg['Apellido2'] . "<br>";
    echo "NIF: " .$reg['NIF'] . "<br>";
    echo "Fecha Nacimiento: " .$reg['Fecha_Nacimiento'] . "<br>";
    echo "Mail: " . $reg['Email'] . "<br>";
    echo "Localidad: " . $reg['Localidad'] . "<br>";
    echo "Sexo: ";
    switch ($reg['Sexo']) {
      case 1:
        echo "Masculino";
        break;
      case 2:
        echo "Femenino";
        break;
      case 3:
        echo "Otro";
        break;
    }
    echo "<br>";
    echo "Cuenta de Twitter: " . $reg['Cuenta_Twitter'] . "<br>";
    echo "<A href='Modificar.php?id=" . $reg['Codigo_Alumno'] . "'>Modificar</A>";
    echo "<hr>";
}

if(mysqli_num_rows($registros)==0){
    echo "No existe un alumno con ese apellido.";
    } else {
        echo "Se han encontrado ".mysqli_num_rows($registros)." registros con ese apellido.";
}




    ?>
    
</body>
</html>
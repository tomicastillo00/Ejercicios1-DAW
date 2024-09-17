<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Mostrar Alumnos</title>
</head>
<body>
    <?php
    $conexion=mysqli_connect("localhost","root","","alumnos") or die ("Problemas en la conexion");

    $registros=mysqli_query($conexion,"select Codigo_Alumno,Nombre,Apellido1,Apellido2,NIF,Fecha_Nacimiento,Email,Localidad,Sexo,Cuenta_Twitter
    from datos_alumnos") or die ("Problemas en la query " .mysqli_error($conexion));

    while ($reg = mysqli_fetch_array($registros)) {
        echo "Codigo_Alumno:" . $reg['Codigo_Alumno'] . "<br>";
        echo "Nombre:" . $reg['Nombre'] . "<br>";
        echo "Primer apellido:" . $reg['Apellido1'] . "<br>";
        echo "Segundo apellido:" . $reg['Apellido2'] . "<br>";
        echo "NIF:" . $reg['NIF'] . "<br>";
        echo "Fecha de Nacimiento:" . $reg['Fecha_Nacimiento'] . "<br>";
        echo "Email:" . $reg['Email'] . "<br>";
        echo "Localidad:" . $reg['Localidad'] . "<br>";
        echo "Sexo:";
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
        echo "Nombre de usuario de Twitter:" . $reg['Cuenta_Twitter'] . "<br>";
         echo "<A href='Modificar.php?id=" . $reg['Codigo_Alumno'] . "'>Modificar</A>";
        echo "<hr>";
      }
     
      mysqli_close($conexion);
    



    ?>
    
</body>
</html>
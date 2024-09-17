<html>
<head>
<meta http-equiv="refresh" content="3;url=Menu.html">
<title>Alumno agregado</title>
</head>
<body>
<?php
$conexion = mysqli_connect("localhost", "root", "", "alumnos") or
  die("Problemas con la conexión");

 

mysqli_query($conexion, "UPDATE datos_alumnos  SET 
  Nombre='{$_POST['Nombre']}',
  Apellido1='{$_POST['Apellido1']}',
  Apellido2='{$_POST['Apellido2']}',
  NIF='{$_POST['NIF']}',
  Fecha_Nacimiento='{$_POST['Fecha_Nacimiento']}',
  Email='{$_POST['Email']}',
  Localidad='{$_POST['Localidad']}',
  Sexo='{$_POST['Sexo']}',
  Cuenta_Twitter='{$_POST['Cuenta_Twitter']}' where Codigo_Alumno=$_POST[id]")
  or die("Problemas en el select" . mysqli_error($conexion));

mysqli_close($conexion);

echo "El alumno fue modificado correctamente.";
?>
</body>
</html>
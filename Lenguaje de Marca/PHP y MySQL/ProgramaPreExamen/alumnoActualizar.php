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
                where idAlumno='$_GET[idAlumno]'";

$registros=mysqli_query($conexion, $query_insert)
or die("Problemas en el select" . mysqli_error($conexion));

$alumno=mysqli_fetch_array($registros);
?>

<form method="post" action="alumnoUpdt.php">
    Introduce nombre:
<input type="text" name="nombre" value="<?php echo $alumno['nombre']; ?>" required>
<br>
    Introduce el primer apellido:
    <input type="text" name="apellido1" value="<?php echo $alumno['apellido1']; ?>" required>
<br>
    Introduce el segundo apellido:
    <input type="text" name="apellido2" value="<?php echo $alumno['apellido2']; ?>" required>
<br>
    Introduce tu NIF:
    <input type="text" pattern='[0-9]{8}[TRWAGMYFPDXBNJZSQVHLCKE]{1}$' name="NIF" value="<?php echo $alumno['NIF']; ?>" required>
<br>
    Introduce la fecha de nacimiento:
    <input type="date" name="fechaNacimiento" value="<?php echo $alumno['fechaNacimiento']; ?>" required>
<br>
    Introduce tu email:
    <input type="text" name="email" value="<?php echo $alumno['email']; ?>" required>
<br>
    Introduce la localidad:
    <input type="text" name="localidad" value="<?php echo $alumno['localidad']; ?>" required>
<br>
    Introduce el sexo:
    <br>
    <input type='radio' name='sexo' value='0'
    <?php if ($alumno['sexo'] == '0') {
      echo "checked ='checked'";
    }  ?>
    required>Hombre
    <input type='radio' name='sexo' value='1'
    <?php if ($alumno['sexo'] == '1') {
      echo "checked ='checked'";
    }  ?>
    >Mujer
    <input type='radio' name='sexo' value='2'
    <?php if ($alumno['sexo'] == '2') {
      echo "checked ='checked'";
    }  ?>
    >Indefinido
    <br>

    Introduce tu cuenta de twitter
    <input type="text" pattern='^([\\w-]+\\.)*?[\\w-]+@[\\w-]+\\.([\\w-]+\\.)*?[\\w]+$' name="cuenta_twitter" value="<?php echo $alumno['cuenta_twitter']; ?>" required>
    <br>
    <input type='hidden' value='<?php echo $_GET['idAlumno']; ?>' name='idAlumno'>
    <input type="submit" name="Actualizar alumno" value="Actualizar alumno">

</form>

    
</body>
</html>
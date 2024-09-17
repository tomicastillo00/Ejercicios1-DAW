<html>

<head>
  <title>Problema</title>
  <style>
    div {
      float: left;
      margin: 15px;
    }
  </style>
</head>

<body>
<?php
  $conexion = mysqli_connect("localhost:3307", "root", "", "datos alumnos") or
    die("Problemas con la conexión");

    //Hacemos un get para obtener la variable del link y ejecutamos la query
  $registros = mysqli_query($conexion, "select *
                                        from datosalumnos 
                                        where idAlumno=$_GET[idAlumno]") or
    die("Problemas en el select:" . mysqli_error($conexion));

    
      echo "<br>";

      //En alumno guardamos todos los campos del alumno selecionado, lo recorremos una vez para mostrarlo por pantalla
      $alumno = mysqli_fetch_array($registros);
        echo "<div class='registro'>";
        echo "Id: " . $alumno['idAlumno'] . "<br>";
        echo "Nombre: " . $alumno['nombre'] . "<br>";
        echo "Apellido1: " . $alumno['apellido1'] . "<br>";
        echo "Apellido2: " . $alumno['apellido2'] . "<br>";
        echo "NIF: " . $alumno['NIF'] . "<br>";
        echo "Fecha de nacimiento: " . $alumno['fechaNacimiento'] . "<br>";
        echo "Email: " . $alumno['email'] . "<br>";
        echo "Localidad: " . $alumno['localidad'] . "<br>";
        echo "Sexo: ";
        switch ($alumno['sexo']) {
          case '0':
            echo $alumno['sexo'];
            break;
          case '1':
            echo "Mujer";
            break;
          case '2':
            echo "Indefinido";
            break;  
        }
        echo "<br>";
        echo "Cuenta de Twitter: " . $alumno['cuenta_twitter'] . "<br>";

        echo "<div class='botones'>";
        
        echo "</div></div>";
        echo "<br><hr>";
    
  

  mysqli_close($conexion);
  
  //Abajo leemos el formulario para poder actualizarlo mandandoselo al archivo php que esta en el action
  ?> 
  
  <div>
  <h1>Actualizar perfil de alumno</h1>
 
  <form action='alumnosUpdt.php' method='post'>
    Ingrese nombre:
    <input type='text' size='30' placeholder='Nombre' name='nombre' value='<?php echo $alumno['nombre']; ?>' required><br>
    Ingrese primer apellido:
    <input type='text' size='30' placeholder='Primer apellido' value='<?php echo $alumno['apellido1']; ?>' name='apellido1'><br>
    Ingrese segundo apellido:
    <input type='text' size='30' placeholder='Segundo apellido' value='<?php echo $alumno['apellido2']; ?>' name='apellido2'><br>
    Ingrese NIF:
    <input type='text' pattern='[0-9]{8}[TRWAGMYFPDXBNJZSQVHLCKE]{1}$' value='<?php echo $alumno['NIF']; ?>' placeholder='NIF' name='NIF'><br>
    Ingrese fecha de nacimiento:
    <input type='date' name='fechaNacimiento' value='<?php echo $alumno['fechaNacimiento']; ?>' readonly required><br>
    Ingrese email:
    <input type='text' placeholder='Email' value='<?php echo $alumno['email']; ?>' size='70' name='email'><br>
    Ingrese localidad:
    <input type='text' size='50' placeholder='Localidad' value='<?php echo $alumno['localidad']; ?>' name='localidad'><br>
    Ingrese sexo:<br>
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
    Ingrese cuenta de twitter:
    <input type='text' pattern='@([A-Za-z0-9_]{1,15})$' value='<?php echo $alumno['cuenta_twitter']; ?>' size='50' placeholder='Cuenta de twitter' name='cuenta_twitter'><br>
    <input type='hidden' value='<?php echo $_GET['idAlumno']; ?>' name='idAlumno'>
    <input type='submit' value='Actualizar'>
    
  </form>
</div>


</body>

</html>
<html>

<head>
  <title>Problema</title>
</head>

<body>

  <?php

  $conexion = mysqli_connect("localhost:3307", "root", "", "datos alumnos") or
    die("Problemas con la conexión");

  $registros = mysqli_query($conexion, "select * 
                                        from datosalumnos
                                        where nombre like '%$_POST[nombre]%'") or
    die("Problemas en el select:" . mysqli_error($conexion));

    //Si hay mas de 0 registros, se ejecuta y se recorre tantas veces como registros haya
    if (mysqli_num_rows($registros)>0) {
        # code...
        //La variable alumno es un array/objeto que la cogemos de la base de datos, la cual cada campo es algo diferente(nombre,apellido,NIF)
        while ($Alumno = mysqli_fetch_array($registros)) {
            echo "Nombre: " . $Alumno['nombre'] . "<br><br>";
            echo "Apellido1: " . $Alumno['apellido1'] . "<br><br>";
            echo "Apellido2: " . $Alumno['apellido2'] . "<br><br>";
            echo "NIF: " . $Alumno['NIF'] . "<br><br>";
            echo "FechaNacimiento: " . $Alumno['fechaNacimiento'] . "<br><br>";
            echo "Email: " . $Alumno['email'] . "<br><br>";
            echo "Localidad: " . $Alumno['localidad'] . "<br><br>";
            echo "Sexo: ";
            switch ($Alumno['sexo']) {
                case '0':
                    echo "Masculino" . "<br><br>";
                    break;
                
                case '1':
                    echo "Femenino" . "<br><br>";
                    break;
                
                case '2':
                    echo "Indefinido" . "<br><br>";
                    break;
            }
            echo "CuentaTwitter: " . $Alumno['cuenta_twitter'] . "<br><br>";
            echo "Código del alumno: " . $Alumno['idAlumno'] . "<br><br>";
            echo "<a href='alumnosActualizar.php?idAlumno=". $Alumno['idAlumno'] . "'>";
            echo "<div><h1>Actualizar</h1></div>";
            echo "<a href='alumnoBorrar.php?idAlumno=". $Alumno['idAlumno'] . "'>";
            echo "<div><h1>Borrar</h1></div>";
            echo "</a>";
            echo "-----------------------------------------------<br>";
        }
        
    }
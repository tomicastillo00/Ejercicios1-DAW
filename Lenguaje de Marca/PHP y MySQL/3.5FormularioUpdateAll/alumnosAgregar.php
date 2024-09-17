<html>
    <head>
            <title>Registro de datos cargados en el formulario(codigocurso)</title>
    </head>
        <body>
      
            <?php
            $conexion=mysqli_connect("localhost:3307","root","","datos alumnos") or
            die ("Problemas con la conexion");
            
            mysqli_query($conexion, "insert into datosalumnos(nombre,apellido1,apellido2,NIF,fechaNacimiento,email,localidad,sexo,cuenta_twitter) values
                        ('$_POST[nombre]','$_POST[apellido1]','$_POST[apellido2]','$_POST[NIF]','$_POST[fechaNacimiento]','$_POST[email]','$_POST[localidad]','$_POST[sexo]','$_POST[cuenta_twitter]')")
                        or die ("Problemas en el select". mysqli_error($conexion));
                        //Si el campo es numerico, no hace falta ponerle comillas simples

                        mysqli_close($conexion);

                        echo "El alumno fue dado de alta.";
                        ?>
        </body>
    </html>
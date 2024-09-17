<html>
    <head>
            <title>Registro de datos cargados en el formulario(codigocurso)</title>
    </head>
        <body>
      
            <?php
            $conexion=mysqli_connect("localhost","root","","base1") or
            die ("Problemas con la conexion");
            
            mysqli_query($conexion, "insert into alumnos(nombre,mail,codigocurso) values
                        ('$_POST[nombre]','$_POST[mail]',$_POST[codigocurso])")
                        or die ("Problemas en el select". mysqli_error($conexion));

                        mysqli_close($conexion);

                        echo "El alumno fue dado de alta.";
                        ?>
        </body>
    </html>
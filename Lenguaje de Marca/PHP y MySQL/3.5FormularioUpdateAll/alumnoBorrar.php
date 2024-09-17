<html>
    <head>Borrar alumno</head>
    <body>
    <?php
            $conexion=mysqli_connect("localhost:3307","root","","datos alumnos") or
            die ("Problemas con la conexion");
            
            //Las variables que se mandan en href siempre es con $_GET
            $registros = mysqli_query($conexion, "delete from datosalumnos where idAlumno = $_GET[idAlumno]") or
                        die ("Problemas en el select". mysqli_error($conexion));

                        mysqli_close($conexion);
                        echo "El perfil ha sido borrado";
                        ?>
    </body>
</html>
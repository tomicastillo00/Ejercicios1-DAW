<html>
    <head>
            <title>Registro de datos cargados en el formulario(codigocurso)</title>
    </head>
        <body>
      
            <?php
            /* $servername, $username, $password, $dbname */
            $conexion=mysqli_connect("localhost:3307","root","","datos alumnos") or
            die ("Problemas con la conexion");
            
            $registros=mysqli_query($conexion, "select *
            from datosalumnos
            where apellido1='$_POST[apellido1]'")
                        or die ("Problemas en el select". mysqli_error($conexion));
                   
                        while($reg=mysqli_fetch_array($registros)){
                           
                            echo "Nombre " .$reg['nombre']."<br>";
                            echo "<br>";
                            echo "Primer apellido " .$reg['apellido1']."<br>";
                            echo "<br>";
                            echo "Segundo apellido " .$reg['apellido2']."<br>";

                         
                            //Añadimos boton de borrar para llamar a otro archivo php
                            echo "<A href=alumnoBorrar.php?id=".$reg['idAlumno'].">Borrar</A> <br>";
                            echo "<A href=alumnoModificar.php?id=".$reg['idAlumno'].">Modificar email</A> <br>";              
                          }
                        //Si no hay alumnos, es decir, si no hay filas con es nombre, se mostrara este mensaje
                        if(mysqli_num_rows($registros)==0){
                            echo "No se han encontrado alumnos con ese apellido";
                        }
                        else{
                            echo "Alumnos encontrados: ". mysqli_num_rows($registros);
                        }

                        mysqli_close($conexion);
                        ?>
        </body>
    </html>
<html>
    <head>Modificar alumno</head>
    <body>
    <br>
    <form method="post">
            Introduce el email nuevo:
            <input type="text" name="emailNuevo" required>
            <input type="submit" value="Modificar">
</form>
            <br>
    <?php
             $conexion=mysqli_connect("localhost:3307","root","","datos alumnos") or
             die ("Problemas con la conexion");

                        mysqli_query($conexion, "update datosalumnos
                        set email='$_GET[emailNuevo]' 
                      where idAlumno='$_GET[idAlumno]'") or
      die("Problemas en el select:" . mysqli_error($conexion));

         echo "El mail fue modificado con exito";
         mysqli_close($conexion);
         

  ?>
</body>

</html>

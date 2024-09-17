<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Modificar Alumno</title>
    </head>
    <body>
        <?php
                $conexion = mysqli_connect("localhost", "root", "", "alumnos") or die("Problemas con la conexión");

            $registros = mysqli_query($conexion, "select * from datos_alumnos where Codigo_Alumno=$_GET[id]") 
            or die("Problemas en el select:" . mysqli_error($conexion));

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
                echo "<hr>";
                echo "<div>
                    <h1>Modificar alumnos</h1>
                    <form action='Modificado.php' method='post'><br>
                    <input type='hidden' name='id'  value='" . $_GET['id'] . "' ><br><br>
                    *Ingrese el nombre:
                    <input type='text' name='Nombre' pattern='^([A-Z]{1}[a-z]+[ ]?){1,2}$' value='" . $reg['Nombre'] . "' ><br><br>
                    *Ingrese el primer apellido:
                    <input type='text' name='Apellido1' value='" . $reg['Apellido1'] . "' ><br><br>
                    *Ingrese el segundo apellido:
                    <input type='text' name='Apellido2' value='" . $reg['Apellido2'] . "' ><br><br>
                    *Ingrese el NIF:
                    <input type='text' name='NIF' pattern='^[0-9]{8}[T|R|W|A|G|M|Y|F|P|D|X|B|N|J|Z|S|Q|V|H|L|C|K|E]$' value='" . $reg['NIF'] . "' ><br><br>
                    Ingrese la fecha de nacimiento:
                    <input type='date' name='Fecha_Nacimiento' value='" . $reg['Fecha_Nacimiento'] . "' ><br><br>
                    Ingrese el email:
                    <input type='email' name='Email' pattern='^([\w-]+\.)?[\w-]+@[\w-]+\.([\w-]+\.)?[\w]+$' value='" . $reg['Email'] . "' ><br><br>
                    Ingrese la localidad:
                    <input type='text' name='Localidad' value='" . $reg['Localidad'] . "' ><br><br>
                    *Seleccione el sexo:
                    <select name='Sexo'>
                    <option value='1' " . ($reg['Sexo'] == 1 ? "selected" : "") . ">Masculino</option>
                    <option value='2' " . ($reg['Sexo'] == 2 ? "selected" : "") . ">Femenino</option>
                    <option value='3' " . ($reg['Sexo'] == 3 ? "selected" : "") . ">Otro</option>
                    </select>
                    <br><br>
                    Ingrese el nombre de usuario de Twitter
                    <input type='text' name='Cuenta_Twitter' pattern='^@([A-Za-z0-9_]{1,15})$' value='" . $reg['Cuenta_Twitter'] . "' ><br><br>
                    <input type='hidden' name='Codigo_Alumno' value='" . $reg['Codigo_Alumno'] . "'>
                    <br><br>
                    <input type='submit' value='Actualizar'>
                    </form>
            </div>";
            }
        ?>
    </body>
</html>
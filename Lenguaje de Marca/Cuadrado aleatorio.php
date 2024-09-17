<!DOCTYPE html>
<html>
    <style>
        body{
            background-color: #ebfafa;
        }
        table{
            height: 70%;
            width: 40%;
            margin-left: 30%;
            border: 2px dashed;
            border-radius: 10px;
            text-align: center;
        }
        /*Para pasar el cursor por encima*/
        td:hover{
            background-color: green;
        }
        .filaPar{
            background-color: #ccccff;
        }
        .filaImpar{
            background-color: white;
        }
        .cabecera{
            font-family: Arial, Helvetica, sans-serif;
            color: red;
            background-color: #33cccc;
            font-size: 40px;
            text-align: center;
        }
    </style>
    <head>
        <title>Cuadrado aleatorio</title>
        <?php
            /*Genera un cuadrado de 20 * 20 con números aleatorios.
            Almacenalo en una matriz y luego recorrerla para mostrarla por pantalla.
            El estilo de los números pares será diferente del de los números impares.*/

            $matriz = array();

            //Aquí se llena la matriz con números aleatorios
            for($i = 0; $i < 20; $i++){
                for($j = 0; $j < 20; $j++){
                    $matriz[$i][$j] = rand(1, 100);
                }
            }
            
            //Este es el cuadrado de 20 * 20
            //El echo que pone table border='1' es para que se vea el cuadrado y formar la tabla
            echo "<table border='1'>";
            for($i = 0; $i < 20; $i++){
                //Si no ponemos el echo de la fila, no se verá el cuadrado
                echo "<tr>";
                for($j = 0; $j < 20; $j++){

                    //si el número es par se pone en rojo
                    if($matriz[$i][$j] % 2 == 0){
                        echo "<td style='color: red;'>" . $matriz[$i][$j] . "</td>";
                    }

                    //si el numero es impar se pone en negro
                    else{
                        echo "<td>" . $matriz[$i][$j] . "</td>";
                    }
                }
                echo "</tr>";
            }
            echo "</table>";
            ?>
    </head>
</html>
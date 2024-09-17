<!DOCTYPE html>
<html>
    <head>Skytale</head>
    <body>
        <?php
            /* Vamos a cifrar el texto "En un lugar de la mancha de cuyo nombre no quiero acordarme." con una tabla de 5 columnas:
            El texto cifrado sería: "E rln uo u d.nl acdymniaa ud heoboecr ugema r rom na a,cneqore "

            ste sistema de codificacion se detalla en el siguiente enlace: https://es.wikipedia.org/wiki/Esc%C3%ADtala

            El programa pedirá el número de lados de la escítala, y un texto para codificar con una escítala del número de caras especificado.

            El programa mostrará:

            - El Texto original
            
            - El Texto cifrado

            - La matriz con el mensaje

            - La matriz transpuesta*/
            
            $texto = "En un lugar de la mancha de cuyo nombre no quiero acordarme.";
            $lados = 5;
            $textoCifrado = "";
            function crearMatriz($texto, $lados) {
                $matriz = array();
                $contador = 0;
                for ($i = 0; $i < $lados; $i++) {
                    for ($j = 0; $j < strlen($texto) / $lados; $j++) {
                        $matriz[$i][$j] = $texto[$contador];
                        $contador++;
                    }
                }
                return $matriz;
            }
            echo "Texto original: " . $texto . "<br>";
            echo "Texto cifrado: " . $textoCifrado . "<br>";
            echo "Matriz con el mensaje: <br>";
            $matriz = crearMatriz($texto, $lados);
            for ($i = 0; $i < $lados; $i++) {
                for ($j = 0; $j < strlen($texto) / $lados; $j++) {
                    echo $matriz[$i][$j] . " ";
                }
                echo "<br>";
            }
            echo "Matriz transpuesta: <br>";
            ?>
            <table>
                <?php
                for ($i = 0; $i < strlen($texto) / $lados; $i++) {
                    for ($j = 0; $j < $lados; $j++) {
                        echo "<td>" . $matriz[$j][$i] . "</td>";
                    }
                    echo "<br>";
                }
                ?>
            </table>
    </body>
</html>
            

        
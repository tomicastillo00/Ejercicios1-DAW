<!DOCTYPE html>
<html>
    <head>Skytale</head>
    <body>
        <?php
/*Realice un programa en PHP que nos permita obtener todos los puntos de silla que pueda tener una matriz de 6 filas y 6 columnas. Un punto de silla es aquel que es valor máximo de su fila y a la vez mínimo de su columna.

Usa por ejemplo la siguiente matriz:
4 5 3 2 1 4
3 7 2 5 8 4
2 8 6 3 5 6
3 9 5 2 4 3
2 6 4 7 3 2
3 7 5 6 8 1*/
            $matriz = array(
                array(4,5,3,2,1,4),
                array(3,7,2,5,8,4),
                array(2,8,6,3,5,6),
                array(3,9,5,2,4,3),
                array(2,6,4,7,3,2),
                array(3,7,5,6,8,1)
            );
            
            $max = 0;
            $min = 0;
            $puntos = array();
            for($i = 0; $i < count($matriz); $i++){
                $max = max($matriz[$i]);
                $pos = array_search($max, $matriz[$i]);
                for($j = 0; $j < count($matriz); $j++){
                    $columna[$j] = $matriz[$j][$pos];
                }
                $min = min($columna);
                if($max == $min){
                    $puntos[] = array($i, $pos);
                }
            }
            for($i = 0; $i < count($puntos); $i++){
                echo "Punto de silla en la fila ".$puntos[$i][0]." y columna ".$puntos[$i][1]."<br>";
            }
        ?>
    </body>
        
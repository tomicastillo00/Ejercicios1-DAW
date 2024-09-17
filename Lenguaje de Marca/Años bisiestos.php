<!DOCTYPE html>
<html>
    <head>Skytale</head>
    <body>
        <?php
        /*Crea una tabla con los 3000 primeros años, indicando cuales son bisiestos. Son bisiestos los que cumplen la siguiente condición:


Año bisiesto es el divisible entre 4, salvo que sea año secular —último de cada siglo, terminado en «00»—, en cuyo caso también ha de ser divisible entre 400.

($año % 4 == 0 && $año % 100 != 0) || ($año % 400 == 0)

Crea una función que te devuelva si es bisiesto o no.

Aplica un estilo diferente a los años bisiestos, para diferenciarlos de los años seculares.*/
        function esBisiesto($año){
            if(($año % 4 == 0 && $año % 100 != 0) || ($año % 400 == 0)){
                return true;
            }else{
                return false;
            }
        }
        echo "<table border=1>";
        for($i=1;$i<=3000;$i++){
            if(esBisiesto($i)){
                echo "<tr style='background-color:yellow;'><td>$i</td></tr>";
            }else{
                echo "<tr><td>$i</td></tr>";
            }
        }
        echo "</table>";
        ?>
    </body>
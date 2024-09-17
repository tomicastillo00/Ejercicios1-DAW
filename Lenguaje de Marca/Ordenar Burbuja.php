<!DOCTYPE html>
<html>
    <head>Metodo burbuja</head>
    <body>
        <?php
        echo"<br>";
        function ordenarBurbuja($array) {
            $n = count($array);
        
            for ($i = 0; $i < $n - 1; $i++) { //recorre el array las veces como de largo sea
                for ($j = 0; $j < $n - $i - 1; $j++) { //Recorre el array tantas veces como le queden huecos por delante
                    if ($array[$j] > $array[$j + 1]) {
                        // intercambiar $array[$j] y $array[$j + 1]
                        $temp = $array[$j];
                        $array[$j] = $array[$j + 1];
                        $array[$j + 1] = $temp;
                    }
                }
            }
        
            return $array;
        }
        
        
        $numeros = array(5, 3, 1, 4, 2);
        
        echo "Array original: ";
        for($i=0;$i<count($numeros);$i++){
            echo $numeros[$i]." ";
        }

        echo"<br>";
        $numerosOrdenados=ordenarBurbuja($numeros);
    
        
        echo "Array ordenado con el método de burbuja: ";
        for($i=0;$i<count($numerosOrdenados);$i++){
            echo $numerosOrdenados[$i]." ";
        }
        ?>
    </body>
</html>
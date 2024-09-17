<!DOCTYPE html>
<html>
    <head>Ordenar por burbuja</head>
    <body><?php
        $num= array(5, 1, 2, 4, 3);
        //Imprimir sin ordenar
        echo"Array sin ordenar";
        for ($i= 0; $i < count($num); $i++) {
            echo $num[$i];
        }

        $temp;
        $n=count($num);
        for ($i= 0; $i < $n-1; $i++) {
            for ($j= 0; $j < $n-$i-1; $j++) {
                if($num[$j] > $num[$j+1]) {
                    $temp=$num[$j];
                    $num[$j]= $num[$j+ 1];
                    $num[$j+1]= $temp;
                } 
        }
    }
    //Imprimir ya ordenado
    echo"Array ordenado";
        for ($i= 0; $i < count($num); $i++) {
            echo $num[$i];
        }
        ?>
    </body>
</html>
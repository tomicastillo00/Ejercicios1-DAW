<html>
    <head></head>
    <body>
        <?php
        $num=rand(1,100);
        echo $num;
        if ($num <= 50) {
            echo "El numero es menor o igual a 50";
        }
        else {
            echo "El numero no es menor o igual que 50";
        }
        ?>
    </body>
</html>
<html>
    <head></head>
    <body>
        <?php
        $fecha=date("d");
        if($fecha<=8){
            echo"sitio activo";
        }
    else {
        echo "sitio inactivo";
    }
        ?>
    </body>
</html>
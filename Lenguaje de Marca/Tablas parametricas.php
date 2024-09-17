<html>
    <head>Tablas de multiplicar parametricas</head>
    <body>
        <?php
        $num1= $_REQUEST['num1'];
        $num2= $_REQUEST['num2'];
        echo "<br>";
        for($f=$num1;$num2>=$f;$f++){
            for($num=0;$num<=10;$num++){
                $mul=$num*$f;
                echo $num." x ".$f." = ".$mul;
                echo "<br>";
            }
            echo"<br>";
           
        }
        ?>
    </body>
</html>
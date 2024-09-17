<!DOCTYPE html>
<html>
    <head>Tabla aleatorio</head>
    <body>
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
        tr:hover{
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
        <?php
        echo "<table>";
        echo "<tr class='cabecera'><td>Numero</td><td>Resultado</td></tr>";

        for ($x = 1; $x <= 10; $x++) {
        $num=rand(1,100);

        if($x%2== 0) {
            echo "<tr class='filaPar'><td>$num</td>";
        }
        else {
            echo "<tr class='filaImpar'><td>$num</td>";
        }

        if($num < 50) {
        echo "<td>Es menor a 50</td>";
        }
        else {
            echo "<td>Es mayor a 50</td>";
        }
    }
        echo "</tr>";
        echo "</table";
        ?>
    </body>
</html>
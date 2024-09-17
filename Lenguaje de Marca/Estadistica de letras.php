<!DOCTYPE html>
<html>
<head>
<title>Contar caracteres</title>
</head>
<body>
<?php
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    if (isset($_POST["palabra"])) {
        $texto = $_POST["palabra"];

      
        $contador_caracteres = array_count_values(str_split($texto));

        
        echo "<h2>Resultados:</h2>";
        echo "<ul>";
        foreach ($contador_caracteres as $caracter => $cantidad) {
            echo "<li>Caracter '$caracter': $cantidad veces</li>";
        }
        echo "</ul>";
    }
}
?>
</body>
</html>
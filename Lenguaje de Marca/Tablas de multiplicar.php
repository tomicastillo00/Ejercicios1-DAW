<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Tablas de multiplicar</title>
    <style>
        table {
            width: 80%;
            border-collapse: collapse;
            margin: 20px auto;
        }

        table, th, td {
            border: 1px solid black;
        }

        th, td {
            padding: 10px;
            text-align: center;
        }

        .tabla-container {
            display: flex;
            justify-content: space-between;
            flex-wrap: wrap;
        }
    </style>
</head>
<body>

<?php
// Función para generar una tabla de multiplicar
function generarTabla($inicio, $fin) {
    echo "<table>";
    for ($i = 1; $i <= 10; $i++) {
        $resultado = $inicio * $i;
        echo "<tr><td>$inicio x $i = $resultado</td></tr>";
    }
    echo "</table>";
}

echo "<div class='tabla-container'>";
for ($tabla = 1; $tabla <= 10; $tabla++) {
    generarTabla($tabla, $tabla);
}
echo "</div>";
?>

</body>
</html>

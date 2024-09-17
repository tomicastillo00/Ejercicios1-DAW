<!DOCTYPE html>
<html>
    <head>
        <title>Calendario</title>
        <body>
            <form action="calen.php" method="post">
                <label for="mes">Mes:</label>
                <input type="text" id="mes" name="mes">
                <label for="anio">Año:</label>
                <input type="text" id="anio" name="anio">
                <input type="submit" value="Generar calendario">
            </form>
<?php
function generarCalendario($mes, $anio) {
    // Obtener el primer día del mes
    $primerDia = mktime(0, 0, 0, $mes, 1, $anio);
    
    // Obtener el número de días en el mes
    $numDias = date('t', $primerDia);
    
    // Obtener el día de la semana del primer día del mes
    $diaSemana = date('N', $primerDia);
    
    // Crear la tabla HTML
    $tabla = '<table>';
    $tabla .= '<tr><th>Lun</th><th>Mar</th><th>Mié</th><th>Jue</th><th>Vie</th><th>Sáb</th><th>Dom</th></tr>';
    
    // Agregar celdas vacías para los días previos al primer día del mes
    $tabla .= '<tr>';
    for ($i = 1; $i < $diaSemana; $i++) {
        $tabla .= '<td></td>';
    }
    
    // Agregar celdas para los días del mes
    for ($dia = 1; $dia <= $numDias; $dia++) {
        $tabla .= '<td>' . $dia . '</td>';
        
        // Si es domingo (día 7), cerrar la fila y comenzar una nueva
        if ($diaSemana == 7) {
            $tabla .= '</tr><tr>';
            $diaSemana = 1;
        } else {
            $diaSemana++;
        }
    }
    
    // Agregar celdas vacías para los días restantes de la última semana
    while ($diaSemana > 1 && $diaSemana <= 7) {
        $tabla .= '<td></td>';
        $diaSemana++;
    }
    
    $tabla .= '</tr>';
    $tabla .= '</table>';
    
    return $tabla;
}

// Obtener el mes y año ingresados por el usuario
$mes = $_POST['mes'];
$anio = $_POST['anio'];

// Generar la hoja de calendario
$calendario = generarCalendario($mes, $anio);

// Mostrar la hoja de calendario en pantalla
echo $calendario;
?>
        </body>
</html>
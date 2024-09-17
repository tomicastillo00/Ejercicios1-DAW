<?php
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $month = $_POST["month"];
    $year = $_POST["year"];
    
    
    $calendarHTML = generateCalendar($month, $year);
    
   
    echo $calendarHTML;
}
function generateCalendar($month, $year) {
    
    $dayweek = array("Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo");

   
    $daymonth = cal_days_in_month(CAL_GREGORIAN, $month, $year);

    // Primer día de la semana del mes
    $firstDayOfMonth = date("N", strtotime("$year-$month-01"));

    // Crear tabla HTML para mostrar el calendario
    $calendarHTML = "<table>";
    $calendarHTML .= "<tr>";
    foreach ($dayweek as $day) {
        $calendarHTML .= "<td>$day</td>";
    }
    $calendarHTML .= "</tr><tr>";

    // Rellenar celdas vacías hasta el primer día del mes
    for ($i = 1; $i < $firstDayOfMonth; $i++) {
        $calendarHTML .= "<td></td>";
    }

    // Mostrar los días del mes
    for ($day = 1; $day <= $daymonth; $day++) {
        $calendarHTML .= "<td>$day</td>";

        // Si el día es Domingo (7), cerrar fila y empezar otra
        if (($day + $firstDayOfMonth - 1) % 7 == 0) {
            $calendarHTML .= "</tr><tr>";
        }
    }

    // Completar la última semana del mes con celdas vacías si es necesario
    $lastDayOfWeek = date("N", strtotime("$year-$month-$daymonth"));
    if ($lastDayOfWeek != 7) {
        $remainingDays = 7 - $lastDayOfWeek;
        for ($i = 0; $i < $remainingDays; $i++) {
            $calendarHTML .= "<td></td>";
        }
    }

    $calendarHTML .= "</tr></table>";
    
    return $calendarHTML;
}

// Verificar si se recibieron los datos del formulario

?>
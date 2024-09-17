<!DOCTYPE html>
<html>
<head>
<title>Quitar vocales</title>
</head>
<body>
<?php
$cadena = $_POST["palabra"];
$transformada = "";

for ($i = 0; $i < strlen($cadena); $i++) {
    //2 metodos
    //$letra = substr($cadena,$i,1);
    $letra = $cadena[$i];
    $letraMinuscula = strtolower($letra);
   
    if (in_array($letraMinuscula, ["a", "e", "i", "o", "u"])) {
        
        
        
       
    } else {
        
        $transformada .= $cadena[$i];
    }
    
}
echo $transformada;
?>
</body>
</html>
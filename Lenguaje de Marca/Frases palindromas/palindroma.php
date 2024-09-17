<!DOCTYPE html>
<html>
    <meta charset="utf-8">

<head>
<title>Palindroma</title>
</head>
<body>
<?php
//Definimos la variables
$cadena = $_POST["frase"];
$cadenaInv="";
$quitarCaracter=" ";
//Pasamos la cadena a minuscula
$cadena=strtolower($cadena);

//Sacamos todas las letras desde el final hasta el principio de la cadena
for ($i= strlen($cadena); $i>=0; $i--) {
$cadenaInv.=substr($cadena, $i,1);
}

//Le quitamos los espacios
$cadena=str_replace($quitarCaracter,"",$cadena);
$cadenaInv=str_replace($quitarCaracter,"",$cadenaInv);

//Finalmente comprobamos si la frase introducida, y la que se le ha dado la vuelta, son iguales
if ($cadena==$cadenaInv) {
echo"La frase introducida es palindroma";
}
else
echo "La frase introducida NO es palindroma";

echo "<br>";

echo $cadenaInv;
echo "<br>";
echo $cadena;

?>
</body>
</html>
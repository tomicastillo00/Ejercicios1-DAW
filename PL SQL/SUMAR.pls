CREATE OR REPLACE FUNCTION SUMAR (sumando1 in number, sumando2 in number)
RETURN VARCHAR2 AS 
v_suma VARCHAR2(100);
BEGIN
v_suma:='La suma es: '||(sumando1 + sumando2);
  RETURN v_suma;
END SUMAR;

/*llamada a la funcion*/
/*SELECT sumar(10,20) FROM dual;*/

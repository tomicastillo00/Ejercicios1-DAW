CREATE OR REPLACE TRIGGER CAMBIOCOMISION 
BEFORE UPDATE OF COMMISSION_PCT ON EMPLOYEES 
FOR EACH ROW 
BEGIN
INSERT INTO AuditarCambioComision  (Comentario) VALUES (
    'El empleado con nombre '|| :OLD.FIRST_NAME || 'y numero de empleado ' || :OLD.EMPLOYEE_ID||
    ' ha pasado de tener una comision' ||:OLD.COMMISSION_PCT||' a ' ||:NEW.COMMISSION_PCT ||' a dia de '|| TO_CHAR(SYSDATE,'DD-MON-YYYY HH24:MI_SS'));

END;
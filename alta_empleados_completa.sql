--------------------------------------------------------
-- Archivo creado  - miércoles-mayo-22-2024   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Procedure ALTA_EMPLEADOS_COMPLETA
--------------------------------------------------------
set define off;

  CREATE OR REPLACE NONEDITIONABLE PROCEDURE "FELI"."ALTA_EMPLEADOS_COMPLETA" (
    P_FIRST_NAME EMPLOYEES.FIRST_NAME%TYPE, 
    P_LAST_NAME EMPLOYEES.LAST_NAME%TYPE, 
    P_EMAIL EMPLOYEES.EMAIL%TYPE, 
    P_PHONE_NUMBER EMPLOYEES.PHONE_NUMBER%TYPE,
    P_HIRE_DATE EMPLOYEES.HIRE_DATE%TYPE,
    P_JOB_TITLE JOBS.JOB_TITLE%TYPE,
    P_SALARY EMPLOYEES.SALARY%TYPE,
    P_COMMISSION_PCT EMPLOYEES.COMMISSION_PCT%TYPE,
    P_MANAGER_ID EMPLOYEES.MANAGER_ID%TYPE,
    P_DEPARTMENT_NAME DEPARTMENTS.DEPARTMENT_NAME%TYPE
    )AS
    
    V_JOB_ID JOBS.JOB_ID%TYPE;
    V_DEPARTMENT_ID DEPARTMENTS.DEPARTMENT_ID%TYPE;
    V_COUNT NUMBER;

BEGIN

     -- Validar que los campos obligatorios están informados
    IF P_LAST_NAME IS NULL THEN
        DBMS_OUTPUT.PUT_LINE('El campo last name es obligatorio.');
        return;
    ELSIF P_EMAIL IS NULL THEN
        DBMS_OUTPUT.PUT_LINE('El campo email es obligatorio.');
        return;
    ELSIF P_HIRE_DATE IS NULL THEN
        DBMS_OUTPUT.PUT_LINE('El campo hire date es obligatorio.');
        return;
    ELSIF P_SALARY IS NULL THEN
        DBMS_OUTPUT.PUT_LINE('El campo salary es obligatorio.');
        return;
    END IF;
    
    -- Validar que el email no se repite
    SELECT COUNT(*)
    INTO V_COUNT
    FROM EMPLOYEES
    WHERE EMAIL = P_EMAIL;
    
    IF v_count > 0 THEN
        DBMS_OUTPUT.PUT_LINE('El email ya existe.');
        return;
    END IF;
      
    BEGIN
        SELECT JOB_ID
        INTO V_JOB_ID
        FROM JOBS 
        WHERE JOB_TITLE = P_JOB_TITLE;
        
        EXCEPTION
            WHEN NO_DATA_FOUND THEN
                DBMS_OUTPUT.PUT_LINE('NO EXISTE ESE EMPLEADO');  
                RETURN;
    END;
    
    BEGIN
    
        SELECT DEPARTMENT_ID
        INTO V_DEPARTMENT_ID
        FROM DEPARTMENTS 
        WHERE DEPARTMENT_NAME = P_DEPARTMENT_NAME;
        
        EXCEPTION
            WHEN NO_DATA_FOUND THEN
                DBMS_OUTPUT.PUT_LINE('NO EXISTE ESE EMPLEADO');  
                RETURN;
    END;
    
    INSERT INTO EMPLOYEES (EMPLOYEE_ID, FIRST_NAME, LAST_NAME, EMAIL, PHONE_NUMBER, HIRE_DATE, JOB_ID, SALARY, COMMISSION_PCT, MANAGER_ID, DEPARTMENT_ID)
    VALUES (employees_seq.NEXTVAL, P_FIRST_NAME, P_LAST_NAME, P_EMAIL, P_PHONE_NUMBER, SYSDATE, V_JOB_ID, P_SALARY, P_COMMISSION_PCT, P_MANAGER_ID, V_DEPARTMENT_ID );
   
   EXCEPTION 
        WHEN OTHERS THEN 
                DBMS_OUTPUT.PUT_LINE('Error'||SQLCODE||SQLERRM);

END ALTA_EMPLEADOS_COMPLETA;

/

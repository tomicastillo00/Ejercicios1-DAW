--1
SELECT *
FROM EMP;

--2
SELECT *
FROM DEPT;

--2
SELECT LOC,DNAME
FROM dept
where DEPTNO!=30
order by loc;

--3
SELECT ename,job
FROM EMP
Where job = 'CLERK';

--4
SELECT ename,job
FROM EMP
Where job = 'CLERK'
ORDER BY ENAME;

--5
SELECT ename,job
FROM EMP
Where job = 'CLERK' OR job ='MANAGER';

--5
SELECT ename,job
FROM EMP
Where job = 'CLERK' OR job ='MANAGER'
order by ename;

--6
SELECT ename,sal
FROM emp
order by ename;

--7
SELECT DNAME
FROM DEPT;

--8
SELECT DNAME
FROM DEPT
ORDER BY DNAME;

--9
SELECT DNAME
FROM DEPT
ORDER BY LOC;

--10
SELECT DNAME
FROM DEPT
ORDER BY LOC DESC ;

--11
SELECT ENAME,JOB
FROM EMP
ORDER BY SAL;

--12
SELECT ENAME,JOB
FROM EMP
ORDER BY SAL,JOB;

--13
SELECT ENAME,JOB
FROM EMP
ORDER BY SAL,JOB DESC;

--14
SELECT SAL,COMM
FROM EMP
where DEPTNO=30;

--15
SELECT SAL,COMM
FROM EMP
where DEPTNO=30
ORDER BY COMM;

--16
SELECT DISTINCT COMM
FROM EMP;

--16
SELECT COMM
FROM EMP
WHERE COMM IS NOT NULL
ORDER BY COMM;

--17
SELECT DISTINCT COMM,ENAME
FROM EMP;

--18
SELECT DISTINCT SAL,ENAME
FROM EMP
ORDER BY SAL;

--19
SELECT DISTINCT COMM,DEPTNO
FROM EMP;

--20
SELECT ENAME,(SAL+1000)
FROM EMP
WHERE DEPTNO=30;

--21
SELECT ENAME,(SAL+1000),SAL
FROM EMP
WHERE DEPTNO=30;

--22
SELECT ENAME
FROM EMP
WHERE COMM>(SAL/2);

--23
SELECT ENAME
FROM EMP
WHERE COMM<=(SAL/4);

--24
SELECT 'Nombre='||ENAME AS NOMBRE,'Puesto='||JOB AS PUESTO
FROM EMP;

--25
SELECT SAL,COMM
FROM EMP
WHERE EMPNO>7500;

--26
SELECT ENAME,JOB
FROM EMP
WHERE ENAME>'J*'
Order by ENAME;

--27
SELECT EMPNO,ENAME,SAL,COMM,(SAL+COALESCE(COMM,0)) AS SALARIO_TOTAL
FROM EMP
WHERE COMM IS NOT NULL
ORDER BY EMPNO;

--28
SELECT EMPNO,ENAME,SAL,COALESCE(COMM,0),COALESCE(COMM,0)+SAL AS SALARIO_TOTAL
FROM EMP
WHERE COMM IS NULL
ORDER BY EMPNO;

--28
SELECT EMPNO,ENAME,SAL,NVL(COMM,0),NVL(COMM,0)+SAL AS SALARIO_TOTAL
FROM EMP
WHERE COMM IS NULL
ORDER BY EMPNO;

--29
SELECT EMPNO,ENAME,SAL
FROM EMP
WHERE SAL>1000 and MGR=7698;

--30
SELECT EMPNO,ENAME,SAL
FROM EMP
WHERE SAL<=1000 OR NVL(MGR,0)!=7698;

--31
SELECT ENAME,COALESCE(COMM,0),SAL,COALESCE(COMM,0)+SAL,((COALESCE(COMM,0)*100)/(COALESCE(COMM,0)+SAL))
FROM EMP
ORDER BY ENAME;

--32
SELECT ENAME,DEPTNO
FROM EMP
WHERE DEPTNO=10 AND ENAME NOT LIKE '%LA%';

--33
SELECT ENAME,JOB
FROM EMP
WHERE JOB='PRESIDENT';

--34
SELECT * 
FROM DEPT
WHERE DNAME!='SALES' AND DNAME!='RESEARCH'
ORDER BY loc;

--35
SELECT ENAME,DEPTNO 
FROM EMP
WHERE DEPTNO!=10 AND SAL>800 AND JOB='CLERK'
ORDER BY hiredate;

--36 
SELECT ENAME,COMM,SAL/COALESCE(COMM,0)
FROM EMP
WHERE COMM!=0
ORDER BY ENAME;

--37
SELECT ENAME
FROM EMP
WHERE LENGTH(ENAME)=5;

--38
SELECT ENAME
FROM EMP
WHERE LENGTH(ENAME) > 4;

--39
SELECT ENAME,SAL,COMM,DEPTNO
FROM EMP
WHERE (ENAME LIKE 'A%' AND SAL>1000) OR (COMM>=0 AND DEPTNO=30);

--40
SELECT ENAME,(SAL+COALESCE(COMM,0)),SAL
FROM EMP
ORDER BY (SAL+COALESCE(COMM,0)),SAL;

--41
SELECT ENAME,SAL,(COALESCE(COMM,0))
FROM EMP
WHERE SAL>(COMM/2) AND SAL < COMM;

--42
SELECT ENAME,SAL,(COALESCE(COMM,0))
FROM EMP
WHERE ENAME NOT IN (SELECT ENAME
                FROM EMP
                WHERE SAL>(COMM/2) AND SAL < COMM);

SELECT ENAME,SAL,(COALESCE(COMM,0))
FROM EMP
WHERE  SAL< (NVL(COMM,0)/2) OR SAL > NVL(COMM,0);

--43
SELECT ENAME,JOB
FROM EMP
WHERE ENAME LIKE 'A%' AND JOB LIKE '%MAN';

SELECT ENAME,JOB
FROM EMP
WHERE ENAME NOT IN (SELECT ENAME
                    FROM EMP
                    WHERE ENAME LIKE 'A%' AND JOB LIKE '%MAN');
SELECT ENAME,JOB
FROM EMP
MINUS
SELECT ENAME,JOB
FROM EMP
WHERE ENAME LIKE 'A%' AND JOB LIKE '%MAN';

--44
SELECT ENAME,JOB
FROM EMP
WHERE LENGTH(JOB) > 4 AND ENAME LIKE 'A%';

--45
SELECT ENAME
FROM EMP
WHERE LENGTH(ENAME) < 6;

--46
SELECT ENAME,SAL,((SAL*0.06)+SAL),((((SAL*0.06)+SAL)*0.07)+SAL),DECODE (COMM,NULL,'NO TIENE COMISION','TIENE COMISION')"�TIENE COMISION?"
FROM EMP;

--47
SELECT ENAME,HIREDATE
FROM EMP
WHERE JOB != 'SALESMAN';

--48
SELECT *
FROM EMP
WHERE EMPNO IN (7844,7900,7521, 7782, 7934, 7678,7369) AND EMPNO NOT IN (7902,7839,7499,7878);

--49
SELECT ENAME,(SAL+(COALESCE(COMM,0)))
FROM EMP;

--50
SELECT ENAME,DEPTNO
FROM EMP
ORDER BY DEPTNO;

--50
SELECT EMP.ENAME,DEPT.DNAME,DEPT.DEPTNO
FROM EMP,DEPT
where EMP.DEPTNO=DEPT.DEPTNO
ORDER BY DEPT.DNAME;

--50
SELECT ENAME,EMPNO
FROM EMP
ORDER BY EMPNO DESC;

--51
SELECT EMPNO,ENAME,MGR,SAL,DEPTNO
FROM EMP
WHERE (EMPNO<MGR AND SAL>1000 AND SAL<2000) OR (DEPTNO=30);

--52
SELECT MAX(SAL)SALARIO_MAS_ALTO,SUM(COMM)SUMA_TOTAL_COMISIONES,COUNT(EMPNO)NUMERO_DE_EMPLEADOS
FROM EMP;


--53
SELECT ENAME,SAL
FROM EMP
WHere SAL>(SELECT SAL
            FROM EMP
            WHERE EMPNO=7934)
ORDER BY SAL;
            
SELECT ENAME,SAL
FROM EMP
WHERE SAL>(SELECT AVG(SAL)
            FROM EMP
            WHERE DEPTNO=10);
            
SELECT EMP.ENAME,EMP.SAL,DEPT.DNAME
FROM EMP,DEPT
WHERE SAL>(SELECT AVG(EMP.SAL)
            FROM EMP,DEPT
            WHERE DEPT.DEPTNO=EMP.DEPTNO AND DEPT.DNAME='ACCOUNTING')
AND DEPT.DEPTNO=EMP.DEPTNO
ORDER BY SAL;


--54
SELECT ENAME,JOB,SAL
FROM EMP
WHERE SAL>=(SELECT SAL
            FROM EMP
            WHERE ENAME='ALLEN');

--55
SELECT MAX(ENAME)
FROM EMP;


--56
SELECT MAX(SAL),MIN(SAL),(MAX(SAL)-MIN(SAL)) AS DIFERENCIA
FROM EMP;

--57
SELECT ENAME,SAL
FROM EMP
WHERE SAL= (SELECT MAX(SAL) FROM EMP) OR SAL = (SELECT MIN(SAL) FROM EMP);

--58
SELECT ROUND(AVG(SAL),2)MEDIA_SALARIO ,EMP.DEPTNO, DEPT.DNAME
FROM DEPT,EMP
WHERE DEPT.DEPTNO = EMP.DEPTNO AND (SAL>900 AND SAL<5000)
GROUP BY EMP.DEPTNO,DEPT.DNAME;

--59
SELECT ENAME,DEPT.LOC
FROM EMP,DEPT
WHERE LENGTH(DEPT.LOC) > 5 AND DEPT.DEPTNO = EMP.DEPTNO
ORDER BY DEPT.LOC DESC;

--60
SELECT ENAME,SAL
FROM EMP
WHERE SAL >= (SELECT SUM(SAL)/14 FROM EMP);

SELECT ENAME,SAL
FROM EMP
WHERE SAL >= (SELECT AVG(SAL) FROM EMP);




SELECT AVG(SAL) FROM EMP;
SELECT SUM(SAL)/14 FROM EMP;
SELECT SUM(SAL)/COUNT (SAL) FROM EMP;
SELECT AVG(COMM) FROM EMP;
SELECT AVG(NVL(COMM,0)) FROM EMP;
/*Contando los nulos*/
SELECT SUM(NVL(COMM,0))/COUNT(NVL(COMM,0)) FROM EMP;
/*Sin contar los nulos*/
SELECT SUM(COMM)/COUNT(COMM) FROM EMP;
/*comprobante*/
SELECT COUNT(NVL(COMM,0)),COUNT(COMM) FROM EMP;



--61
SELECT DEPT.DEPTNO,EMP.SAL,EMP.ENAME
FROM EMP,DEPT
WHERE EMP.DEPTNO=DEPT.DEPTNO AND SAL=(SELECT MAX(SAL)
                                        FROM EMP
                                        WHERE EMP.DEPTNO=DEPT.DEPTNO);


--62
SELECT COUNT(DISTINCT JOB) AS "EMPLEOS DIFERENTES",COUNT (ENAME) AS "EMPLEADOS",COUNT(DISTINCT SAL) AS "SALARIO DIFERENTES",SUM(SAL) AS "SUMA SALARIO"
FROM EMP
WHERE DEPTNO=30;

--63
SELECT COUNT(ENAME)
FROM EMP
WHERE JOB= 'SALESMAN';

SELECT COUNT(ENAME)
FROM EMP
WHERE COMM IS NOT NULL;

--64
SELECT COUNT(ENAME)
FROM EMP
WHERE DEPTNO = 20;

--65
SELECT COUNT (ENAME),DEPTNO
FROM EMP
GROUP BY DEPTNO
HAVING COUNT (ENAME)>3;

--66
SELECT ENAME,JOB
FROM EMP
WHERE   DEPTNO=10 AND JOB IN (SELECT EMP.JOB
                                FROM DEPT,EMP
                                WHERE DEPT.DNAME = 'SALES' AND DEPT.DEPTNO = EMP.DEPTNO);
                                
--67
SELECT DISTINCT MGR
FROM EMP
WHERE MGR IS NOT NULL
ORDER BY  MGR DESC;

SELECT ENAME
FROM EMP
WHERE EMPNO IN (SELECT DISTINCT MGR
                FROM EMP
                WHERE MGR IS NOT NULL)
ORDER BY  ENAME DESC;

SELECT EMPNO,ENAME,MGR
FROM EMP;

SELECT EMP.EMPNO,EMP.ENAME,EMP.MGR,JEFES.ENAME AS NOMBRE_JEFE
FROM EMP,EMP JEFES
WHERE EMP.MGR=JEFES.EMPNO;

SELECT EMP.EMPNO,EMP.ENAME,EMP.MGR,JEFES.ENAME AS NOMBRE_JEFE
FROM EMP,EMP JEFES
WHERE EMP.MGR=JEFES.EMPNO(+) AND EMP.EMPNO IN(SELECT DISTINCT EMP.MGR
                                            FROM EMP);

SELECT EMP.EMPNO,EMP.ENAME,EMP.MGR,JEFES.ENAME AS NOMBRE_JEFE
FROM EMP,EMP JEFES
WHERE EMP.MGR=JEFES.EMPNO AND EMP.EMPNO NOT IN(SELECT DISTINCT EMP.MGR
                                            FROM EMP
                                            WHERE MGR IS NOT NULL);


--68
SELECT *
FROM EMP
WHERE JOB IN(SELECT DISTINCT JOB
                FROM DEPT,EMP
                WHERE EMP.DEPTNO=DEPT.DEPTNO AND DEPT.LOC='CHICAGO');


                
--69
SELECT JOB,COUNT(ENAME)
FROM EMP
GROUP BY JOB;

--70
SELECT DEPT.DNAME,SUM(EMP.SAL)
FROM EMP,DEPT
WHERE EMP.DEPTNO=DEPT.DEPTNO
GROUP BY DEPT.DNAME;

--71
SELECT DNAME,DEPTNO
FROM DEPT
WHERE DEPTNO NOT IN (SELECT DEPTNO
                    FROM EMP);
                    
SELECT DNAME
FROM DEPT
MINUS
SELECT DISTINCT DNAME
FROM DEPT,EMP
WHERE EMP.DEPTNO=DEPT.DEPTNO;

--72
SELECT ENAME
FROM EMP
WHERE EMPNO NOT IN (SELECT DISTINCT MGR
                FROM EMP
                WHERE MGR IS NOT NULL)
ORDER BY  MGR DESC;

SELECT *
FROM EMP
MINUS
SELECT *
FROM EMP
WHERE EMPNO IN(SELECT DISTINCT MGR
            FROM EMP);

--73
SELECT COUNT (DISTINCT EMP.JOB) AS TRABAJADORES ,AVG(EMP.SAL) AS MEDIA,DEPT.DNAME AS DEPARTAMENTOS
FROM EMP,DEPT
WHERE EMP.DEPTNO=DEPT.DEPTNO
GROUP BY DEPT.DNAME;

--74
SELECT ENAME,DEPTNO
FROM EMP
WHERE DEPTNO=30
ORDER BY  COMM DESC;

--75
SELECT EMP.ENAME,DEPT.LOC
FROM DEPT,EMP
WHERE DEPT.DEPTNO=EMP.DEPTNO AND( DEPT.LOC='NEW YORK' OR DEPT.LOC='DALLAS');

--76
SELECT EMP.MGR,JEFES.ENAME AS NOMBRE_JEFE,EMP.EMPNO,EMP.ENAME
FROM EMP,EMP JEFES
WHERE EMP.MGR=JEFES.EMPNO(+) AND EMP.EMPNO IN(SELECT DISTINCT EMP.MGR
                                            FROM EMP);

SELECT EMP.MGR ID_JEFE,JEFES.ENAME JEFE,COUNT(EMP.ENAME) N_EMPLEADOS
FROM EMP,EMP JEFES
WHERE EMP.MGR = JEFES.EMPNO(+) AND EMP.MGR IS NOT NULL
GROUP BY EMP.MGR,JEFES.ENAME;

--77
SELECT EMP.ENAME,EMP.SAL,DEPT.DNAME,EMP.DEPTNO
FROM EMP,DEPT
WHERE EMP.DEPTNO=DEPT.DEPTNO AND SAL IN (SELECT MAX(EMP.SAL)
                                        FROM DEPT,EMP
                                        WHERE DEPT.DEPTNO=EMP.DEPTNO
                                        GROUP BY DEPT.DNAME);
SELECT EMP.ENAME,EMP.SAL,DEPT.DNAME,EMP.DEPTNO
FROM EMP,DEPT
WHERE EMP.DEPTNO=DEPT.DEPTNO AND (SAL,EMP.DEPTNO) IN (SELECT MAX(EMP.SAL),EMP.DEPTNO
                                                    FROM EMP
                                                    GROUP BY EMP.DEPTNO);


--78
SELECT DEPT.DNAME,SUM(SAL)
FROM EMP,DEPT
WHERE EMP.DEPTNO=DEPT.DEPTNO
GROUP BY DEPT.DNAME
HAVING SUM(SAL)=(SELECT MAX(SUM (SAL))
                FROM EMP
                GROUP BY DEPTNO);
                
--79
SELECT ROWNUM,ROWID,EMP.SAL,ENAME
FROM EMP
WHERE ROWNUM <3
ORDER BY SAL DESC;

--80
SELECT DEPT.DNAME,COUNT(EMP.ENAME),SUM(EMP.SAL) AS MEDIA
FROM EMP,DEPT
WHERE DEPT.DEPTNO=EMP.DEPTNO 
GROUP BY DEPT.DNAME
HAVING COUNT (EMP.ENAME)>1 AND AVG(EMP.SAL)<(SELECT AVG(SAL)
                                        FROM EMP);

--81
SELECT DEPT.DNAME,COUNT (EMP.ENAME)
FROM EMP,DEPT
WHERE DEPT.DEPTNO=EMP.DEPTNO
GROUP BY DEPT.DNAME
HAVING COUNT (EMP.ENAME)>3;

SELECT DNAME,LOC
FROM DEPT
MINUS
SELECT DNAME,LOC
FROM DEPT,EMP
WHERE DEPT.DEPTNO=EMP.DEPTNO
GROUP BY DBAME,LOC;




SELECT EMP.JOB
FROM DEPT,EMP
WHERE DEPT.DNAME = 'SALES' AND DEPT.DEPTNO = EMP.DEPTNO;




--SUBSELECT
SELECT deptno 
FROM DEPT
WHERE LOC='DALLAS' OR LOC='NEW YORK';

--SUBCONSULTA
SELECT * 
FROM EMP
WHERE DEPTNO IN (SELECT deptno 
            FROM DEPT
            WHERE LOC='DALLAS' OR LOC='NEW YORK');

--MEZCLAR DOS TABLAS
SELECT * 
FROM DEPT , EMP
WHERE EMP.DEPTNO=DEPT.DEPTNO AND LOC='DALLAS' OR LOC='NEW YORK';

SELECT MIN(SAL), MAX(SAL)
FROM EMP;










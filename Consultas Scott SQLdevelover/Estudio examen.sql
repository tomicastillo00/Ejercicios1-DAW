--1.- Obtened los datos completos de los empleados.
select*
from emp;

--2.- Y ahora los de los departamentos.
select*
from dept;

--3.- Hallar los datos de los administrativos.
select*
from emp
where JOB= 'CLERK';

--4.- Idem. pero ordenados por el nombre.
select*
from emp
where job='CLERK'
order by ename;

--5.- El mismo resultado que el anterior pero modificando de alguna forma la sentencia anterior.
select*
from emp
where job='CLERK'
order by ename;

--6.- Obtén el nombre y salario de los empleados.
select ename,sal
from emp
order by ename;

--7.- Hallar el nombre de los departamenntos
select dname
from dept;

--8.-Idem pero ordenados por el nombre.
select dname
from dept
order by dname;

--9.- Lo mismo pero ordenando por la ciudad.
select dname, loc
from dept
order by loc;

--10.- Hallar los nombres de los departamentos ordenados por su ciudad, pero en orden inverso.
select dname,loc
from dept
order by loc desc;

--11.- Obtener el nombre y empleo de los empleados, ordenado por salario.
select ename,job,sal
from emp
order by sal;

--12.- Idem pero ordenando ahora por empleo y salario.
select ename,job,sal
from emp
order by sal,job;

--13.- Idem pero ordenando inversamente por empleo y normalmente por salario.
select ename,job,sal
from emp
order by job desc,sal;

--14.- Obtén los salarios y las comisiones de los empleados del departamento 30.
select sal,comm
from emp
where deptno='30';

--15.- Idem pero ordenando por comisión.
select sal,comm
from emp
where deptno='30'
order by comm;

--16.- Obtén las comisiones. Luego las distintas comisiones.
//Aqui se muestran todas las comisiones
select comm
from emp;

//Aqui se muestran las comisiones sin repetirse
select distinct comm
from emp;

--17.- Hallar las distintas comisiones y los nombres de los empleados.
select distinct ename,comm
from emp;

--18.- Hallar los distintos salarios y empleados.
select distinct sal,ename 
from emp;

--19.- Obtener las comisiones y los números de departamento posibles de la empresa, de manera que no
--se repitan.
select distinct comm, deptno
from emp;

--20.- Obtenga los nuevos salarios que resultarían de sumar a los empleados del departamento 30 una
--gratificación de 1000 unidades monetarias.
select ename,sal+1000
from emp
where deptno='30';

--Que pasaria si lo hicieramos fijandonos en el nombre en vez del numero
--el nombre del departamento 30 es 'SALES
select ename,sal,sal+1000
from emp
where deptno=(select deptno --En el select solo se puede utilizar un campo, sino nos dara fallo
              from dept     --El resultado de esta consulta es deptno 30
              where dname='SALES');

--21.- Idem pero obteniendo también el salario anterior.
select ename, sal, sal+1000
from emp
where deptno='30';

--22.- Hallar los empleados que tienen una comisión superior a la mitad de su salario.
select ename, comm
from emp
where comm>(sal/2);

--23.- Hallar los empleados cuya comisión es menor o igual que el 25% del sueldo.
select ename,comm
from emp
where comm<=(sal*0.25);

--24.- Haga que en cada fila figure 'Nombre ' y 'Puesto ' anteponiéndose a su respectivo valor, pero
--usando sólo tres expresiones.
select 'Nombre: '||ename,'Puesto: '||job
from emp;

--25.- Hallar el salario y la comisión de los empleados cuyo número de empleado supera a 7500.
select ename,sal,comm,empno
from emp
where empno>7500;

--26.- Si dividimos los empleados en dos grupos, A y B, empezando los del grupo B en la letra J, obtén
--los nombres y empleos de los del grupo B, por orden alfabético.
select ename, job
from emp
where ename>'J*';

--27.- Obtener el salario, la comisión y el salario total (salario + comisión) de los empleados con
--comisión, ordenado por número de empleado.
select ename,sal,comm,sal+comm as salario_total
from emp
where comm is not null
order by empno;
--nvl(null value): hace que si el primer parametro es nulo, lo sustituye por el segundo parametro
--en este caso, cuando las comisiones sean nulas, se transformaran en 0
select ename, sal, comm,sal+nvl(comm,0)as salario_total
from emp
order by empno;

--28.- Idem pero para los que no tienen comisión.
select ename, sal as salario_total
from emp
where comm is  null
order by empno;

--29.- Hallar el nombre de los empleados que, teniendo un salario superior a 1000, tienen como director
--al empleado de código 7698.
select ename,sal,mgr
from emp
where sal>1000 and mgr=7698;

--30.- Halla el conjunto complementario del resultado del ejercicio anterior.
select ename,sal,mgr
from emp
where sal<=1000 or nvl(mgr,0)!=7698;

--31.- Hallar el porcentaje que supone la comisión sobre el salario total ordenando por nombre.
select ename,((nvl(comm,0)/sal)*100)||'%'as porcentaje
from emp;

--32.- Hallar los empleados del departamento 10 cuyo nombre no contiene la cadena "LA".
select 
--Muestra todos los datos de todos los empleados y los departamentos
select *
from emp,dept;

--1. Nombre y trabajo de los empleados que no reciben comision y tienen el salario mas alto de su departamento
select ename, job, comm,sal
from emp
where comm is null and sal in(select max(sal)
                                from emp
                                //Mismo departamento
                                group by deptno);


--2. Encontrar al empleado con el salario mas alto en la empresa
select ename, job,sal
from emp
//Al poner el igual tiene que poner en el select el mismo campo, por ejemplo aqui: sal=select sal
where sal=(select max(sal)
            from emp e);
--La e no hace falta en este caso

--3. Muestra el nombre de los empleados, el año(4 digitos), el mes en abreviatura y el dia de la semana, de los empleados que fueron contratados a partir de abril de 1981
select ename, to_char(hiredate,'yyyy mon dd')
from emp
where hiredate>'01/04/81';

--4. Empleados que tienen el mismo trabajo que su jefe
select ename,job
from emp
where job=(select job
            from emp e
            where emp.deptno = e.mgr);
            
select ename, job
from emp empleado
where job = (select job
            from emp jefe
            where empleado.mgr = jefe.empno);

--5. Nombre de los departamentos junto con la diferencia entre el salario mas alto y el salario mas bajo en cada departamento, pero solo para departamentos con mas de 3 empleados
select dept.dname,count(ename),max (sal)-min(sal) DIFERENCIA
from dept,emp
where dept.deptno=emp.deptno
group by dept.dname
having(count(ename))>3
order by dept.dname;


--6. Empleados que tienen el salario mas alto de su departamento
select emp.ename,emp.sal,emp.deptno
from emp
where (deptno,sal) in (select deptno,max(sal)
                        from emp
                        group by deptno);

--7. Nombre del departamento y la cantidad de empleados que tienen un salario superior a 2500
select deptno, ename
from emp
where sal>2500;

--8. Empleados cuyo salario es mayor que el salario medio en su departamento y que fueron contratados despues de su manager
select e.ename,e.sal,e.hiredate
from emp e
//avg=media aritmetica
where e.sal>(select avg(sal)
                from emp
                where emp.deptno = e.deptno)
            and e.hiredate > (select max(jefe.hiredate)
                                from emp jefe
                                where jefe.empno=e.mgr);

--9. Empleados junto con una columna adicional que muestre las primeras tres letras de su nombre y el trabajo que realiza. Indica si tiene comision, o de ser nula, quie no tiene comision
select ename, substr(ename,1,3)as NOMBRE3 ,job, decode(comm,
                                                        null,'SIN_COMISION',
                                                        comm)
from emp;


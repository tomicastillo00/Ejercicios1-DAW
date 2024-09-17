--4
select *
from emp
where job='CLERK'
order by ename;

--56
select max(sal)as Salario_maximo,min(sal)as Salario_Minimo,(Max(sal)-min(sal))as Diferencia
from emp;

--70 
select deptno,sum(sal) SumaSal
from emp
group by deptno
order by deptno;

--71
select d.deptno,d.dname
from dept d
left join emp on d.deptno=emp.deptno
where emp.deptno is null;

--72
select *
from emp //solo queremos los que no son jefes
where empno not in (select mgr
                    from emp
                    where mgr is not null);
                    //muestro los jefes
--73
select dept.dname,count(distinct (emp.job))
from emp,dept
group by emp.deptno;
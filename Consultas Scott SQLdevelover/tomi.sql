select *
from employees;

select first_name,last_name,departments.department_id,department_name
from employees,departments
where departments.department_id=employees.department_id
order by first_name,last_name;

select first_name,last_name,jobs.job_id,job_title
from jobs,employees
where jobs.job_id=employees.job_id;

select first_name,last_name,job_title,department_name
FROM employees, departments,jobs
where jobs.job_id=employees.job_id and departments.department_id=employees.department_id;

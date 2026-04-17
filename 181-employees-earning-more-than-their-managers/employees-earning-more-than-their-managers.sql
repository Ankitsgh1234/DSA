# Write your MySQL query statement below
-- select name from Employee
-- where salary>(select salary from Employee where id=managerId)

select e2.name as Employee
from Employee e1
inner join Employee e2
on e1.id=e2.managerId
where e1.salary<e2.salary;
# Write your MySQL query statement below
select e.name as Employee from Employee e
left join Employee s
on e.managerId= s.id
where e.salary>s.salary;
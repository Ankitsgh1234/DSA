# Write your MySQL query statement below
select s.name as Employee from Employee e
join Employee s
on e.id=s.managerId
where e.salary<s.salary;
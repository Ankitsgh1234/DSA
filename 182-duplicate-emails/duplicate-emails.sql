# Write your MySQL query statement below
select email as Email
from Person 
-- where count(email)>1
group by email
having count(email)>1
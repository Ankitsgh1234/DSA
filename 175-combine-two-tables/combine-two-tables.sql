# Write your MySQL query statement below
SELECT P.firstName,P.lastName,t.city,t.state
from Person P
left join Address t on P.personId=t.personId;
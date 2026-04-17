# Write your MySQL query statement below
-- select user_id,
-- if(activity_type ='free_trial',sum(activity_duration),0)/count(activity_type='free_trial' ) as trial_avg_duration,
-- if(activity_type ='paid',sum(activity_duration),0)/count(activity_type='paid' ) as paid_avg_duration
-- from UserActivity
-- -- where activity_type not in(select activity_type from UserActivity where activity_type ='paid')
-- group by user_id,activity_type


select user_id,
round(avg(if(activity_type='free_trial',activity_duration ,null)),2) as trial_avg_duration,
round(avg(if(activity_type='paid',activity_duration ,null)),2) as paid_avg_duration
from UserActivity
group by user_id
having trial_avg_duration is not null and paid_avg_duration is not null
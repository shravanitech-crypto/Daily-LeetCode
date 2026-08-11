# Write your MySQL query statement below
select e.name, u.unique_id
FROM Employees e LEFT JOIN EmployeeUNI u ON 
e.id = u.id;

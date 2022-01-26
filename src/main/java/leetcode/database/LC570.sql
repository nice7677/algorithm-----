/**
  @LeetCode
  570. Managers with at Least 5 Direct Reports

  +-------------+---------+
| Column Name | Type    |
+-------------+---------+
| id          | int     |
| name        | varchar |
| department  | varchar |
| managerId   | int     |
+-------------+---------+
id is the primary key column for this table.
Each row of this table indicates the name of an employee, their department, and the id of their manager.
If managerId is null, then the employee does not have a manager.
No employee will be the manager of themself.


Write an SQL query to report the managers with at least five direct reports.

Return the result table in any order.

The query result format is in the following example.



Example 1:

Input:
Employee table:
+-----+-------+------------+-----------+
| id  | name  | department | managerId |
+-----+-------+------------+-----------+
| 101 | John  | A          | None      |
| 102 | Dan   | A          | 101       |
| 103 | James | A          | 101       |
| 104 | Amy   | A          | 101       |
| 105 | Anne  | A          | 101       |
| 106 | Ron   | B          | 101       |
+-----+-------+------------+-----------+
Output:
+------+
| name |
+------+
| John |
+------+

  Runtime: 299 ms, faster than 50.45% of MySQL online submissions for Managers with at Least 5 Direct Reports.
  Memory Usage: 0B, less than 100.00% of MySQL online submissions for Managers with at Least 5 Direct Reports.
 */

select name from employee where id in (select managerId from employee group by managerId having count(select name from employee where id IN (select managerId from employee group by managerId having count(managerId) >= 5);) >= 5);
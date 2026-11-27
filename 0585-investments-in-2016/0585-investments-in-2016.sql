# Write your MySQL query statement below
WITH unique_loc AS (
    SELECT pid
    FROM Insurance
    WHERE CONCAT(lat, ',', lon) IN (
        SELECT CONCAT(lat, ',', lon)
        FROM Insurance
        GROUP BY lat, lon
        HAVING COUNT(*) = 1
    )
),

unique_tiv_2015 AS (
    SELECT
        tiv_2015
    FROM Insurance
    GROUP BY tiv_2015
    HAVING COUNT(*) = 1
)

SELECT
    ROUND(SUM(tiv_2016), 2) AS tiv_2016
FROM Insurance
WHERE pid IN (SELECT pid FROM unique_loc)
AND tiv_2015 NOT IN (SELECT tiv_2015 FROM unique_tiv_2015);
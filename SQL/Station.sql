/*

           Station

+-------------+------------+
| Field       |   Type     |
+-------------+------------+
| ID          | INTEGER    |
| CITY        | VARCHAR(21)|
| STATE       | VARCHAR(2) |
| LAT_N       | NUMERIC    |
| LONG_W      | NUMERIC    |
+-------------+------------+

*/

/*Query a list of CITY and STATE from the STATION table.*/
SELECT CITY, STATE FROM STATION;

/*Query a list of CITY names from STATION for cities that have an even ID number. Print the results in any order, 
but exclude duplicates from the answer.
*/
SELECT DISTINCT CITY FROM STATION 
WHERE MOD(ID,2) = 0 ORDER BY CITY;
---------------------------------------------Zadania------------------------------------------------------------------

/*
1. Given the above tables, write a T-SQL query, which will return sales information
	(Invoice, Name, VAT Amount) sorted in a descending order according to VAT amount (not VAT rate)
*//*
use [bazka z rozmowy]
select s.Invoice, c.Name, (s.Nett * s.VAT) as [VAT AMOUNT]
from Client c
inner join Sale s on c.ClientID=s.ClientID
order by [VAT AMOUNT] DESC
*/


--------------------------------------------------------------------------------------------------------------------


/*
2. Write a T-SQL query wchich will return for each client: Client Name, sum of gross amount, sum of VAT amount
*//*
use [bazka z rozmowy]
select c.Name, SUM(s.Nett + s.Nett * s.VAT) as [gross amount],  SUM(s.Nett * s.VAT) as [vat amount]
from Client c
inner join Sale s on c.ClientID=s.ClientID
group by c.Name
*/

--------------------------------------------------------------------------------------------------------------------

/*
3. Write a T-SQL query which will return client names for clients who have bought nothing
*//*
use [bazka z rozmowy]
select c.Name
from Client c
left join Sale s on c.ClientID=s.ClientID
WHERE s.SaleID is null
*/

---------------------------------------------------------------------------------------------------------------------

/*
4. Write a T-SQL query which will return 3 client names for client who have paid at least gross amount
	(exclude clients who have bought nothing)
*//*
SELECT TOP(3) Name
from Client c
left join Sale s on c.ClientID=s.ClientID
WHERE s.ClientID is not null
ORDER by s.nett asc
*/

-----------------------------------------------------------------------------------------------------------------------

/*
5. Write a T-SQL query which will expand the previous report to also show clients who bought nothing
*//*
SELECT TOP(3) Name
from Client c
left join Sale s on c.ClientID=s.ClientID
ORDER by s.nett asc
*/

------------------------------------------------------------------------------------------------------------------------

/*
6. Write a T-SQL query which will return client names and total gross spent amount for clients who have spent more
	than 1000 gross
*//*
SELECT c.Name, SUM(s.Nett + s.Nett*s.VAT) as [total gross spent]
from Client c
left join sale s on c.ClientID=s.ClientID
where (s.Nett + s.Nett*s.VAT) > 1000
group by c.Name
*/

--------------------------------------------------------------------------------------------------------------------------

/*
7. Write a T-SQL query wich will update the rate of VAT from 23% to 25% and update
	the nett amount so that the gross amount for each invoice does not change
*//*
update [bazka z rozmowy].dbo.Sale
SET  VAT = 0.25, Nett = (Nett/0.23)*0.25
where VAT = 0.23
*/

---------------------------------------------------------------------------------------------------------------------------

/*
8. Using data from the above tables write a T-SQL query wich will return the bellow report
*//*
select *, (nett+nett*VAT) as [gross amount]
from Sale
*/
----------------------------------------------------------------------------------------------------------------------------

select floor(sum(b.price*o.count)/10000)*10000 total 
from book b , CUSTOMER c, orders o
where b.bookid=o.bookid and c.custid=o.custid ;
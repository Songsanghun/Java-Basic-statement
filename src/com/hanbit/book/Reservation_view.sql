CREATE VIEW Reservation_View
AS
SELECT
r.res_seq res_seq,
r.seat_no seat_no,
r.res_date res_date,
m.multi_seq multi_seq,
t.theater_no theater_no,
c.con_no con_no,
c.name name,
c.addr addr,
t.title title,
t.price price,
t.seat_count seat_count,
m.multi_name multi_name,
m.loc loc
FROM Reservation r 
FULL OUTER JOIN Consumer c
on r.con_no =c.con_no 
FULL OUTER JOIN Theater t
on r.theater_no=t.theater_no
FULL OUTER JOIN Multiplex m
on r.multi_seq=m.multi_seq
where res_seq is not null;

SELECT * FROM Reservation_view;
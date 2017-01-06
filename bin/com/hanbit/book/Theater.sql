-- 극장 : Multiplex
-- 극장번호 : multi_seq / decimal
-- 극장이름 : multi_name 
-- 위치 : loc
-- 상영관 : Theater
-- 극장번호 : multi_seq / decimal
-- 상영관번호 : thearter_seq / decimal
-- 영화제목 : title
-- 가격 : price / decimal
-- 좌석수 : seat_count / decimal
-- 예약 : Reservation 
-- 예약번호 : res_seq / decimal
-- 날짜 : res_date /date
-- 고객번호 : cust_no / decimal
-- 좌석번호 : seat_no / 
-- 고객 : Consumer
-- 고객번호 con_no / decimal
-- 이름 : name
-- 주소 : addr
DROP SEQUENCE mulit_seq;
DROP SEQUENCE theater_no;
DROP SEQUENCE res_seq;
DROP TABLE Reservation;
DROP TABLE Theater;
DROP TABLE Consumer;
DROP TABLE Multiplex;

CREATE SEQUENCE multi_seq
 START WITH     1000
 INCREMENT BY   1
 NOCACHE
 NOCYCLE;
CREATE SEQUENCE theater_no
 START WITH     1000
 INCREMENT BY   1
 NOCACHE
 NOCYCLE;
CREATE SEQUENCE res_seq
 START WITH     1000
 INCREMENT BY   1
 NOCACHE
 NOCYCLE; 
CREATE TABLE Multiplex(
	multi_seq DECIMAL,
	multi_name VARCHAR2(10),
	loc VARCHAR2(10),
	PRIMARY KEY(multi_seq)
);
CREATE TABLE Consumer(
	con_no DECIMAL NOT NULL,
	name VARCHAR2(20),
	addr VARCHAR2(10),
	PRIMARY KEY(con_no)
);
--ALTER TABLE Reservation RENAME COLUMN theater_seq TO theater_no;
--ALTER TABLE Multiplex RENAME COLUMN mulit_name TO multi_name;
--ALTER TABLE Theater RENAME COLUMN theater_seq TO theater_no;
--ALTER TABLE Reservation MODIFY res_date VARCHAR2(10);
--ALTER TABLE Reservation ADD seat_no VARCHAR2(5);
--SELECT * FROM Theater;
CREATE TABLE Theater(
	theater_no DECIMAL,
	multi_seq DECIMAL,
	title VARCHAR2(30),
	price DECIMAL,
	seat_count DECIMAL,
	PRIMARY KEY(theater_no),
	FOREIGN KEY(multi_seq) REFERENCES multiplex(multi_seq)
);
CREATE TABLE Reservation(
	res_seq DECIMAL,
	seat_no VARCHAR2(5),
	res_date DATE,
	multi_seq DECIMAL,
	theater_no DECIMAL,
	con_no DECIMAL,
	PRIMARY KEY(res_seq),
	FOREIGN KEY(multi_seq) REFERENCES multiplex(multi_seq),
	FOREIGN KEY(theater_no) REFERENCES theater(theater_no),
	FOREIGN KEY(con_no) REFERENCES Consumer(con_no)
);
INSERT INTO Multiplex(multi_seq,multi_name,loc)
VALUES(multi_seq.nextval,'롯데','잠실');
INSERT INTO Multiplex(multi_seq,multi_name,loc)
VALUES(multi_seq.nextval,'롯데','신촌');

INSERT INTO Theater(theater_no,multi_seq,title,price,seat_count)
VALUES(1,1000,'마스터',10000,100);
INSERT INTO Theater(theater_no,multi_seq,title,price,seat_count)
VALUES(2,1000,'로그원',12000,200);

INSERT INTO Consumer(con_no,name,addr)
VALUES(12345,'홍길동','대흥동');
INSERT INTO Consumer(con_no,name,addr)
VALUES(67890,'이순신','대치동');

INSERT INTO Reservation(res_seq,res_date,multi_seq,theater_no,con_no,seat_no)
VALUES(res_seq.nextval,'2017-01-07',1000,1,12345,'F-10');
INSERT INTO Reservation(res_seq,res_date,multi_seq,theater_no,con_no,seat_no)
VALUES(res_seq.nextval,'2017-01-07',1000,1,67890,'G-10');

select * FROM tab;
select * from Consumer;
select * from Reservation;
select * from Multiplex;

SELECT * FROM 
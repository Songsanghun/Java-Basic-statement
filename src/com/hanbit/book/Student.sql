CREATE TABLE Subject(
	scode VARCHAR2(20),
	sname VARCHAR2(20),
	PRIMARY KEY(scode)
);

CREATE TABLE Student (
	name VARCHAR2(15) NOT NULL,
	sno VARCHAR2(15),
	scode VARCHAR2(20) NOT NULL,
	gender VARCHAR2(1),
	birth DECIMAL,
	PRIMARY KEY(sno),
	FOREIGN KEY(scode) REFERENCES subject(scode),
	CONSTRAINT ck_gender CHECK(gender='m')
	);
	
SELECT * FROM SUBJECT;
SELECT * FROM Student;

DROP TABLE Charts;
DROP TABLE Treatments;
DROP TABLE Patients;
DROP TABLE Nurses;
DROP TABLE Doctors;

CREATE TABLE Doctors (
	 doc_id DECIMAL NOT NULL,
	 major_treat VARCHAR2(25) NOT NULL,
	 doc_name VARCHAR2(20) NOT NULL,
	 doc_gen VARCHAR2(1) NOT NULL,
	 doc_phone VARCHAR2(15) NULL,
	 doc_email VARCHAR2(50) NOT NULL,
	 doc_position VARCHAR2(20) NOT NULL,
	 PRIMARY KEY (doc_id)
);
CREATE TABLE Nurses (
	 nur_id DECIMAL NOT NULL,
	 major_job VARCHAR2(25) NOT NULL,
	 nur_name VARCHAR2(20) NOT NULL,
	 nur_gen VARCHAR2(1) NOT NULL,
	 nur_phone VARCHAR2(15) NULL,
	 nur_email VARCHAR2(50) NULL,
	 nur_position VARCHAR2(20) NOT NULL,
	 PRIMARY KEY (nur_id)
);
CREATE TABLE Patients (
	 pat_id DECIMAL NOT NULL,
	 nur_id DECIMAL NOT NULL,
	 doc_id DECIMAL NOT NULL,
	 pat_name VARCHAR2(20) NOT NULL,
	 pat_gen VARCHAR2(1) NOT NULL,
	 pat_jumin VARCHAR2(14) NOT NULL,
	 pat_addr VARCHAR2(100) NOT NULL,
	 pat_phone VARCHAR2(15) NULL,
	 pat_email VARCHAR2(50) NULL,
	 pat_job VARCHAR2(25) NOT NULL,
	 PRIMARY KEY (pat_id),
	 FOREIGN KEY (doc_id) REFERENCES Doctors(doc_id),
	 FOREIGN KEY (nur_id) REFERENCES Nurses(nur_id)
);
CREATE TABLE Treatments (
	 treat_id DECIMAL NOT NULL,
	 pat_id DECIMAL NOT NULL,
	 doc_id DECIMAL NOT NULL,
	 treat_contents VARCHAR2(1000) NOT NULL,
	 treat_date VARCHAR2(20) NOT NULL,
	 PRIMARY KEY (treat_id),
	 FOREIGN KEY (doc_id) REFERENCES Doctors(doc_id),
	 FOREIGN KEY (pat_id) REFERENCES Patients(pat_id)
);
CREATE TABLE Charts (
	 chart_id VARCHAR2(20) NOT NULL,
	 treat_id DECIMAL NOT NULL,
	 doc_id DECIMAL NOT NULL,
	 pat_id DECIMAL NOT NULL,
	 nur_id DECIMAL NOT NULL,
	 chart_contents VARCHAR2(1000) NOT NULL,
	 PRIMARY KEY (chart_id),
	 FOREIGN KEY (doc_id) REFERENCES Doctors(doc_id),
	 FOREIGN KEY (pat_id) REFERENCES Patients(pat_id),
	 FOREIGN KEY (treat_id) REFERENCES Treatments(treat_id),
	 FOREIGN KEY (nur_id) REFERENCES Nurses(nur_id)
);
--Doctors
INSERT INTO Doctors(doc_id,major_treat,doc_name,doc_gen,doc_phone,doc_email,doc_position)
VALUES (980312,'소아과','이태정','M','010-333-1340','itj@hanbh.com','과장');
INSERT INTO Doctors(doc_id,major_treat,doc_name,doc_gen,doc_phone,doc_email,doc_position)
VALUES (601,'내과','안성기','M','011-222-0987','ask@hanbh.com','과장');
INSERT INTO Doctors(doc_id,major_treat,doc_name,doc_gen,doc_phone,doc_email,doc_position)
VALUES (1208,'외과','김민종','M','010-333-8743','kmj@hanbh.com','과장');
INSERT INTO Doctors(doc_id,major_treat,doc_name,doc_gen,doc_phone,doc_email,doc_position)
VALUES (20403,'피부과','이태서','M','019-777-3764','its@hanbh.com','과장');
INSERT INTO Doctors(doc_id,major_treat,doc_name,doc_gen,doc_phone,doc_email,doc_position)
VALUES (50900,'소아과','김연아','F','010-555-3746','kya@hanbh.com','전문의');
INSERT INTO Doctors(doc_id,major_treat,doc_name,doc_gen,doc_phone,doc_email,doc_position)
VALUES (50101,'내과','차태현','M','011-222-7643','cth@hanbh.com','전문의');
INSERT INTO Doctors(doc_id,major_treat,doc_name,doc_gen,doc_phone,doc_email,doc_position)
VALUES (62019,'소아과','전지현','F','010-999-1265','jjh@hanbh.com','전문의');
INSERT INTO Doctors(doc_id,major_treat,doc_name,doc_gen,doc_phone,doc_email,doc_position)
VALUES (70576,'피부과','홍길동','M','016-333-7263','hgd@hanbh.com','전문의');
INSERT INTO Doctors(doc_id,major_treat,doc_name,doc_gen,doc_phone,doc_email,doc_position)
VALUES (80543,'방사선과','유재석','M','010-222-1263','yjs@hanbh.com','과장');
INSERT INTO Doctors(doc_id,major_treat,doc_name,doc_gen,doc_phone,doc_email,doc_position)
VALUES (91001,'외과','김병만','M','010-555-3542','kbm@hanbh.com','전문의');
--Nurses
INSERT INTO Nurses(nur_id,major_job,nur_name,nur_gen,nur_phone,nur_email,nur_position)
VALUES (50302,'소아과','김은영','F','010-555-8751','key@hanbh.com','수간호사');
INSERT INTO Nurses(nur_id,major_job,nur_name,nur_gen,nur_phone,nur_email,nur_position)
VALUES (50021,'내과','윤성애','F','016-333-8745','ysa@hanbh.com','수간호사');
INSERT INTO Nurses(nur_id,major_job,nur_name,nur_gen,nur_phone,nur_email,nur_position)
VALUES (40089,'피부과','신지원','M','010-666-7676','sjw@hanbh.com','주임');
INSERT INTO Nurses(nur_id,major_job,nur_name,nur_gen,nur_phone,nur_email,nur_position)
VALUES (70605,'방사선과','유정화','F','010-333-4588','yjh@hanbh.com','주임');
INSERT INTO Nurses(nur_id,major_job,nur_name,nur_gen,nur_phone,nur_email,nur_position)
VALUES (70804,'내과','리하나','F','010-222-1340','nhn@hanbh.com','주임');
INSERT INTO Nurses(nur_id,major_job,nur_name,nur_gen,nur_phone,nur_email,nur_position)
VALUES (71018,'소아과','김화경','F','019-888-4116','khk@hanbh.com','주임');
INSERT INTO Nurses(nur_id,major_job,nur_name,nur_gen,nur_phone,nur_email,nur_position)
VALUES (100356,'소아과','이선용','M','010-777-1234','lsy@hanbh.com','간호사');
INSERT INTO Nurses(nur_id,major_job,nur_name,nur_gen,nur_phone,nur_email,nur_position)
VALUES (104145,'외과','김현','M','010-999-8520','kh@hanbh.com','간호사');
INSERT INTO Nurses(nur_id,major_job,nur_name,nur_gen,nur_phone,nur_email,nur_position)
VALUES (120309,'피부과','박성완','M','010-777-4996','psw@hanbh.com','간호사');
INSERT INTO Nurses(nur_id,major_job,nur_name,nur_gen,nur_phone,nur_email,nur_position)
VALUES (130211,'외과','이서연','F','010-222-3214','lsy@hanbh.com','간호사');
--Patients
INSERT INTO Patients(pat_id,nur_id,doc_id,pat_name,pat_gen,pat_jumin,pat_addr,pat_phone,pat_email,pat_job)
VALUES (2345,50302,980312,'안상건','M',232345,'서울','010-555-7845','ask@ab.com','회사원');
INSERT INTO Patients(pat_id,nur_id,doc_id,pat_name,pat_gen,pat_jumin,pat_addr,pat_phone,pat_email,pat_job)
VALUES (3545,40089,20403,'김성룡','M',543545,'서울','010-333-7812','ksr@bb.com','자영업');
INSERT INTO Patients(pat_id,nur_id,doc_id,pat_name,pat_gen,pat_jumin,pat_addr,pat_phone,pat_email,pat_job)
VALUES (3424,70605,080543,'이종진','M',433424,'부산','019-888-4859','ijj@ab.com','회사원');
INSERT INTO Patients(pat_id,nur_id,doc_id,pat_name,pat_gen,pat_jumin,pat_addr,pat_phone,pat_email,pat_job)
VALUES (7675,100356,50900,'최광석','M',677675,'당진','010-222-4847','cks@cc.com','회사원');
INSERT INTO Patients(pat_id,nur_id,doc_id,pat_name,pat_gen,pat_jumin,pat_addr,pat_phone,pat_email,pat_job)
VALUES (4533,70804,601,'정한경','M',744533,'강릉','010-777-9630','jhk@ab.com','교수');
INSERT INTO Patients(pat_id,nur_id,doc_id,pat_name,pat_gen,pat_jumin,pat_addr,pat_phone,pat_email,pat_job)
VALUES (5546,120309,70576,'유원현','M',765546,'대구','016-777-0214','ywh@cc.com','자영업');
INSERT INTO Patients(pat_id,nur_id,doc_id,pat_name,pat_gen,pat_jumin,pat_addr,pat_phone,pat_email,pat_job)
VALUES (4543,70804,50101,'최재정','M',454543,'부산','010-555-4187','cjj@bb.com','회사원');
INSERT INTO Patients(pat_id,nur_id,doc_id,pat_name,pat_gen,pat_jumin,pat_addr,pat_phone,pat_email,pat_job)
VALUES (9768,130211,91001,'이진희','F',119768,'서울','010-888-3675','ijh@ab.com','교수');
INSERT INTO Patients(pat_id,nur_id,doc_id,pat_name,pat_gen,pat_jumin,pat_addr,pat_phone,pat_email,pat_job)
VALUES (4234,130211,91001,'오나미','F',234234,'속초','010-999-6541','onm@cc.com','학생');
INSERT INTO Patients(pat_id,nur_id,doc_id,pat_name,pat_gen,pat_jumin,pat_addr,pat_phone,pat_email,pat_job)
VALUES (7643,71018,62019,'송성묵','M',987643,'서울','010-222-5874','ssm@bb.com','학생');
--Treatments
INSERT INTO Treatments(treat_id,pat_id,doc_id,treat_contents,treat_date)
VALUES (130516023,2345,980312,'감기,몸살','2013-05-16');
INSERT INTO Treatments(treat_id,pat_id,doc_id,treat_contents,treat_date)
VALUES (130628100,3545,20403,'피부트러블 치료','2013-06-28');
INSERT INTO Treatments(treat_id,pat_id,doc_id,treat_contents,treat_date)
VALUES (131205056,3424,80543,'목 디스크로 MRI촬영','2013-12-05');
INSERT INTO Treatments(treat_id,pat_id,doc_id,treat_contents,treat_date)
VALUES (131218024,7675,50900,'중이염','2013-12-18');
INSERT INTO Treatments(treat_id,pat_id,doc_id,treat_contents,treat_date)
VALUES (131224012,4533,601,'장염','2013-12-24');
INSERT INTO Treatments(treat_id,pat_id,doc_id,treat_contents,treat_date)
VALUES (140103001,5546,70576,'여드름 치료','2014-01-03');
INSERT INTO Treatments(treat_id,pat_id,doc_id,treat_contents,treat_date)
VALUES (140109026,4543,50101,'위염','2014-01-09');
INSERT INTO Treatments(treat_id,pat_id,doc_id,treat_contents,treat_date)
VALUES (140226102,9768,91001,'화상치료','2014-02-26');
INSERT INTO Treatments(treat_id,pat_id,doc_id,treat_contents,treat_date)
VALUES (140303003,4234,91001,'교통사고 외상치료','2014-03-03');
INSERT INTO Treatments(treat_id,pat_id,doc_id,treat_contents,treat_date)
VALUES (140308087,7643,62019,'장염','2014-03-08');
--Charts
INSERT INTO Charts(chart_id,treat_id,doc_id,pat_id,nur_id,chart_contents)
VALUES ('p_130516023',130516023,980312,2345,50302,'감기 주사 및 약 처방');
INSERT INTO Charts(chart_id,treat_id,doc_id,pat_id,nur_id,chart_contents)
VALUES ('d_130628100',130628100,20403,3545,40089,'피부 감염 방지 주사');
INSERT INTO Charts(chart_id,treat_id,doc_id,pat_id,nur_id,chart_contents)
VALUES ('r_131205056',131205056,80543,3424,70605,'주사 처방');
INSERT INTO Charts(chart_id,treat_id,doc_id,pat_id,nur_id,chart_contents)
VALUES ('p_131218024',131218024,50900,7675,100356,'귓속청소 및 약 처방');
INSERT INTO Charts(chart_id,treat_id,doc_id,pat_id,nur_id,chart_contents)
VALUES ('i_131224012',131224012,601,4533,70804,'장염 입원치료');
INSERT INTO Charts(chart_id,treat_id,doc_id,pat_id,nur_id,chart_contents)
VALUES ('d_140103001',140103001,70576,5546,120309,'여드름 치료약 처방');
INSERT INTO Charts(chart_id,treat_id,doc_id,pat_id,nur_id,chart_contents)
VALUES ('i_140109026',140109026,50101,4543,70804,'위내시경');
INSERT INTO Charts(chart_id,treat_id,doc_id,pat_id,nur_id,chart_contents)
VALUES ('s_140226102',140226102,91001,9768,130211,'화상 크림약 처방');
INSERT INTO Charts(chart_id,treat_id,doc_id,pat_id,nur_id,chart_contents)
VALUES ('s_140303003',140303003,91001,4234,130211,'입원치료');
INSERT INTO Charts(chart_id,treat_id,doc_id,pat_id,nur_id,chart_contents)
VALUES ('p_140308087',140308087,62019,7643,71018,'장염 입원치료');

select * FROM
Charts c 
FULL OUTER JOIN Treatments t
on c.treat_id=t.treat_id
FULL OUTER JOIN Patients p
on c.pat_id=p.pat_id
FULL OUTER JOIN Nurses n
on c.nur_id=n.nur_id
FULL OUTER JOIN Doctors d
on c.doc_id=d.doc_id
where chart_id is not null;


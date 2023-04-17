REM   Script: Activity3
REM   Activities

create table salesman(salesman_id int,salesman_name varchar2(20),salesman_city varchar2(20),commission int) 
 
;

describe salesman


INSERT INTO salesman VALUES(5002, 'Nail Knite', 'Paris', 13);

INSERT ALL 
    INTO salesman VALUES(5005, 'Pit Alex', 'London', 11) 
    INTO salesman VALUES(5006, 'McLyon', 'Paris', 14) 
    INTO salesman VALUES(5007, 'Paul Adam', 'Rome', 13) 
    INTO salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12) 
SELECT 1 FROM DUAL;

select * from salesman;

select salesman_id,salesMa_city from salesman;

select salesman_id,salesman_city from salesman;

select * from slaesman where salesman_city= 'Paris';

select * from salesman where salesman_city= 'Paris';

select salesman_id,commission from salesman where salesman_name = 'Paul Adam';


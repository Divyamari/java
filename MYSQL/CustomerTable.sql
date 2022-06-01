create database customer;
use customer;

create table Customer(
Cust_id varchar(5),
Fname varchar(15),
Lname varchar(15),
Area char(2),
Phone numeric(10),
DOB Date,
Payment numeric(6,2)
);
insert into customer values('A01','Ivan','Ross','SA',6125467,'15-jan-86',800.50);
insert into customer values('A02','Vandana','Ray','MU',5560379,'20-dec-87',1000.75);
insert into customer values('A03','Pramada','Jauguste','DA',4560389,'25-jul-67',500.00);
insert into customer values('A04','Basu','Navindi','BA',6125401,'30-feb-56',860.00);
insert into customer values('A05','Ravi','Shridhar','NA',null,'15-feb-89',500.50);
insert into customer values('A06','Rukmini','Aiyer','GH',5125274,'23-jul-87',1500.50);
update customer set Phone = 8562483 where cust_id ='A02';
update customer set Phone = 9043651 where cust_id ='A04';
update customer set DOB = '27-jul-67' where cust_id ='A03';
update customer set DOB = '14-feb-90' where cust_id ='A05';
delete from customer where cust_id = 'A01';
delete from customer where cust_id = 'A05';
delete from customer;
insert into customer values('A01','Divya','Jeeva','SA',6154892,'1997-may-30',800.50);
insert into customer values('A02','Abirami','Kumar','MU',8524695,'1997-june-13',1000.75);
insert into customer values('A03','Badrinath','lagadapathi','DA',9517538,'2000-july-25',500.00);
insert into customer values('A04','pavan','Anugu','BA',9456982,'2000-feb-15',860.00);
insert into customer values('A05','surya','prakash','NA',8526435,'1997-july-30',500.50);
update customer set DOB = '2000-sep-12' where cust_id ='A03';
delete from customer where Phone = 6154892;

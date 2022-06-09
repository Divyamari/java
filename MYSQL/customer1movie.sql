use c123;
SELECT * FROM c123.customer1;
SELECT * FROM c123.movie;

alter table movie add foreign key(Cust_id) references customer1(Cust_id);

select Title from movie where Price > 100 and price < 200;
select Cust_id from movie where Star = 'JC' OR Star = 'TC' OR  Star = 'MC';

select * from customer1 where Area like 'A%';
select Title from movie where Price <180 and length(Title)= 6 ;

select Title,Price,Price + (Price * 10/100) as 'incremented price' from movie;


alter table customer1 modify Lname varchar(45) not null;
select Fname from customer1 where Phone is null;

select distinct Cust_id from movie;
delete from customer1 where Cust_id ='A02';

delete from movie where Cust_id = 'A02';
alter table movie drop foreign key movie_ibfk_1;

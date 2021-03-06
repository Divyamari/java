use c123;
#inner join
select customer_table.customername,order_table.orderdate from customer_table inner join 
order_table on customer_table.customerid = order_table.customerid;
#or
select customername,orderdate from customer_table inner join 
order_table on customer_table.customerid = order_table.customerid;
#or
select customername,orderdate from customer_table inner join order_table where
customer_table.customerid = order_table.customerid;
#leftouterjoin
select customer_table.customerid,customername,orderdate from customer_table left join
order_table on customer_table.customerid = order_table.customerid;
#rightouterjoin
select customer_table.customerid,customername,orderdate from customer_table right join
order_table on customer_table.customerid = order_table.customerid;
#foreign key
alter table order_table add foreign key(customerid) references customer_table(customerid); 
#foreignkey while table creation
create table orders(
order_id int primary key,
orderdate date,
quantity int,
price double(5,2),
customerid int,foreign key(customerid) references customer_table(customerid)
);
#cross join
select * from customer_table cross join order_table;
#self join
select S1.sname,S1.saddr from student_details S1 inner join student_details S2
on S1.saddr = S2.saddr and S1.id<>S2.id order by S1.id;
#subquery
select * from emp where emp_id in (select emp_id from emp where working_hour>10);
select * from emp where emp_id in (select emp_id from emp where salary > 1200);
select * from emp where salary = (select max(salary) from emp);
select * from emp where addr not in (select addr from emp where addr = 'mumbai');
select * from emp where dept !=(select dept from emp where dept = 'operation');
select * from emp where salary >(select salary from emp where ename = 'john');
#Any
select customerid,customername from customer_table 
where customerid > any (select customerid from order_table);
#All
select customerid,customername from customer_table 
where customerid > all (select customerid from order_table);
#not exists
select customername,customerphone from customer_table 
where not exists 
(select * from order_table where customer_table.customerid = ordertable.customerid);
#rollup
select dept,count(emp_id),sum(salary) as 'total_deptsalary' from emp group by dept with rollup;
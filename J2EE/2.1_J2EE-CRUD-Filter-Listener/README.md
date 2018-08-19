



Database : 
```
create database training;
use training;

create table Book (
	id integer not null auto_increment, 
	author varchar(255), isbn varchar(255), 
	price double precision not null, 
	title varchar(255), 
	primary key (id)
);

insert into Book (author, isbn, price, title) values ('raj', 'abc121', 4455.8, 'java head first');
```

-------------------------------------------------------------
Day 2:Lab on Servlet connection pooling, listner, filter
------------------------------------------------------------
1. In previous lab implements an Listner so that driver is loaded at servlet context creation time
2. Use Connection pooling with tomcat using jndi and Dependency injection approach
3. Secure application using filter so that only valid user can manipulate customer information
4. Count number of active user in the system using suitable listner

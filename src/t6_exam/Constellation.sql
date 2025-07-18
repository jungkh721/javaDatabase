show tables;

create table constellation(
  idx int not null auto_increment primary key,
	name varchar(20) not null,
	day datetime default now(),
	content text
);

desc constellation;


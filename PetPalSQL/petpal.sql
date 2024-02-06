create database petpal;
use petpal;

drop table pet;
create table pet (
	petid int primary key auto_increment,
    petName varchar(20),
    petAge int,
    petBreed varchar(30),petColor varchar(30)
);

create table participant(
	pid int primary key auto_increment,
    pname varchar(30),
    eid int,
    foreign key (eid) references event(eid)
);

create table event(
	eid int primary key auto_increment,
    ename varchar(100),
    elocation varchar(100)
);

insert into pet values(1,"aaa",3,"german","brown");


-- event insert
insert into event(ename,elocation) values
	("dog watch","dog store"),
    ("cat watch","cat store");
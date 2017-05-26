-- 방법3)
  create table t2(
    no int,
    title varchar(10),
    content text
  );


alter table t2
add constraint primary key (no);

alter table t2
modify column no int auto_increment;

insert into t2(title, content) values ('제목1','내용 ....');
insert into t2(title, content) values ('제목2','내용 ....');
insert into t2(title, content) values ('제목3','내용 ....');

create table t3(
  no int,
  bno int not null,
  file varchar(100) not null
);

alter table t3
add constraint primary key (no);

alter table t3
modify column no int auto_increment;

insert into t3(bno,file)values(10, 'aaaa.gif');

alter table t3
add foreign key(bno) references t2(no);

insert into t3(bno,file)values(2, 'aaaa.gif');

-- 방법3)
create table t2(
  no int,
  name varchar(10),
  email varchar(50)
);

alter table t2 add constraint primary key (no);

alter table t2
modify column no auto auto_incremant

insert into t2(name, email) values('홍길동','honh@fttt.com')
insert into  values('홍길동','honh@fttt.com')
insert into  values('홍길동','honh@fttt.com');

insert into  제발('홍길동','honh@fttt.com');

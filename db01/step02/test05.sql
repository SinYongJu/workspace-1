-- 방법3)
alter table t2 add constraint primary key (no);

insert into t2(no, name, gerder, height, intro, birthday, regdate)
values (1, '홍길순', 'W', 160.5, '길순이', '1993-5-5', '2017-4-17 15:23:11');

insert into t2(no, name, gerder, height, intro, birthday, regdate)
values (2, '홍길순이다', 'W', 160.5, '길순이', '1993-5-5', '2017-4-17 15:23:11');

insert into t2(no, name, gerder, height, intro, birthday, regdate)
values (3, '홍길순이라고한다', 'W', 160.5, '길순이', '1993-5-5', '2017-4-17 15:23:11');

alter table t2
change column name fst_nm varchar(10),
add column lst_nm varchar(10);

alter table t2
modify column fst_nm  varchar(8);

alter table  t2
modify column height varchar(10);

alter table  t2
modify column gerder int(10);

update t2 set gerder int;

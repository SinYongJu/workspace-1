create table t2(
  no int primary key,
  name varchar(10),
  gerder char(1),
  height numeric(4,1),
  intro text,
  birthday date,
  regdate datetime
);

insert into t2(no, name, gerder, height, intro, birthday, regdate)
values (1, '홍길순', 'W', 160.5, '길순이', '1993-5-5', '2017-4-17 15:23:11');

/* pk 는 중복값을 가질 수 없다.
  pk 칼럼은 기본이 not null이다. 즉 반드시 값을 입력해야한다.
*/

create table t2(
  no int,
  name varchar(10),
  gerder char(1),
  height numeric(4,1),
  intro text,
  birthday date,
  regdate datetime,
  constraint primary key (no)
);

-- 방법3)
create table t2(
  no int,
  name varchar(10),
  gerder char(1),
  height numeric(4,1),
  intro text,
  birthday date,
  regdate datetime
);

alter table t2 add constraint primary key (no);

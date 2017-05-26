/* mdiumtext  2 ** 24 약 1600만자
  longtext 2 ** 32 약 42억자
  datetime 년 월 일 시 분 초 날짜 및 시간입력
*/

create table t2(
  no int,
  name varchar(10),
  gerder char(1),
  height numeric(4,1),
  intro text,
  birthday date,
  regdate datetime
);

drop 테이블명
desc 테이블명

insert into t2(no, name, gerder, height, intro, birthday, regdate)
values (1, '홍길순', 'W', 160.5, '길순이', '1993-5-5', '2017-4-17 15:23:11');
/* varchar(10) 3.14를 입력하면 소수점 이하가 잘려서 들어간다.
insert into t2(no, name, gerder, height, intro, birthday, regdate)
values (3.14, '홍길순', 'W', 160.5, '길순이', '1993-5-5', '2017-4-17 15:23:11');
*/

-- 크기가 초과되어 오류발생
insert into t2(no, name, gerder, height, intro, birthday, regdate)
values (4, '12345678901', 'W', 160.5, '길순이', '1993-5-5', '2017-4-17 15:23:11');

insert into t2(no, name, gerder, height, intro, birthday, regdate)
values (5, '가나다라마바사아자차', 'W', 160.5, '길순이', '1993-5-5', '2017-4-17 15:23:11');

insert into t2(no, name, gerder, height, intro, birthday, regdate)
values (6, '홍길동', 'W', 60.57, '길순이', '1993-5-5', '2017-4-17 15:23:11');

-- insert into t2(no, name, gerder, height, intro, birthday, regdate)
-- values (7, '홍길동', 'W', 2060.6, '길순이', '1993-5-5', '2017-4-17 15:23:11');

insert into t2(no, name, gerder, height, intro, birthday, regdate)
values (7, '홍길동', 'W', 150.5, '길순이', '1993-5-5 7:3:5', '2017-4-17 15:23:11');
-- 시간 정보를 입력해도 날짜 정보만 저장한다.

insert into t2(no, name, gerder, height, intro, birthday, regdate)
values (8, '홍길동', 'W', 150.5, '길순이', '1993-5-5', '2017-4-17');

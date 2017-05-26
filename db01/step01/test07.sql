/*
insert into 테이블명(컬럼명, 컬럼명, ...) values ()값,값, ...)
update set where
delete from
*/

insert into memb(mno, name, tel, email, pwd)
values(40, '홍길동1','1111-1111','hong1@test.com','1111');

insert into memb(name, tel, email, pwd)
values('홍길동2','1111-1111','hong2@test.com','1111');

insert into memb(name, tel, email, pwd)
values('홍길동3','1111-1111','hong3@test.com',password('1111'));

insert memb
values(45, '홍길동4', '1111-1111', 'hong4@test.com', password('1111'));

insert tcher(tno,hmpg)
select mno, 'http://www.bitcamp.co.kr'
from memb
where mno between 40 and 49;

update tcher set fcbk='okok', twit='nono' where tno = 40;

update memb set pwd = password('1111');

delete from tcher where tno in (40, 45);
delete from memb where mno in (40,45);

delete from memb where mno =41; -- 오류발생

delete from tcher where tno 41;
delete from memb where mno = 41 CASCADE;

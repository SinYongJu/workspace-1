/*데이터 조회 명령

  select [all distinct distinctrow] 칼럼명
  from 테이블
  where 조건문
  group by 그룹명
  having 그룹조건
  order by asc[오름차순] desc[내림차순]

*/

select lno, titl, mrno
from lect
where mrno is null
order by titl asc;

/* 비교연산자 */
select lno, titl, mrno
from lect
where mrno = 32;

select lno, titl, mrno
from lect
where mrno != 32;

select lno, titl, mrno
from lect
where mrno <> 32;

select lno,titl, mrno, pric
from  lect
where pric > 300000;

select lno, titl, mrno, pric
from  lect
where pric < 300000;

select lno, titl, pric, (pric - ( pric * 0.2)) pric2
from lect;

select titl, sdt, date_add(sdt, interval 27 day) from lect;

select lno,titl, mrno, pric
from  lect
where pric > 300000 and pric < 500000;

select lno,titl, mrno, pric
from  lect
where pric < 300000 or pric > 1000000;

select lno, titl, mrno
from lect
where mrno != 32;

select lno, titl, mrno
from lect
where mrno = 32;

select lno, titl, mrno
from lect
where not mrno = 32;

select lno, titl, mrno
from lect
where not mrno = 'null';

select lno, titl, mrno
from lect
where not mrno is null

select lno,titl, mrno
from lect
where mrno in (31,32)

select lno,titl
from lect
where titl = '자바기초';

select lno,titl
from lect
where titl like '웹%';

select lno,titl
from lect
where titl like '%과정';

select *
from croom
where name like '강남_01'

select lno, titl, pric
from lect
where pric between 150000 and 450000;

select lno, titl, sdt, edt
from lect
where sdt between '2017-05-01' and '2017-06-30';

select lno, titl, crmno
from lect
where crmno is null;

select mrno, posi from mgr
union
select tno, hmpg from tcher
union
select sno, schl_nm from stud;

select mrno from mgr
union
select tno from tcher;

select mrno from mgr
union all
select tno from tcher;

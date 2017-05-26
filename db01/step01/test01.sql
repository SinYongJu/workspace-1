/*데이터 조회 명령

  select [all distinct distinctrow] 칼럼명
  from 테이블
  where 조건문
  group by 그룹명
  having 그룹조건
  order by asc[오름차순] desc[내림차순]

*/

-- 이름 오름차순
select mno, name, tel, email
from memb
order by name asc;

--
select mno, name, tel, email
from memb
order by name desc;

select lno, crmno, mrno, til
from lect
order by crmno asc;

select lano, lno, sno
from lect_appy
order by lno desc, sno asc;

/*실행순서 from -> select -> order by */
select lano, sno
from lect_appy
order by lno asc, sno desc;

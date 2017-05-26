/*데이터 조회 명령

  select [all distinct distinctrow] 칼럼명
  from 테이블
  where 조건문
  group by 그룹명
  having 그룹조건
  order by asc[오름차순] desc[내림차순]

*/

select lno, crmno, mrno, titl
from lect;


select lno, crmno as classRoomNo, mrno managerno, titl as 'class name'
from lect;

select count(*) cnt from lect;

select concat('(',lno, ':', titl, '-', mrno, ')') lectureInfo from lect;

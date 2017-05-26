select la.Lno, l.titl, cr.name, m.name, mg.posi, m2.name, s.work
from lect_appy la
  inner join lect l on la.lno = l.lno
  left outer join croom cr on l.crmno =cr.crmno
  left outer join memb m on l.mrno = m.mno
  left outer join mgr mg on l.mrno = mg.mrno
  left outer join memb m2 on m2.mno = la.sno
  left outer join stud s on s.sno = la.sno;


/*
select절에 서브쿼스 사용하기
*/

select la.Lno, l.titl, cr.name, m.name,
(select posi from mgr where mrno = l.mrno) as position, m2.name,
(select work from stud where sno = la.sno) as working
from lect_appy la
  inner join lect l on la.lno = l.lno
  left outer join croom cr on l.crmno =cr.crmno
  left outer join memb m on l.mrno = m.mno
  left outer join mgr mg on l.mrno = mg.mrno
  left outer join memb m2 on m2.mno = la.sno;


/* 서브 쿼리
SELECT PLAYER_NAME 선수명, POSITION 포지션, BACK_NO 백넘버
FROM PLAYER
WHERE TEAM_ID = (SELECT TEAM_ID
                 FROM PLAYER
                 WHERE PLAYER_NAME = '정남일')
ORDER BY PLAYER_NAME;
*/

/*2)
*/
select la.Lno, l.titl, cr.name, m.name,
(select posi from mgr where mrno = l.mrno) as position, m2.name,
(select work from stud where sno = la.sno) as working,
from lect_appy la
  inner join lect l on la.lno = l.lno
  left outer join croom cr on l.crmno =cr.crmno
  left outer join memb m on l.mrno = m.mno
  left outer join memb m2 on m2.mno = la.sno;

select tno, m.name from tcher t inner join memb m on t.tno = m.mno;
--------------------------------------------------------------------

select mr.mrno, m.name
from mgr mr inner join memb m on mr.mrno = m.mno;

select lno, titl, mrno
from lect l;

select l.lno, l.titl, m.name
from lect l
left outer join memb m on l.mrno = m.mno;

select l.lno, l.titl, t1.name
from lect l
left outer join(
  select mr.mrno, m.name
  from mgr mr inner join memb m on mr.mrno = m.mno) t1
  on l.mrno = t1.mrno;

  select l.lno, l.titl, t1.name
  from lect l
  inner join(
    select mr.mrno, m.name
    from mgr mr inner join memb m on mr.mrno = m.mno
    where m.name = '매니저1') t1
    on l.mrno = t1.mrno;

select l.lno, l.titl, l.crmno
from lect l;

select crmno, name
from croom
where name like '강남%';

select lno, titl, crmno
from lect l
where l.crmno in (
  select crmno
  from croom
  where name like '강남%');

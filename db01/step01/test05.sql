/*데이터 조회 명령

selecct 속성명. [속성명]
from 테이블명, 테이븖ㅇ
where 공통인거~


*/

select mno, name, tel, email
from memb;

select sno, work, lst_schl, schl_nm from stud;


/* cross join
  각 테이블의 데이터를 1:1로 연결하는것
  => 최종 결과는 n * m 개수가 된다.
  => 아무런 의미 없는 조인이다.
*/
select mno, name, tel, email, work, lst_schl, schl_nm
from memb, stud;

select mno, name, tel, email, work, lst_schl, schl_nm
from memb cross join stud;

-------------------------------------------------------
/* 2) NATURAL 조인
  => 두 테이블을 조인할 때 같은 이름을 가진 컬럼이 있을 경우,
  그 컬럼 값이 같은 것 끼리 연결한다.
*/
select l.lno, l.crmno, l.titl, c.crmno, c.name
from lect l cross join croom c;

select l.lno, l.crmno, l.titl, c.crmno, c.name
from lect l, croom c
where l.crmno = c.crmno;

select l.lno, l.crmno, l.titl, c.crmno, c.name
from lect l natural join croom c;

select l.lno, l.crmno, l.titl, c.crmno, c.name
from lect l join croom c using (crmno);

select mno, name, tel, email, work, lst_schl, schl_nm
from memb natural join stud;

select mno, name, tel, email, work, lst_schl, schl_nm
from memb, stud
where memb.mno = stud.sno;

/*where 대신 join on사용 가능*/
--------------------------------------------------------

/* 3)join on
*/

select mno, name, work, lst_schl
from memb join stud on memb.mno = stud.sno;

select mno, name, work, lst_schl
from memb inner join stud on memb.mno = stud.sno;

------------------------------------------------------------
/* 4) outer join*/

select l.lno, l.titl, c.name
from lect l inner join croom c on l.crmno = c.crmno;

select l.lno, l.titl, c.name
from lect l, croom c
where l.crmno = c.crmno(+);

select l.lno, l.titl, c.name
from lect l left outer join croom c on l.crmno = c.crmno;

select l.lno, l.titl, c.name
from lect l right outer join croom c on l.crmno = c.crmno;

/*
lect 강의정보
croom  강의실
mgr 매니저
lect_appy 수강신청
stud 학생
memb 회원기본정보
강의번호 강의제목 교실이름 매니저이름 수강생명 재직여부

수강신청번호
강의번호 Lno<lect>  = Lno<lect_appy;
강의제목 titl<lect>
교실이름 name<croom>
매니저 이름  mrno<mgr> = mno<memb> => 매니저이름
매니저 직급 posi<mgr>
수강생명  sno<stud>-> mno<memb> => name
재직여부 work(stud)

*/
select la.Lno, l.titl, c.name, m.posi, s.name, m
from lect_appy la, lect l, croom c, mgr m
where la.lno = l.lno and la.lno = c.crmno and l.mrno = m.mrno;

-----------

select la.Lno, l.titl, cr.name, m.name, mg.posi, m2.name, s.work
from lect_appy la
  inner join lect l on la.lno = l.lno
  left outer join croom cr on l.crmno =cr.crmno
  left outer join memb m on l.mrno = m.mno
  left outer join mgr mg on l.mrno = mg.mrno
  left outer join memb m2 on m2.mno = la.sno
  left outer join stud s on s.sno = la.sno;

select la.Lno, l.titl, cr.name, m.name, mg.posi, m2.name, s.work
from lect_appy la
  inner join lect l on la.lno = l.lno
  left outer join croom cr on l.crmno =cr.crmno
  left outer join memb m on l.mrno = m.mno
  left outer join mgr mg on l.mrno = mg.mrno
  left outer join memb m2 on m2.mno = la.sno
  left outer join stud s on s.sno = la.sno;

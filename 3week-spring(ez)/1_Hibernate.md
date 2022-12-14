# Hibernate ORM

## 정의
- 자바 언어를 위한 ORM 프레임워크
-  JPA의 구현체로, JPA 인터페이스를 구현하며, 내부적으로 JDBC API를 사용해요.
-  object–relational mapping tool
- GNU Lesser General Public License 2.1. 

## 왜 쓰는가?
- 관계형 데이터베이스와 객체의 패러다임 불일치 문제를 해결할 수 있다는 점
- 영속성 컨텍스트(엔티티를 영구 저정하는 환경) 제공

## 장점
- 생산성: SQL을 직접 사용하지 않고, 메서드 호출만으로 쿼리가 수행
- 유지보수: 테이블 컬럼이 변경되었을 때, 테이블과 관련된 DAO의 파라미터, 결과, SQL 등을 대신 수행
- 특정 벤더에 종속적이지 않음: 설정 파일에서 JPA에게 어떤 DB를 사용하고 있는지를 알려주기만 하면 얼마든지 DB를 바꿀 수 있다.
- 패러다임 불일치 해결: 상속, 연관 관계, 객체 그래프 탐색, 비교 등

## 단점
- 성능
- 세밀함
- 러닝커브

## with JAP
JPA는 기술 스펙이고 하이버네이트는 이 기능을 구현하여 공급해주는 역할


## 정리 

> JAP는 인터페이스, 하이버네이트는 JPA 구현체
> 스프링 데이터 JPA는 JPA에 대한 데이터 접근의 추상화






## Ref

출처: https://livenow14.tistory.com/70 [경험의 연장선:티스토리]
https://sas-study.tistory.com/364
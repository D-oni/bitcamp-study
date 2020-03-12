# 43_2 - MyBatis + Transaction 적용

## 학습목표

- Mybatis로 트랜잭션을 제어할 수 있다.

## 실습 소스 및 결과

- src/main/java/com/eomcs/sql/SqlSessionProxy.java 추가
- src/main/java/com/eomcs/sql/TransactionTemplate.java 추가
- src/main/java/com/eomcs/lms/servlet/PhotoBoardAddServlet.java 변경
- src/main/java/com/eomcs/lms/servlet/PhotoBoardUpdateServlet.java 변경
- src/main/java/com/eomcs/lms/servlet/PhotoBoardDeleteServlet.java 변경

## 실습  

### 훈련1: SqlSession 프록시를 만든다.

- com.eomcs.sql.SqlSessionProxy 클래스 추가
  - close()를 호출할 때 .
- com.eomcs.sql.TransactionCallback 인터페이스 추가
  - TransactionTemplate이 작업을 실행할 때 호출할 메서드 규칙을 정의한다.
  - 트랜잭션 작업은 이 규칙에 따라 작성해야 한다.
  
### 훈련2: 트랜잭션을 사용할 곳에 TransactionTemplate을 적용하라.

- com.eomcs.lms.servlet.PhotoBoardAddServlet 변경
  - PlatformTransactionManager를 직접 사용하는 대신에 TransactionTemplate을 사용한다.
- com.eomcs.lms.servlet.PhotoBoardUpdateServlet 변경
  - PlatformTransactionManager를 직접 사용하는 대신에 TransactionTemplate을 사용한다.
- com.eomcs.lms.servlet.PhotoBoardDeleteServlet 변경
  - PlatformTransactionManager를 직접 사용하는 대신에 TransactionTemplate을 사용한다.
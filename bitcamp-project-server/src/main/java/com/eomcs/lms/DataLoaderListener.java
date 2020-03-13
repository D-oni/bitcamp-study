package com.eomcs.lms;


import java.io.InputStream;
import java.util.Map;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import com.eomcs.lms.context.ApplicationContextListener;
<<<<<<< HEAD
import com.eomcs.lms.dao.BoardDao;
import com.eomcs.lms.dao.LessonDao;
import com.eomcs.lms.dao.MemberDao;
import com.eomcs.lms.dao.PhotoBoardDao;
import com.eomcs.lms.dao.PhotoFileDao;
import com.eomcs.lms.service.impl.BoardServiceImpl2;
import com.eomcs.lms.service.impl.LessonServiceImpl;
import com.eomcs.lms.service.impl.MemberServiceImpl;
import com.eomcs.lms.service.impl.PhotoBoardServiceImpl;
import com.eomcs.sql.MybatisDaoFactory;
=======
import com.eomcs.lms.dao.mariadb.BoardDaoImpl;
import com.eomcs.lms.dao.mariadb.LessonDaoImpl;
import com.eomcs.lms.dao.mariadb.MemberDaoImpl;
import com.eomcs.lms.dao.mariadb.PhotoBoardDaoImpl;
import com.eomcs.lms.dao.mariadb.PhotoFileDaoImpl;
<<<<<<< HEAD
import com.eomcs.util.ConnectionFactory;
=======
>>>>>>> 81c676cdd8bbf48520b950703bd4f8005004938e
import com.eomcs.sql.PlatformTransactionManager;
import com.eomcs.sql.SqlSessionFactoryProxy;
>>>>>>> cbf19149218ccad337991d6d834c62e0c604d922

// 애플리케이션이 시작되거나 종료될 때
// 데이터를 로딩하고 저장하는 일을 한다.
//
public class DataLoaderListener implements ApplicationContextListener {

  @Override
  public void contextInitialized(Map<String, Object> context) {

    try {
      // Mybatis 객체 준비
      InputStream inputStream = Resources.getResourceAsStream(//
          "com/eomcs/lms/conf/mybatis-config.xml");

<<<<<<< HEAD
      // Connection 팩토리 준비
      ConnectionFactory conFactory = new ConnectionFactory(//
          jdbcUrl, username, password);
      context.put("connectionFactory", conFactory);

      // 이 메서드를 호출한 쪽(App)에서 DAO 객체를 사용할 수 있도록 Map 객체에 담아둔다.
      context.put("boardDao", new BoardDaoImpl(conFactory));
      context.put("lessonDao", new LessonDaoImpl(conFactory));
      context.put("memberDao", new MemberDaoImpl(conFactory));
      context.put("photoBoardDao", new PhotoBoardDaoImpl(conFactory));
      context.put("photoFileDao", new PhotoFileDaoImpl(conFactory));
=======
      //트랜잭션 제어를 위해 오리지널 객체를 프록시 객체에 담아 사용한다.
      SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryProxy(
          new SqlSessionFactoryBuilder().build(inputStream));
      context.put("sqlSessionFactory", sqlSessionFactory);

      // DAO프록시 를 생성해 줄 Factory 준비
      MybatisDaoFactory daoFactory = new MybatisDaoFactory(sqlSessionFactory);

      BoardDao boardDao =daoFactory.createDao(BoardDao.class);
      LessonDao lessonDao =daoFactory.createDao(LessonDao.class);
      MemberDao memberDao =daoFactory.createDao(MemberDao.class);
      PhotoBoardDao photoBoardDao =daoFactory.createDao(PhotoBoardDao.class);
      PhotoFileDao photoFileDao =daoFactory.createDao(PhotoFileDao.class);

      // 트랜잭션 관리자 준비
      PlatformTransactionManager txManager = new PlatformTransactionManager(sqlSessionFactory);
<<<<<<< HEAD
=======
      context.put("transactionManager", txManager);
>>>>>>> cbf19149218ccad337991d6d834c62e0c604d922
>>>>>>> 81c676cdd8bbf48520b950703bd4f8005004938e


      //서블릿에서 사용할 서비스 객체를 준비한다.
      context.put("memberService",new MemberServiceImpl(memberDao));
      context.put("boardService",new BoardServiceImpl2(sqlSessionFactory));
      context.put("lessonService",new LessonServiceImpl(lessonDao));
      context.put("photoBoardService",new PhotoBoardServiceImpl(txManager,photoBoardDao,photoFileDao));

    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  @Override
<<<<<<< HEAD
  public void contextDestroyed(Map<String, Object> context) {}
=======
  public void contextDestroyed(Map<String, Object> context) {
  }
>>>>>>> cbf19149218ccad337991d6d834c62e0c604d922
}

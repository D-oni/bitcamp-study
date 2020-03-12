package com.eomcs.lms.dao.mariadb;

<<<<<<< HEAD
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
=======
>>>>>>> cbf19149218ccad337991d6d834c62e0c604d922
import java.util.List;
import java.util.Map;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import com.eomcs.lms.dao.LessonDao;
import com.eomcs.lms.domain.Lesson;
<<<<<<< HEAD
import com.eomcs.util.ConnectionFactory;

public class LessonDaoImpl implements LessonDao {

  ConnectionFactory conFactory;

  public LessonDaoImpl(ConnectionFactory conFactory) {
    this.conFactory = conFactory;
=======

public class LessonDaoImpl implements LessonDao {

  SqlSessionFactory sqlSessionFactory;

  public LessonDaoImpl( //
      SqlSessionFactory sqlSessionFactory) {
    this.sqlSessionFactory = sqlSessionFactory;
>>>>>>> cbf19149218ccad337991d6d834c62e0c604d922
  }

  @Override
  public int insert(Lesson lesson) throws Exception {
<<<<<<< HEAD
    try (Connection con = conFactory.getConnection(); //
        Statement stmt = con.createStatement()) {

      int result = stmt.executeUpdate(
          "insert into lms_lesson(sdt, edt, tot_hr, day_hr, titl, conts)" + " values('"
              + lesson.getStartDate().toString() + "', '" + lesson.getEndDate().toString() + "', "
              + lesson.getTotalHours() + ", " + lesson.getDayHours() + ", '" + lesson.getTitle()
              + "', '" + lesson.getDescription() + "')");
      return result;
=======
    try (SqlSession sqlSession = sqlSessionFactory.openSession()) {
      int count = sqlSession.insert("LessonMapper.insertLesson", lesson);
      return count;
>>>>>>> cbf19149218ccad337991d6d834c62e0c604d922
    }
  }

  @Override
  public List<Lesson> findAll() throws Exception {
<<<<<<< HEAD
    try (Connection con = conFactory.getConnection(); //
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery( //
            "select lesson_id, titl, sdt, edt, tot_hr from lms_lesson")) {

      ArrayList<Lesson> list = new ArrayList<>();

      while (rs.next()) {
        Lesson lesson = new Lesson();

        lesson.setNo(rs.getInt("lesson_id"));
        lesson.setTitle(rs.getString("titl"));
        lesson.setStartDate(rs.getDate("sdt"));
        lesson.setEndDate(rs.getDate("edt"));
        lesson.setTotalHours(rs.getInt("tot_hr"));

        list.add(lesson);
      }

      return list;
=======
    try (SqlSession sqlSession = sqlSessionFactory.openSession()) {
      return sqlSession.selectList("LessonMapper.selectLesson");
>>>>>>> cbf19149218ccad337991d6d834c62e0c604d922
    }
  }

  @Override
  public Lesson findByNo(int no) throws Exception {
<<<<<<< HEAD
    try (Connection con = conFactory.getConnection(); //
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery( //
            "select lesson_id, titl, conts, sdt, edt, tot_hr, day_hr" + " from lms_lesson"
                + " where lesson_id=" + no)) {

      if (rs.next()) { // 데이터를 한 개 가져왔으면 true를 리턴한다.
        Lesson lesson = new Lesson();
        lesson.setNo(rs.getInt("lesson_id"));
        lesson.setTitle(rs.getString("titl"));
        lesson.setDescription(rs.getString("conts"));
        lesson.setStartDate(rs.getDate("sdt"));
        lesson.setEndDate(rs.getDate("edt"));
        lesson.setTotalHours(rs.getInt("tot_hr"));
        lesson.setDayHours(rs.getInt("day_hr"));
        return lesson;

      } else {
        return null;
      }
=======
    try (SqlSession sqlSession = sqlSessionFactory.openSession()) {
      return sqlSession.selectOne("LessonMapper.selectDetail", no);
>>>>>>> cbf19149218ccad337991d6d834c62e0c604d922
    }
  }

  @Override
  public int update(Lesson lesson) throws Exception {
<<<<<<< HEAD
    try (Connection con = conFactory.getConnection(); //
        Statement stmt = con.createStatement()) {

      int result = stmt.executeUpdate("update lms_lesson set" //
          + " titl='" + lesson.getTitle() //
          + "', conts='" + lesson.getDescription() //
          + "', sdt='" + lesson.getStartDate() //
          + "', edt='" + lesson.getEndDate() //
          + "', tot_hr=" + lesson.getTotalHours() //
          + ", day_hr=" + lesson.getDayHours() //
          + " where lesson_id=" + lesson.getNo());

      return result;
=======
    try (SqlSession sqlSession = sqlSessionFactory.openSession()) {
      int count = sqlSession.update("LessonMapper.updateLesson", lesson);
      return count;
>>>>>>> cbf19149218ccad337991d6d834c62e0c604d922
    }
  }

  @Override
  public int delete(int no) throws Exception {
<<<<<<< HEAD
    try (Connection con = conFactory.getConnection(); //
        Statement stmt = con.createStatement()) {

      int result = stmt.executeUpdate("delete from lms_lesson where lesson_id=" + no);

      return result;
=======
    try (SqlSession sqlSession = sqlSessionFactory.openSession()) {
      int count = sqlSession.delete("LessonMapper.deleteLesson", no);
      return count;
>>>>>>> cbf19149218ccad337991d6d834c62e0c604d922
    }
  }
  @Override
  public List<Lesson> findByKeyword(Map<String,Object> params) throws Exception {
    try (SqlSession sqlSession = sqlSessionFactory.openSession()) {
      return sqlSession.selectList("LessonMapper.selectLesson",params);
    }
  }


}

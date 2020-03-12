package com.eomcs.lms.dao.mariadb;

<<<<<<< HEAD
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
=======
>>>>>>> cbf19149218ccad337991d6d834c62e0c604d922
import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import com.eomcs.lms.dao.BoardDao;
import com.eomcs.lms.domain.Board;
<<<<<<< HEAD
import com.eomcs.util.ConnectionFactory;

public class BoardDaoImpl implements BoardDao {

  ConnectionFactory conFactory;

  public BoardDaoImpl(ConnectionFactory conFactory) {
    this.conFactory = conFactory;
=======

public class BoardDaoImpl implements BoardDao {

  SqlSessionFactory sqlSessionFactory;

  public BoardDaoImpl( //
      SqlSessionFactory sqlSessionFactory) {
    this.sqlSessionFactory = sqlSessionFactory;
>>>>>>> cbf19149218ccad337991d6d834c62e0c604d922
  }

  @Override
  public int insert(Board board) throws Exception {
<<<<<<< HEAD

    Connection c1 = conFactory.getConnection();
    Connection c2 = conFactory.getConnection();
    Connection c3 = conFactory.getConnection();
    System.out.println(c1 == c2);
    System.out.println(c1 == c3);

    try (Connection con = conFactory.getConnection(); //
        Statement stmt = con.createStatement()) {

      int result = stmt.executeUpdate("insert into lms_board(conts) values('" //
          + board.getTitle() + "')");

      return result;
=======
    try (SqlSession sqlSession = sqlSessionFactory.openSession()) {
      int count = sqlSession.insert("BoardMapper.insertBoard", board);
      return count;
>>>>>>> cbf19149218ccad337991d6d834c62e0c604d922
    }
  }

  @Override
  public List<Board> findAll() throws Exception {
<<<<<<< HEAD
    try (Connection con = conFactory.getConnection();
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery( //
            "select board_id, conts, cdt, vw_cnt from lms_board order by board_id desc")) {

      ArrayList<Board> list = new ArrayList<>();

      while (rs.next()) {
        Board board = new Board();

        board.setNo(rs.getInt("board_id"));
        board.setTitle(rs.getString("conts"));
        board.setDate(rs.getDate("cdt"));
        board.setViewCount(rs.getInt("vw_cnt"));

        list.add(board);
      }

      return list;
=======
    try (SqlSession sqlSession = sqlSessionFactory.openSession()) {
      return sqlSession.selectList("BoardMapper.selectBoard");
>>>>>>> cbf19149218ccad337991d6d834c62e0c604d922
    }
  }

  @Override
  public Board findByNo(int no) throws Exception {
<<<<<<< HEAD
    try (Connection con = conFactory.getConnection(); //
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery( //
            "select board_id, conts, cdt, vw_cnt from lms_board where board_id=" + no)) {

      if (rs.next()) { // 데이터를 한 개 가져왔으면 true를 리턴한다.
        Board board = new Board();
        board.setNo(rs.getInt("board_id"));
        board.setTitle(rs.getString("conts"));
        board.setDate(rs.getDate("cdt"));
        board.setViewCount(rs.getInt("vw_cnt"));
        return board;

      } else {
        return null;
      }
=======
    try (SqlSession sqlSession = sqlSessionFactory.openSession()) {
      return sqlSession.selectOne("BoardMapper.selectDetail", no);
>>>>>>> cbf19149218ccad337991d6d834c62e0c604d922
    }
  }

  @Override
  public int update(Board board) throws Exception {
<<<<<<< HEAD
    try (Connection con = conFactory.getConnection(); //
        Statement stmt = con.createStatement()) {

      int result = stmt.executeUpdate("update lms_board set conts = '" + //
          board.getTitle() + "' where board_id=" + board.getNo());

      return result;
=======
    try (SqlSession sqlSession = sqlSessionFactory.openSession()) {
      int count = sqlSession.update("BoardMapper.updateBoard", board);
      return count;
>>>>>>> cbf19149218ccad337991d6d834c62e0c604d922
    }
  }

  @Override
  public int delete(int no) throws Exception {
<<<<<<< HEAD
    try (Connection con = conFactory.getConnection(); //
        Statement stmt = con.createStatement()) {

      int result = stmt.executeUpdate("delete from lms_board where board_id=" + no);

      return result;
=======
    try (SqlSession sqlSession = sqlSessionFactory.openSession()) {
      int count = sqlSession.delete("BoardMapper.deleteBoard", no);
      return count;
>>>>>>> cbf19149218ccad337991d6d834c62e0c604d922
    }
  }

}

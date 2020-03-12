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
import com.eomcs.lms.dao.PhotoFileDao;
import com.eomcs.lms.domain.PhotoBoard;
import com.eomcs.lms.domain.PhotoFile;
<<<<<<< HEAD
import com.eomcs.util.ConnectionFactory;

public class PhotoFileDaoImpl implements PhotoFileDao {

  ConnectionFactory conFactory;

  public PhotoFileDaoImpl(ConnectionFactory conFactory) {
    this.conFactory = conFactory;
  }

  @Override
  public int insert(PhotoFile photoFile) throws Exception {
    try (Connection con = conFactory.getConnection(); //
        Statement stmt = con.createStatement()) {

      int result = stmt.executeUpdate( //
          "insert into lms_photo_file(photo_id,file_path) values(" //
              + photoFile.getBoardNo() + ", '" + photoFile.getFilepath() //
              + "')");

      return result;
=======

public class PhotoFileDaoImpl implements PhotoFileDao {

  SqlSessionFactory sqlSessionFactory;

  public PhotoFileDaoImpl( //
      SqlSessionFactory sqlSessionFactory) {
    this.sqlSessionFactory = sqlSessionFactory;
  }

  @Override
  public int insert(PhotoBoard photoBoard) throws Exception {
    try (SqlSession sqlSession = sqlSessionFactory.openSession()) {
      int count = sqlSession.insert(//
          "PhotoFileMapper.insertPhotoFile", photoBoard);
      return count;
>>>>>>> cbf19149218ccad337991d6d834c62e0c604d922
    }
  }

  @Override
  public List<PhotoFile> findAll(int boardNo) throws Exception {
<<<<<<< HEAD
    try (Connection con = conFactory.getConnection(); //
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery( //
            "select photo_file_id, photo_id, file_path" //
                + " from lms_photo_file" //
                + " where photo_id=" + boardNo //
                + " order by photo_file_id asc")) {

      ArrayList<PhotoFile> list = new ArrayList<>();
      while (rs.next()) {
        list.add(new PhotoFile() //
            .setNo(rs.getInt("photo_file_id")) //
            .setFilepath(rs.getString("file_path")) //
            .setBoardNo(rs.getInt("photo_id")));
      }
      return list;
=======
    try (SqlSession sqlSession = sqlSessionFactory.openSession()) {
      return sqlSession.selectList(//
          "PhotoFileMapper.selectPhotoFile", boardNo);
>>>>>>> cbf19149218ccad337991d6d834c62e0c604d922
    }
  }

  @Override
  public int deleteAll(int boardNo) throws Exception {
<<<<<<< HEAD
    try (Connection con = conFactory.getConnection(); //
        Statement stmt = con.createStatement()) {
      int result = stmt.executeUpdate( //
          "delete from lms_photo_file" //
              + " where photo_id=" + boardNo);
      return result;
=======
    try (SqlSession sqlSession = sqlSessionFactory.openSession()) {
      int count = sqlSession.delete(//
          "PhotoFileMapper.deletePhotoFile", boardNo);
      return count;
>>>>>>> cbf19149218ccad337991d6d834c62e0c604d922
    }
  }

}

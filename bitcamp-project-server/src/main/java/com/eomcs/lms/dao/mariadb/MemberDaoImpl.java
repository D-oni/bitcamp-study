package com.eomcs.lms.dao.mariadb;

<<<<<<< HEAD
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
=======
import java.util.HashMap;
>>>>>>> cbf19149218ccad337991d6d834c62e0c604d922
import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import com.eomcs.lms.dao.MemberDao;
import com.eomcs.lms.domain.Member;
<<<<<<< HEAD
import com.eomcs.util.ConnectionFactory;

public class MemberDaoImpl implements MemberDao {

  ConnectionFactory conFactory;

  public MemberDaoImpl(ConnectionFactory conFactory) {
    this.conFactory = conFactory;
=======

public class MemberDaoImpl implements MemberDao {

  SqlSessionFactory sqlSessionFactory;

  public MemberDaoImpl( //
      SqlSessionFactory sqlSessionFactory) {
    this.sqlSessionFactory = sqlSessionFactory;
>>>>>>> cbf19149218ccad337991d6d834c62e0c604d922
  }

  @Override
  public int insert(Member member) throws Exception {
<<<<<<< HEAD
    try (Connection con = conFactory.getConnection(); //
        Statement stmt = con.createStatement()) {

      int result = stmt.executeUpdate("insert into lms_member(name, email, pwd, tel, photo) "
          + "values('" + member.getName() + "', '" + member.getEmail() + "', '"
          + member.getPassword() + "', '" + member.getTel() + "', '" + member.getPhoto() + "')");

      return result;
=======
    try (SqlSession sqlSession = sqlSessionFactory.openSession()) {
      int count = sqlSession.insert("MemberMapper.insertMember", member);
      return count;
>>>>>>> cbf19149218ccad337991d6d834c62e0c604d922
    }
  }

  @Override
  public List<Member> findAll() throws Exception {
<<<<<<< HEAD
    try (Connection con = conFactory.getConnection(); //
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery( //
            "select member_id, name, email, tel, cdt from lms_member")) {

      ArrayList<Member> list = new ArrayList<>();

      while (rs.next()) {
        Member member = new Member();

        member.setNo(rs.getInt("member_id"));
        member.setName(rs.getString("name"));
        member.setEmail(rs.getString("email"));
        member.setTel(rs.getString("tel"));
        member.setRegisteredDate(rs.getDate("cdt"));

        list.add(member);
      }

      return list;
=======
    try (SqlSession sqlSession = sqlSessionFactory.openSession()) {
      return sqlSession.selectList("MemberMapper.selectMember");
>>>>>>> cbf19149218ccad337991d6d834c62e0c604d922
    }
  }

  @Override
  public Member findByNo(int no) throws Exception {
<<<<<<< HEAD
    try (Connection con = conFactory.getConnection(); //
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery( //
            "select member_id, name, email, pwd, tel, photo" + " from lms_member"
                + " where member_id=" + no)) {

      if (rs.next()) {
        Member member = new Member();
        member.setNo(rs.getInt("member_id"));
        member.setName(rs.getString("name"));
        member.setEmail(rs.getString("email"));
        member.setPassword(rs.getString("pwd"));
        member.setTel(rs.getString("tel"));
        member.setPhoto(rs.getString("photo"));
        return member;

      } else {
        return null;
      }
=======
    try (SqlSession sqlSession = sqlSessionFactory.openSession()) {
      return sqlSession.selectOne("MemberMapper.selectDetail", no);
>>>>>>> cbf19149218ccad337991d6d834c62e0c604d922
    }
  }

  @Override
  public int update(Member member) throws Exception {
<<<<<<< HEAD
    try (Connection con = conFactory.getConnection(); //
        Statement stmt = con.createStatement()) {

      int result =
          stmt.executeUpdate("update lms_member set name= '" + member.getName() + "', email='"
              + member.getEmail() + "', pwd='" + member.getPassword() + "', tel='" + member.getTel()
              + "', photo='" + member.getPhoto() + "' where member_id=" + member.getNo());

      return result;
=======
    try (SqlSession sqlSession = sqlSessionFactory.openSession()) {
      int count = sqlSession.update("MemberMapper.updateMember", member);
      return count;
>>>>>>> cbf19149218ccad337991d6d834c62e0c604d922
    }
  }

  @Override
  public int delete(int no) throws Exception {
<<<<<<< HEAD
    try (Connection con = conFactory.getConnection(); //
        Statement stmt = con.createStatement()) {

      int result = stmt.executeUpdate("delete from lms_member where member_id=" + no);

      return result;
=======
    try (SqlSession sqlSession = sqlSessionFactory.openSession()) {
      int count = sqlSession.delete("MemberMapper.deleteMember", no);
      return count;
>>>>>>> cbf19149218ccad337991d6d834c62e0c604d922
    }
  }

  @Override
  public List<Member> findByKeyword(String keyword) throws Exception {
<<<<<<< HEAD
    try (Connection con = conFactory.getConnection(); //
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery( //
            "select member_id, name, email, tel, cdt" //
                + " from lms_member" //
                + " where name like '%" + keyword //
                + "%' or email like '%" + keyword //
                + "%' or tel like '%" + keyword + "%'")) {

      ArrayList<Member> list = new ArrayList<>();

      while (rs.next()) {
        Member member = new Member();

        member.setNo(rs.getInt("member_id"));
        member.setName(rs.getString("name"));
        member.setEmail(rs.getString("email"));
        member.setTel(rs.getString("tel"));
        member.setRegisteredDate(rs.getDate("cdt"));

        list.add(member);
      }

      return list;
=======
    try (SqlSession sqlSession = sqlSessionFactory.openSession()) {
      return sqlSession.selectList("MemberMapper.selectByKeyword", keyword);
    }
  }

  @Override
  public Member findByEmailAndPassword(String email, String password) throws Exception {
    try (SqlSession sqlSession = sqlSessionFactory.openSession()) {
      HashMap<String, Object> params = new HashMap<>();
      params.put("email", email);
      params.put("password", password);
      return sqlSession.selectOne("MemberMapper.selectByEmailPassword", params);
>>>>>>> cbf19149218ccad337991d6d834c62e0c604d922
    }
  }

}

package com.eomcs.lms.dao;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;
import com.eomcs.lms.domain.Member;

public class MemberFileDao {
  String filename;
  List<Member> list;


  @SuppressWarnings("unchecked")
  private void loadData() {
    File file = new File("./member.ser2");

    try (ObjectInputStream in =
        new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)))) {
      list = (List<Member>) in.readObject();
      System.out.printf("총 %d 개의 회원 데이터를 로딩했습니다.\n", list.size());

    } catch (Exception e) {
      System.out.println("파일 읽기 중 오류 발생! - " + e.getMessage());
    }
  }

  private void saveData() {
    File file = new File("./member.ser2");

    try (ObjectOutputStream out =
        new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file)))) {
      out.writeObject(list);
      System.out.printf("총 %d 개의 회원 데이터를 저장했습니다.\n", list.size());

    } catch (IOException e) {
      System.out.println("파일 쓰기 중 오류 발생! - " + e.getMessage());
    }
  }

  public int insert(Member member) throws Exception {

    Member originMember = findByNo(member.getNo());
    if (originMember != null) { // 같은 번호의 게시물이 없다면,
      return 0;
    }

    list.add(member); // 새 게시물을 등록한다.
    saveData();
    return 1;
  }

  public List<Member> findAll() throws Exception {
    return list;
  }

  public Member findByNo(int no) throws Exception {
    for (Member m : list) {
      if (m.getNo() == no) {
        saveData();
        return m;
      }
    }
    return null;
  }

  public int update(Member member) throws Exception {
    for (int i = 0; i < list.size(); i++) {
      if (list.get(i).getNo() == member.getNo()) {
        list.set(i, member); // 기존 객체를 파라미터로 받은 객체로 바꾼다.
        saveData();
        return 1;
      }
    }
    return 0;
  }

  public int delete(int no) throws Exception {
    for (int i = 0; i < list.size(); i++) {
      if (list.get(i).getNo() == no) {
        list.remove(i);
        saveData();
        return 1;
      }
    }
    return 0;
  }
}



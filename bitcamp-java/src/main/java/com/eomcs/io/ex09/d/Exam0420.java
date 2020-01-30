// Java I/O API 사용하기 - ObjectInputStream으로 Serialize 데이터를 읽기
package com.eomcs.io.ex09.d;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Exam0420 {

  public static void main(String[] args) throws Exception {
    FileInputStream fileIn = new FileInputStream("temp/test11.data");
    BufferedInputStream bufIn = new BufferedInputStream(fileIn);
    ObjectInputStream in = new ObjectInputStream(bufIn);

    // 테스트1:
    // -Member클래스를 변경하지 않은 상태에서 데이터읽기
    // 테스트2:
    // -Member클래스에 tel 필드를 추가한 후 데이터 읽기
    // 테스트3:
    // -Member클래스에 tel 필드를 추가한 후 데이터 읽기
    Member member = (Member) in.readObject();

    in.close();

    System.out.println(member);
  }

}



package com.eomcs.io.ex09.c;

public class Member {
  String name;
  int age;
  boolean gender; // true(여자), false(남자)

  // Exam0320의 두번째 테스트를 실행 할 때 주석을 풀라!
  // String tel;

  @Override
  public String toString() {
    return "Member [name=" + name + ", age=" + age + ", gender=" + gender + ", tel=\" + tel + \"]";
  }
}

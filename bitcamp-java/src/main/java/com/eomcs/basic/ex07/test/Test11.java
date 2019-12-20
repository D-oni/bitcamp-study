package com.eomcs.basic.ex07.test;

import java.lang.reflect.Member;

//gym 회원 정보를 입력받아 출력
public class Test11 {
  public static void main(String[] args) {

    int no;
    String name;
    int birthYear;
    char gender;
    float height;
    float weight;
    boolean personalTraining;


  }
  //래퍼런스 변수를 여러개 만들기
  Member m0,m1,m2,m3,m4;
  
  //인스턴스를 생성하여 각 래퍼런스 (변수)에 저장하기
  m0=new Member();
  m1=new Member();
  m2=new Member();
  m3=new Member();
  m4=new Member();
  
  m0.no=new Member()=100;
  m1.no=new Member()=200;
  m2.no=new Member()=300;
  m3.no=new Member()=400;
  m4.no=new Member()=500;
}
}
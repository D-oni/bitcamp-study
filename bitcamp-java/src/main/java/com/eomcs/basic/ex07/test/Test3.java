package com.eomcs.basic.ex07.test;

public class Test3 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    
    class Member{
      
    int no;
    String name;
    int birthYear;
    char gender;
    float height;
    float weight;
    boolean personalTraining;
    
  
  }
    Member m1;
    m1=new Member();
    m1.no =100;
    System.out.println(m1); //인스턴스에 부여된 고유번호와 클래스명이 출력된다.
    System.out.println(m1.no);
    
    //레퍼런스 주소를 없애는 방법
    m1 = null;  //주소가 없다는 의미로 실제메모리에 0으로 설정된다.
    System.out.println(m1);
    System.out.println(m1.no);
  }

}

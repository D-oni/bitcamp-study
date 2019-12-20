package com.eomcs.basic.ex07.test;


public class Test7 {

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
    m1.no=100;
    System.out.println(m1);
    System.out.println(m1.no);
    
    m1=new Member();
    m1.no=100;

    //기존  레퍼런스에 새 인스턴스의 주소를 저장한다
    //따라서  m1과 m2는  서로다른 인스턴스의 주소를 갖고있다
    //즉 m1과 m2가 가리키는 인스턴스가 다르다.
    Member m2 =m1;
    m1 = new Member();
    m1.no=200;
    System.out.println(m1.no);
    System.out.println(m2.no);
   
  }

}

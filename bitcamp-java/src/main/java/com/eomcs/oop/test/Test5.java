package com.eomcs.basic.ex07.test;


public class Test5 {

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
    
    //다른 레퍼런스에 주소를 저장할 수 있다.
    Member m2 =m1;
    //m2는 m1과 같은 주소를 갖고있다. 즉 같은 인스턴스를 가리킨다.
    System.out.println(m2.no);
    m2.no=200;
    System.out.println(m2.no);
   
  }

}

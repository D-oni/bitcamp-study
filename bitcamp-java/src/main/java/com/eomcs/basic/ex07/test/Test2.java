package com.eomcs.basic.ex07.test;

public class Test2 {

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
    //임의로 만든 데이터타입 =>"사용자정의 데이터타입(user defined data type)"
    //class로 메모리를 만들때 일반적인 방식으로 만들 수 없다.
    //new 명령을 사용해야한다. 
    //new Member();
    //준비된 메모리를 사용하기 위해서는 그 메모리의 주소를 변수에 보관해야한다.
    //class설계도로 만든 메모리의 주소를 저장하는 변수를 
    //reference라고 한다.
    Member m1 = new Member();
    
    //m1
    //-Member설계도에 따라 준비된 메모리(인스턴스=객체)의 주소를 저장 할 변수
    //이렇게 인스턴스의 주소를 저장하는 변수를 레퍼런스변수라고 한다.
    //-다른 설계도로 만든 메모리의 주소를 저장 할 수없다.
    //Member설계도로 만든 메모리는 이 변수를 통해 접근할 수 있다,
    //
    //new Member()
    //-Member 설계도에 따라 메모리를 준비시키는 명령이다.
    //-이 명령을 통해 생성된 메모리를
    //인스턴스라고 한다.
    //객체(object)라고 부른다
    
    //사용법
    //-레퍼런스를 통해 해당 메모리를 접근할 수 있다.
    m1.no=100;
    m1.name="홍길동";
    m1.birthYear=20110809;
  }

}

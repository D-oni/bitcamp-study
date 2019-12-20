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
    //자바 원세 데이터타입은 그냥 변수를 선언하는 순간 메모리도 준비된다.
    //변수가 곧 메모리이다.
    int i;
    
    i=100;
    
    //그러나 레퍼런스는 메모리의 주소를 담는 변수다.
    //레퍼런스를 선언했다고 해서 해당 설계도의 메모리가 준비 된 것은 아니다.
    Member m1;
    
    //m1은 메모리 주소를 저장하는 변수이다.
    //주소를 저장하지 않고 사용할 수 없다.
    m1.no=100;
   
  }

}

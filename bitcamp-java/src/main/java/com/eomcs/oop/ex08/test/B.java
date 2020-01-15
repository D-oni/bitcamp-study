package com.eomcs.oop.ex08.test;

public class B {
  //필드(field)
  static int a; //클래스필드(스태틱필드)-static이 붙은 필드 (메모리에 올라갈때 자동으로 생성)
  String b; //인스턴스필드(논스태틱 필드)
  
  //method
  static void m1() {}   //클래스 메서드(스태틱메서드)
  int m2() {return 0;}  //인스턴스 메서드(논 스태틱 메서드)

  //initializer block
  static {} //스태틱 블록
  {}    //인스턴스 블록

  //constructor
  B() {} //생성자-클래스이름과 같음
    
    //nested class
    static class L1 {}  //static nested class
    class L2 {} //non-static nested class = inner class


  }


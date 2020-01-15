package com.eomcs.oop.ex08.test;

class A1{}   //package member class
class A2{}   //package member class
public class A {   //패키지 멤버 클래스(package member class)
  class X{}    //non - nested class = inner class

  static class X2 {}   //static nested class(중첩클래스)

  void m() {
    //local class

    class Y {}
    new Object() {
      @Override   
      Object obj = new Object();
      Object obj2 = new Object();
      Object obj3 = new Object();
      public String toString() {
        return "익명클래스";


      }
    };


  }

}

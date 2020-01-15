package com.eomcs.oop.ex05.test;

public class A {

  int v1;
  
  A() {
    this(100);  //this- 생성자에서 다른 생성자 호출=>문장의 두번째로 올 수 없음  무조건 첫번째 문장이어야한다.
    System.out.println("A()");
    
  }
  A(int v1) {
    this.v1=v1; //this-인스턴스 주소로서 사용
    System.out.println("A(int)");
  }
}

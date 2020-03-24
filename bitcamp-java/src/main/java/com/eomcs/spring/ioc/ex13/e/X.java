package com.eomcs.spring.ioc.ex13.e;

import org.springframework.stereotype.Component;

@Component
public class X {
  public X() {
    System.out.println("X 객체 생성됨");
  }
  public int m1(int x, int y) {
    System.out.println("X.m1()");
    int result = x / y;

    return result;
  }
}

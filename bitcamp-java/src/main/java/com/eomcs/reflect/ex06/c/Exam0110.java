package com.eomcs.reflect.ex06.c;

import java.lang.reflect.Proxy;

<<<<<<< HEAD
//값을 리턴하는 방법
=======
// 값을 리턴하는 방법
>>>>>>> 81c676cdd8bbf48520b950703bd4f8005004938e
public class Exam0110 {
  public static void main(String[] args) {

    MyInterface obj = (MyInterface) Proxy.newProxyInstance(//
        Exam0110.class.getClassLoader(), // 클래스를 메모리에 로딩하는 일을 할 객체
        new Class[] {MyInterface.class}, // 자동 생성할 클래스가 구현해야 하는 인터페이스 목록
        new MyInvocationHandler());
<<<<<<< HEAD
    System.out.println(obj.m1());
    System.out.println(obj.m2());

=======

    System.out.println(obj.m1());
    System.out.println(obj.m2());
>>>>>>> 81c676cdd8bbf48520b950703bd4f8005004938e
  }
}

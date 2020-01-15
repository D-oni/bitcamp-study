package com.eomcs.oop.ex06.c;

public class C {
  //private 접근범위
  //=>현재클래스
    private void m1() {}    //현재 클래스에서만 접근가능

    //(default) 접근범위:
    //=>현재클래스+같은 패키지 소속 클래스
    void m3() {}
    
    //protected 접근범위:
    //=>현재 클래스+같은 패키지 소속 클래스+서브클래스
    protected void m2() {}  //현재클래스+같은 패키지 클래스+자식클래스 만 접근가능
    
    //public 접근범위:
    //=>모두
    public void m4() {}
}

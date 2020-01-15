package com.eomcs.oop.ex05.e;

public class A {
    int v1; //4.static 실행 한 후 변수 생성   
    
    static { 
        System.out.println("A클래스의 static{} 실행!");   //1.static 블럭이 있으면 먼저 실행
    }
}



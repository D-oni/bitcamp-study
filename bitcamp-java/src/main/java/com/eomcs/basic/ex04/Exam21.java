package com.eomcs.basic.ex04;

public class Exam21 {
  public static void main(String[] args) {
    //정수변수 - 메모리크기
    byte b; //1바이트 0000 0000 ~ 1111 1111 = 00~ff = -128~127
    b= -128;
    b =127;

    b=-129;

    //2바이트 메모리 :-32768 ~ +32767
    short s;
    s= -32768;
    s = 32767;

    //4바이트메모리: 약 -21억 ~ +21억
    int i; 
    i=-21_0000_0000;
    i=21_0000_0000;

    //8바이트 메모리 : 약 -922경~922경
    long l;
    l=922_0000_0000_0000_0000L;
    l=-922_0000_0000_0000_0000L;


  }
}
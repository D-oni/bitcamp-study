package com.eomcs.basic.ex04;

//형변환 : 정수변수 ==>부동소수점 변수
public class Exam91 {
  public static void main(String[] args) {
    byte b =100;
    short s =200;
    int i =18_3456_6789;
    long l =344_9876_9998_7654_3219L;
    
    //메모리 크기에 상관없이 정수변수의 값을 부동 소수점 변수에 넣을 때
    //컴파일 오류가 발생하지않는다
    //단 ,실행할 때 유효자릿수가 넘어가면 값이 잘릴수있다.(에러를 안띄워 값이 나오는 것을 확인 해야함)
    float f;
    f =b;
    System.out.println(f);
    f = s;
    System.out.println(f);
    f =i;
    System.out.println(f);
    f = l;
    System.out.println(f);


    float d;
    d =b;
    System.out.println(d);
    f = s;
    System.out.println(d);
    f =i;
    System.out.println(d);
    f = l;
    System.out.println(d);
 
   }
}
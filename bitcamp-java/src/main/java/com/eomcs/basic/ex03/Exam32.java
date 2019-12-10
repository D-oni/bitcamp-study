package com.eomcs.basic.ex03;

//부동소수점 리터럴(literal)-메모리크기
//

public class Exam32 {
  public static void main(String[] args) {
    //부동소수점: 4바이트,8바이트(기본)
    System.out.println(3.141592653589793);  //8바이트 부동소수점
    System.out.println(3.141592653589793d);  //8바이트 부동소수점
    System.out.println(3.141592653589793D);  //8바이트 부동소수점

    //4바이트 부동소수점
    System.out.println(3.141592653589793f);  //8바이트 부동소수점
    System.out.println(3.141592653589793F);  //8바이트 부동소수점
  }
}

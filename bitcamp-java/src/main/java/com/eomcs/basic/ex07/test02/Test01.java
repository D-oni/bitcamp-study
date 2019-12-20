package com.eomcs.basic.ex07.test02;

public class Test01 {
  public static void main (String[] args) {
    //입력값:X,리턴값:X
    m1();

    //입력값:o,리턴값:X
    m2("홍길동");

    //입력값:X,리턴값:o
    String s;
    s = m3();
    System.out.println(s);

    //입력값=o,리턴값:o
    String s2=m4("홍길동");
    System.out.println(s2);
  }
  static void m1() {
    System.out.println("Hello!");
  }
  static void m2(String name) {
    //함수안에 선언된 변수를 "로컬(local)변수"라 부른다
    //로컬변수중에서 함수(메서드)가 호출될 때 넘어 온 값을
    //받는 변수를 "파라미터(parameter)" 라 부른다
    //함수를 호출 할 때 넘겨주는 값을 "아규먼트(argument)"라 부른다.
    System.out.println("Hello,"+name);
  }
  static String m3() {  //리턴타입이 있다. 리턴타입:String
    String message ="Hello!" ;
    return message;
  }
  static String m4(String name) {
    String message=name+"님 안녕하세요!";
    return message;
  }
}


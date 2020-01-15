package com.eomcs.basic.ex05x;

//# 비트 연산자(&, |, ^, ~)
//
public class Exam0351 {
  public static void main(String[] args) {
    System.out.println(57 % 2);
    System.out.println(57 & 0b1);  //뒤 세자리만 추출하는 것과
    //어떤 값에 대해 2 로 나눈 나머지 값을 구하고 싶다면
    //그 값의 하위 1비트 값만 추출하면 된다.
    System.out.println(57 % 4);
    System.out.println(57 & 0b11);
    //어떤 값에 대해 4로 나눈 나머지 값을 구하고 싶다면
    //그 값의 하위 2비트 값만 추출하면 된다.
    System.out.println(57 % 8);
    System.out.println(57 & 0b111);
    //어떤 값에 대해 8로 나눈 나머지 값을 구하고 싶다면
    //그 값의 하위 3비트 값만 추출하면 된다.
    System.out.println(57 % 16);
    System.out.println(57 & 0b1111);
    //어떤 값에 대해 16로 나눈 나머지 값을 구하고 시ㅠ다면
    //그 값의 하위 4비트 값만 추출하면 된다.
    
  }
}
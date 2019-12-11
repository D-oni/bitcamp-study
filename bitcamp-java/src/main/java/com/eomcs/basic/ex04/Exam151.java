package com.eomcs.basic.ex04;

public class Exam151 {
  public static void main(String[] args) {
    int i; 
    i=100;
    System.out.println(i);

    int j;
    j=i;  //i변수에 들어있는 값을 j변수에 넣어라

    //할당연산자 '='
    //-변수에 값을 넣는 일을 한다
    //-문법
    //1-value =r-value;
    //l-value :변수가 와야한다. 값이 올 수 없다.
    //r-value :값이나 변수, 표현식이 올 수 있다.

    //200=300 //오류
    //200 = i //  오류

      j = 300;
      j = i;  //변수
      j = i *3;  //표현식
      j=Math.abs(-200); //표현식
      j = (i>100) ? 1 : -1; //표현식
      j =System.out.println(100); //그냥 문장, 표현식x

      //문장(statement)
      //-자바언어로 작성한 명령어 
      //
      //-표현식(expression)
      //-문장 중에 값을 리턴하는 문장
    
    
  }
}
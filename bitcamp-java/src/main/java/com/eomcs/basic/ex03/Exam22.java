package com.eomcs.basic.ex03;

//리터럴(literal)
//자바언어에서 값을 표기하는 문법

public class Exam22 {
  public static void main(String[] args) {
   //10진수리터럴
    System.out.println(2_3500_0000);
    System.out.println(23_500_0000);
    System.out.println(235_0000_00);
    //System.out.println(235_0000_00_);
    //System.out.println(_235_0000_00); //가장 앞이나 가장 뒤에 under bar가 있으면 오류

    //8진수리터럴
  System.out.println(0144);
  System.out.println(01_44);
  System.out.println(0_144);
  //System.out.println(_0144);
  //System.out.println(0144_);  //가장 앞이나 가장 뒤에 under bar가 있으면 오류


  //2진수
  System.out.println(0b01100100);
  //System.out.println(0b_01100100);
  //System.out.println(0b01100100_);
  //System.out.println(_0b01100100);  //가장 앞이나 가장 뒤에 under bar가 있으면 오류

  //16진수
  System.out.println(0x0064);
  //System.out.println(0x_0064);
  //System.out.println(0x0064_);
  //System.out.println(_0x0064);  //가장 앞이나 가장 뒤에 under bar가 있으면 오류
  }
}
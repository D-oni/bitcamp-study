package com.eomcs.basic.ex03;

//문자 리터럴(literal)
//

public class Exam41 {
  public static void main(String[] args) {
    System.out.println('A');
    System.out.println('가');

    System.out.println('\u4eba'); //[\ u][ucs-2코드]
    System.out.println('\u0041'); //A
    System.out.println('\u0030'); //0 문자
    System.out.println('\u0025'); //% 문자
    System.out.println('\uac00'); //가 문자x
    //Character Set
    //문자에 대해 코드 값을 정의 한 표

    //1) ASCII(7bit)
    //A => 100 0001
    //B => 100 0010
    //C => 100 0011
    //
    //a => 1100001
    //b => 110 0010
    //c => 110 0011
    //
    //0 => 011 0000
    //1 => 011 0001
    //2 => 011 0010
    //영어 대소문자,숫자,특수문자 약 90여개 문자에 대해 코드값(2진수) 정의

    //|
    //V

    //2) ISO- 8859-1(8비트)
    //(ISO-Latin-1)
    //ASCII+서유럽문자 =200여개
    //A => 0100 0001
    //B => 0100 0010
    //C => 0100 0011
  
    //|
    //V

    //3) EUC-KR(16비트)
    //영어 => ISO-8859-1(8bit)
    //한글 => 2 byte 코드값
    //가 => 0xB0AI
    //     B    0    A    1
    //    1101 0000 1010 0001
    //각 => 0x B0A2

    //|
    //V

    //4) 조합형(16비트)
    //ㄱ 00010  ㅏ 00011 ㄱ 00010
    //ㄴ 00100  ㅑ 00100  ㄴ 00101
    //녁 => 1001 0001 0110 0010
    //  0x    9    1    6   2
    //65536개의 코드 중에서 절반을 한글에 사용

    //|
    //V

    //5) MS949
    //EUC-KR + a  =>11172자
    //가 => 0xB0A1
    //나 => 0xB0A2

    //똘 => 0xB6CA
    //똠 => 0x8C63
    //국제표준 X
    
  }
}
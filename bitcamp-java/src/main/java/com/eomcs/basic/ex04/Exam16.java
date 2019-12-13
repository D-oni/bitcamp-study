package com.eomcs.basic.ex04;

public class Exam16 {
  public static void main(String[] args) {
  //변수의 종류
  //"값이 직접 들어가는 변수"
  byte b;   //1바이트 크기를 갖는 메모리
  short s ;   //2
  int i;  //4
  long l; //8

  float f;  //4
  double d;  //8

  boolean bool; // JVM에서 int 로 취급

  char c; //2

  //"reference 변수"(값이 직접 들어가는 변수 8개 이외의 모든 변수)
  //=>reference : 다른 메모리의 주소를 저장하는 변수
  String str;
  Thread t; //스레드 
  java.sql.Date date;
  java.net.Socket socket; //네트워크 연결정보를 저장하고있는 그 메모리의 주소
  
}
}
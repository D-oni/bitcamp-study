package com.eomcs.oop.ex02.study;

public class Car {

  public static final int OIL=1;  //조회용도 인 경우 값을 바꾸지 못하게  final로 선언
  public static final int GAS =2;   //중복하는변수- static

  String name;   //개별적으로 관리하고 싶다면 static 을 붙이지 않고 선언해야함 - 인스턴스필드
  int type;      
  String color;
  int speed;
  int energy;
  int power;
  int cleanLevel;

  void speedUp() {
    //Car this = 메서드를 호출 할 때 넘겨준 인스턴스 주소;
    if(this.speed>=100) 
      return;
    this.speed +=10;
  }
  int comparePower(Car c) {
    if(this.power > c.power)
      return -1;
    else if(this.power==c.power)
      return 0;
    else
      return 1;
  }

}



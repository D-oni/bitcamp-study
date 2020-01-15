package com.eomcs.oop.ex03.test;


public class Car {
  
  boolean on;
  int speed;
  String name;
  String maker;
  
  Engine engine;
  int distance;
  
  Car() {
    this.engine=new Engine(4,16,1980);  //생성자:객체(인스턴스)가 제대로 쓰일 수 있도록 객체의 변수들을 유효한 값들로 적절히 초기화 시키는 것 
  }

   void start() {
    this.on = true;
  }
   void stop() {
    this.on = false;
  }
   void check() {   //this=Car data(instance=객체)
    if(this.engine.oilState ==0) {
      this.engine.cleanOil();
      System.out.println("자동차의 엔진오일을 교환했습니다.");
    }
    System.out.println("자동차를 정비했습니다.");
   
   }
//   void cleanOil() {
//     this.engine.oilState=10; //error=> this.engine까지는 괜찮지만 engine의 데이터를 다루는 것은 Car클래스에서 다루면 안된다.
     
//   }
}

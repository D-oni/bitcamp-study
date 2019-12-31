package com.eomcs.oop.ex02.study;

public class GasStation {
  int type; //주유소별로 타입이 달라질 수 있기 때문에 static 없이 인스턴스 선언
  String name;

   int refuel(Car c) {
    if(c.type != this.type) 
      return 0;

    int amount =100-c.energy;
    c.energy = 100;
    return amount;

  }
  static void clean(Car c) {    //인스턴스 변수, 인스턴스 필드를 사용하지 않는 메소드는 static 사용.
    c.cleanLevel=0; //static-특정 인스턴스에서만 사용-
  }

}

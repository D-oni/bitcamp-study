package com.eomcs.oop.ex05.test;

public class sedan extends Car {  //sedan-서브클래스(자식클래스) Car-수퍼클래스(부모클래스)

  public boolean sunroof;
  public boolean auto;

  public sedan() {}

  public sedan(String model, String maker, int capacity,boolean sunroof, boolean auto) {

    super(model,maker,capacity);    
    this.sunroof=sunroof;
    this.auto=auto;
  }
}




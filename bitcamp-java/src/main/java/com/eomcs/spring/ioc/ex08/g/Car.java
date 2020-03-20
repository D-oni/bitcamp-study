package com.eomcs.spring.ioc.ex08.g;

import java.sql.Date;
import org.springframework.beans.factory.annotation.Autowired;
import com.eomcs.spring.ioc.ex08.Engine;

// 생성자를 통해 의존객체 주입 - 필수 또는 선택
public class Car {
  private String model;
  private String maker;
  private int cc;
  private boolean auto;
  private Date createdDate;
//@Autowired의 required 값은 기본이 true이다.
 // => 즉 의존객체 주입이 필수사항이다.
 // => 선택사항으로 바꾸고 싶으면 false로 설정하라!
 @Autowired(required=false)
  private Engine engine;

  public Car() {
    System.out.println("Car()");
  }


  @Override
  public String toString() {
    return "Car [model=" + model + ", maker=" + maker + ", cc=" + cc + ", auto=" + auto + ", createdDate="
        + createdDate + ", engine=" + engine + "]";
  }
  public Engine getEngine() {
    return engine;
  }

//  public void setEngine(Engine engine) {
//    System.out.println("Car.setEngine()");
//    this.engine = engine;
//  }

  public boolean isAuto() {
    return auto;
  }
  public void setAuto(boolean auto) {
    this.auto = auto;
  }
  public Date getCreatedDate() {
    return createdDate;
  }
  public void setCreatedDate(Date createdDate) {
    this.createdDate = createdDate;
  }
  public String getModel() {
    return model;
  }
  public void setModel(String model) {
    this.model = model;
  }
  public String getMaker() {
    return maker;
  }
  public void setMaker(String maker) {
    this.maker = maker;
  }
  public int getCc() {
    return cc;
  }
  public void setCc(int cc) {
    this.cc = cc;
  }


}

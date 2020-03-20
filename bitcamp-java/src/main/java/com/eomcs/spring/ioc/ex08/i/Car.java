package com.eomcs.spring.ioc.ex08.i;

import java.sql.Date;
import javax.annotation.Resource;
import org.springframework.stereotype.Component;

@Component
public class Car {
  String model;
  String maker;
  int cc;
  boolean auto;
  Date createdDate;

  //이 애노테이션은 스프링 프레임워크가 아닌 자바에서 제공한다.
  //=> 자바 기본 라이브러리에 포함되어있지않다
  //따로 라이브러리를 다운로드 받아 포함시켜야한다.
  //search.maven.org 에서 javax annotation 으로 검색하여 추가
  @Resource(name="e1")
  Engine engine;

  @Override
  public String toString() {
    return "Car [model=" + model + ", maker=" + maker + ", cc=" + cc + ", auto=" + auto + ", createdDate="
        + createdDate + ", engine=" + engine + "]";
  }
  public Engine getEngine() {
    return engine;
  }

  public void setEngine(Engine engine) {
    System.out.println("Car.setEngine()");
    this.engine = engine;
  }

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

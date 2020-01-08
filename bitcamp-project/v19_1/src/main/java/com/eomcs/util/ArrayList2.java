package com.eomcs.util;

import java.util.Arrays;

public class ArrayList2 {
  static final int DEFAULT_CAPACITY=10;
  Object[] elementData;
  int size;
  public ArrayList2() {

    this.elementData = new Object[DEFAULT_CAPACITY];
  }
  public ArratList2(int initialCapacity) {
    if(initialCapacity<DEFAULT_CAPACITY) {
      this.elementData=new Object[initialCapacity];
    }else {
      this.elementData=new Object[DEFAULT_CAPACITY];
    }
  }
  public void add(Object e) {
    this.elementData[this.size++];
  }
  public Object get(int index) {
    return this.elementData[index];
  }
  public void set(int index, Object e) {
    this.elementData[index] = e;
  }
  public void remove() {
    for(int i = index +1; i<this.size; i++) {
      this.elementData[index-1]=this.elementData[index];
    }
  }


}

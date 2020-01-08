package com.eomcs.util;

import java.util.Arrays;

public class ArrayList<E> { //ArrayList에 객체를 저장할 객체를 E라고 정의

  private static final int DEFAULT_CAPACITY = 10;   //어차피 final이기 때문에 static 변수로 만드는게 편하다. 공개하지 않기 때문에 private으로 선언

  Object[] elementData;
  int size;

  public ArrayList() {
    //    super();  //생략가능
    this.elementData = new Object[DEFAULT_CAPACITY];
  }

  public ArrayList(int initialCapacity) {
    if(initialCapacity < DEFAULT_CAPACITY) {
      this.elementData = new Object[DEFAULT_CAPACITY];
    }else {
      this.elementData = new Object[initialCapacity];
    }

  }
  public void add(E e) {
    if(this.size==this.elementData.length) {
      int oldSize = this.elementData.length;
      int newSize = oldSize + (oldSize >> 1);

      this.elementData = Arrays.copyOf(this.elementData, newSize);
      /*
      Object[] newArr = new Object[newSize];

      for(int i = 0; i<this.size; i++) {
        newArr[i] = this.elementData[i];
      }
      this.elementData = newArr;
       */
    }
    this.elementData[this.size++] = e;    //후위 연산자를 놓게되면 사이즈 변수를 넣는 것이 아니라 사이즈 값을 넣는 것이다.

  }

  @SuppressWarnings("unchecked")
  public E get(int index) {
    if(index < 0 || index >= this.size) {
      return null;
    }
    return (E)this.elementData[index];
  }

  @SuppressWarnings("unchecked")
  public E set(int index, E e) {  //변경 한 후 리턴하기위해  Object로
    if(index < 0 || index >= this.size) {
      return null;
    }
    E oldValue = (E)this.elementData[index];
    this.elementData[index] = e;
    return oldValue;
  }

  @SuppressWarnings("unchecked")
  public E remove(int index) {
    if(index < 0 || index >= this.size) {
      return null;
    }

    E oldValue = (E)this.elementData[index];
    System.arraycopy(this.elementData,index + 1 , this.elementData , index , this.size- (index + 1));
    //(a,b,c)=>a에 b를 c만큼 복사
    /*
    for(int i =index +1; i< this.size; i++) {
      this.elementData[i-1] = this.elementData[i];
    }
     */
    this.size--;
    return oldValue;
  }
  public int size() {
    return this.size;

  }

  public Object[] toArray() {
    return Arrays.copyOf(this.elementData,this.size);
    /*
    Object[] arr = new Object[this.size];
    for(int i = 0; i < this.size; i++) {
      arr[i] = this.elementData[i];
    }
    return arr;
     */
  }

  @SuppressWarnings("unchecked")
  public E[] toArray(E[] arr) { //E타입의 배열 받아 리턴
    if(arr.length < this.size) {
      //파라미터로 받은 배열이 작을 때는 새 배열을 만들어 리턴
      return(E[])Arrays.copyOf(this.elementData, this.size, arr.getClass());
    }
    //넉넉할 때는 파라미터로 받은 배열 그대로 리턴
    System.arraycopy(this.elementData,0,arr,0,this.size); 
    return arr;
  }
}


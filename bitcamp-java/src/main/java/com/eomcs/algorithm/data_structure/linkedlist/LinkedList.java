package com.eomcs.util;

import java.lang.reflect.Array;

public class LinkedList<E> {

  Node<E> first;

  Node<E> last;

  int size;

  public void add(E value) {
    Node<E> newNode = new Node<E>();
    newNode.value = value;

    if (first == null) {
      last = first = newNode;
    } else {
      last.next = newNode;
      last = newNode;
    }

    this.size++;
  }

  public E get(int index) {
    if (index < 0 || index >= size)
      return null;

    Node<E> cursor = first;
    for (int i = 0; i < index; i++) {
      cursor = cursor.next;
    }

    return cursor.value;
  }

  public void add(int index, E value) {
    if (index < 0 || index >= size)
      return;

    Node<E> newNode = new Node<E>();
    newNode.value = value;

    Node<E> cursor = first;
    for (int i = 0; i < index - 1; i++) {//지정된 위치에 삽입하려면 삽입하려는 위치 바로 전까지 
      cursor = cursor.next;
    }

    if (index == 0) {
      newNode.next = first;
      first = newNode;
    } else {
      newNode.next = cursor.next;
      cursor.next = newNode;
    }

    this.size++;    //add했으니 size증가
  }
  public E remove(int index) {

    if (index < 0 || index >= size) //인덱스 유효성검사
      return null;

    Node<E> cursor = first;
    for (int i = 0; i < index - 1; i++) {//지정된 위치에 삽입하려면 삽입하려는 위치 바로 전까지 
      cursor = cursor.next;
    }
    Node<E> deletedNode=null;
    if(index==0) {
      deletedNode = first;
      first=deletedNode.next;
    }else {
      deletedNode = cursor.next;
      cursor.next =deletedNode.next;
    }

    deletedNode.next=null;
    size--;

    return deletedNode.value;  //삭제된 노드의 값을 쓰기위한 리턴
  }

  public E set(int index,E value) {
    if (index < 0 || index >= size)
      return null;

    Node<E> cursor = first;
    for (int i = 0; i < index; i++) {
      cursor = cursor.next;
    }

    E oldValue =cursor.value;
    cursor.value = value;

    return oldValue;
  }
  @SuppressWarnings("unchecked")
  public E[] toArray(E[] arr) {
//    Object[] arr=new Object[size];

    if(arr.length<size) {
      arr=(E[])Array.newInstance(arr.getClass().getComponentType(), size); 
      //파라미터로 받은 배열이 작으면 파라미터로 받은 배열이 아니라 새 배열을 만들어야함
    }
    
    Node<E> cursor = first;

    for (int i = 0; i < size; i++) {
      arr[i]=cursor.value;  
      cursor = cursor.next;
    }
    return arr;
  }
  public int size() {
    return this.size;
  }

  static class Node<T> {
    T value;
    Node<T> next;
  }
}  

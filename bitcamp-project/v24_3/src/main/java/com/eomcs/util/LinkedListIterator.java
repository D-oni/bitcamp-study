package com.eomcs.util;

public class LinkedListIterator<E> implements Iterator<E> {
  LinkedList<E> list;
  int cursor;
  
  public LinkedListIterator(LinkedList<E> list) {
    this.list = list;
  }

  @Override
  public boolean hasNext() {
    return cursor < list.size();
  }

  @Override
  public E next() {
    return list.get(cursor++);
  }

}

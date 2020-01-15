package com.eomcs.util;

public class LinkedListTest {

  public static void main(String[] args) {
    LinkedList<String> list = new LinkedList<>();
//제네릭을 적용하면 특정 제약을 가할 수 있다.
    list.add("aaaa");
    list.add("bbbb");
    list.add("cccc");
    list.add("dddd");
    list.add("eeee");
    list.add("ffff");
    list.add("gggg");
    
    
    System.out.println(list.set(5, "xxx"));
    System.out.println();
    print(list);
    
  }
  static void print(LinkedList<String> list) {
//    String[] arr = list.toArray(new String[0]);
    //빈 배열을 넘기면 알아서 만들어줌
    
    String[] arr = new String[list.size()];
    list.toArray(arr);  
    
    for(String value : arr) {
      System.out.println(value);
    }
  }

}

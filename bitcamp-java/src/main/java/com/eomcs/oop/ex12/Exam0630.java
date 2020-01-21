// 메서드 레퍼런스 - 생성자 레퍼런스
package com.eomcs.oop.ex12;

import java.awt.List;

public class Exam0630 {

  static interface ListFactory {
    List create();
  }

  public static void main(String[] args) {

      //생성자 레퍼런스를 지정하는 것은
      //다음과같이 익명 클래스를 만드는 것과 같다
//      ListFactory f1 = ArrayList::new;

      ListFactory f1 = new ListFactory() {
        public List create() {
        return new ArrayList();

        };
      //인터페이스의 메서드를 호출하면 결국 지정 된 클래스의 인스턴스를 만든 후 생성자를 호출한다.
      List list = f1.create();  //new ArrayList();

      System.out.println(list instanceof ArrayList);
          System.out.println(list.getClass().getName());

  }
}


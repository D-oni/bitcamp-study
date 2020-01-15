
package com.eomcs.oop.ex08.test;

import com.sun.java.util.jar.pack.Package.Class.Member;

public class J3  {

  public static void main(String[] args) {
    public void m1() {
      Student s = new Student();
      Teacher t = new Teacher();
      Member m = new Member(); 
    }
    //추상클래스는 인스턴스를 생성할 수 없다.
    //즉 추상 클래스는 직접 사용할 수 없다.
    //단지 서브클래스에게 공통 분모를 물려주는 일을 할 뿐이다

    //보통 Generalization을 통해 정의한 수퍼 클래스는
    //직접 사용 할 일이 없기 때문에 추상 클래스로 정의하여
    //직접 사용하지 않게 만든다.

    abstract class Member {
      String email;
      String pwd;
      String name;
      String tel;
      int grade;
      boolean working;
    

      abstract void print() {
        //추상메서드는 구현된 게 아니기 때문에 호출 할 수 없다.
        //그래서 인스턴스를 생성할 수 있는 일반 클래스는 추상 메서드를 가질 수 없다.
        //오직 추상 클래스(또는 인터페이스) 만이 추상 메서드를 가질 수 있다.
        //추상 메서드의 의미는 서브 클래스에게 구현을 미루는 것이다.
        //그것도 구현을 강제 시키는 문법이다.
        System.out.println("회원 정보");
      }
//수퍼클래스의 추상 메서드를 구현하지 않으면 추상 클래스가 되어야 한다.
      abstract class Student extends Member{
 
      int grade;
      boolean working;
      }
      //수퍼클래스의 모든 추상 메서드를 구현해야만 일반 클래스(concrete class)가 될 수 있다.
      //=>즉 메서드의 구현을 강제시킬 수 있다.
    class Teacher extends Member{
      int pay;

      String major;

      void print() {
        System.out.println("강사 정보");
      }
    }

  }
}




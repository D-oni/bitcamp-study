// final 사용법 : 상속불가
package com.eomcs.oop.ex06.e;

// 클래스에 final을 붙이면 이 클래스의 서브클래스를 만들 수 없다.
public final class Exam0220 {
  public void m1() {
    // 로컬변수에 final을 붙이면 값을 변경할 수 없는 상수로 사용된다.
    final int a = 100;

    // final 로컬변수는 값을 변경 할 수 없다.
    // a=200; //컴파일오류

    // 변수를 선언할 때 값을 초기화 시키지 않고
    final int b;
    // 다음에 초기화 시킬 수 있다
    b = 100;

    // 일단 한번 변수의 값이 초기화 되면 변경할 수 없다.
    b = 200; // 컴파일오류

  }
}


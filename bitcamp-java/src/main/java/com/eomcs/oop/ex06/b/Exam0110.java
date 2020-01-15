// 메서드 오버로딩(overloading) - 문법 사용전
package com.eomcs.oop.ex06.b;

public class Exam0110 {
  //만약 같은 이름의 메서드를 여러개 만들 수 없다면,
  //다음과 같이 같은 일(두 수를 더하는 일)을 수행하는 메서드라도 
  //이름을 다르게 해야한다.

  static class Calculator {
    static int plusi(int a, int b) {
      return a + b;
    }
    static int plusi2(int a) {
      return a + a;
    }

    static float plusf(float a, float b) {
      return a + b;
    }
  }
  public static void main(String[] args) {

    //두개의 정수를 더할 때는 plusi()를 호출해야한다.
    int r1 = Calculator.plusi(100, 200);
    //한개의 정수를 두번 더할 때는 plusi2()를 호출해야한다
    int r2 = Calculator.plusi2(100);
    //두개의 부동소수점을 더할 때는 plusf()를 호출해야한다
    float r3= Calculator.plusf(35.7f, 22.2f);
    
    System.out.printf("%d,%d,%1f\n",r1,r2,r3);
    //같은 더하기 일을 하더라도 더하는 값을 타입에따라
    //메서드 이름일 다르다면 , 메서드를 사용하기가 번거롭다.
    //이것이 오버로딩 문법이 등장한 이유이다.
        
  }
}

// 오버로딩(overloading)
// => 파라미터 타입이나 개수, 순서는 다르지만 이름이 같은 메서드를 여러 개 만들 수 있는 문법
//
// 왜 이런 문법이 등장했는가?
// => 파라미터의 형식은 다르지만 같은 기능을 수행하는 메서드에 대해 
//    같은 이름을 부여함으로써 프로그래밍의 일관성을 제공하기 위함.  






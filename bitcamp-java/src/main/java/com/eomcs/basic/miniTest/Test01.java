// 과제 1 : 계산기 애플리케이션을 작성하라.
// - 실행
// 값1? 10
// 값2? 20
// 연산자(+,-,*,/)? +
// => 10 + 20 = 30 
//
package com.eomcs.basic.miniTest;
import java.util.Scanner;

public class Test01 {
  public static void main(String[] args) {
    
    Scanner calc=new Scanner(System.in);
    System.out.println("값1?");
    int i=calc.nextInt();
    System.out.println("값2?");
    int j=calc.nextInt();
    System.out.println("연산자(+,-,*,/)?");
    String z=calc.next();
    int result=0;

    if(z.equals("+")) {
      result=i+j;
    }else if(z.equals("-")) {
      result=i-j;
    }else if(z.equals("*")) {
      result=i*j;
    }else if(z.equals("/")){
      result=i/j;
    }else {
      System.out.println("사용할 수 없는 연산자 입니다.");
      return; //더이상 실행하지않고 끝냄
    }
  
    System.out.println(i+z+j+"="+result);

  }
}

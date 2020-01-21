package com.bitcamp.myproject;

import java.util.Scanner;

public class Test02_2 {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);


    int min=Integer.MAX_VALUE;
    int max=Integer.MIN_VALUE;

    System.out.println("숫자 5개를 입력하세요:");
    while(true){
    
      int num = scan.nextInt();
      if(num==0)    //입력값으로 0을 사용할 수 없는 문제가 있다.
        break;

    min = num < min ? num : min;
    max = num > max ? num : min;
    }

    System.out.println("최대값:" + max);

    System.out.println("최소값:" + min);

    scan.close();
  }
}

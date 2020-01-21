package com.bitcamp.myproject;

import java.util.Scanner;

public class Test02_1 {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);


    int min=Integer.MAX_VALUE;
    int max=Integer.MIN_VALUE;

    System.out.println("숫자 5개를 입력하세요:");
    for(int i = 0; i < 5; i++){

      int num = scan.nextInt(); 
      scan.nextLine();
      if(i==0) {
        max = num;
        min =  num;
      }else {
        if(num > max){

          max = num;

        }

        else if(num < min){

          min = num;

        }
      }

    }

    System.out.println("최대값:" + max);

    System.out.println("최소값:" + min);

    scan.close();
  }
}

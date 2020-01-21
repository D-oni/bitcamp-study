package com.bitcamp.myproject;

import java.util.Scanner;

public class Test02 {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    System.out.println("숫자 5개를 입력하세요:");

    int[] num = new int[5];



    for(int i = 0; i < num.length; i++){

      num[i] = scan.nextInt(); 
      scan.nextLine();
      
    }

    // 0번째 배열의 값으로 초기화

    int max = num[0];

    int min =  num[0];

    for(int i = 1; i < num.length; i++){    


      if(num[i] > max){

        max = num[i];

      }

      else if(num[i] < min){

        min = num[i];

      }

    }

    System.out.println("최대값:" + max);

    System.out.println("최소값:" + min);

    scan.close();
  }
}

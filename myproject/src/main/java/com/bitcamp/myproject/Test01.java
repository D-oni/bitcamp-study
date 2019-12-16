package com.bitcamp.myproject;

import java.util.Scanner;

public class Test01 {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    
    System.out.println("첫번째 숫자를 입력하세요:");
    int num1=scan.nextInt();
    System.out.println("두번째 숫자를 입력하세요:");
    int num2=scan.nextInt();
    int sum=0;
  
    
     for(int i=num1;i<=num2;i++) {
       sum+=i;
   
   
    }System.out.println(sum);
      
    


  }
}

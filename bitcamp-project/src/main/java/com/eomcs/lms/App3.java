package com.eomcs.lms;

import java.util.Scanner;

public class App3 {
  public static void main (String[] args)  {
    
    Scanner keyboard = new Scanner(System.in);
    
    System.out.println("번호:"); 
    String num = keyboard.nextLine(); 

    
    System.out.println("내용:"); 
    String text = keyboard.nextLine(); 

    
    System.out.println("작성일:"); 
    String day = keyboard.nextLine(); 

    
    System.out.println("조회수:"); 
    String total = keyboard.nextLine(); 
    

    System.out.printf("번호:%s\n",num);
    System.out.printf("내용:%s\n",text);
    System.out.printf("작성일:%s\n",day);
    System.out.printf("조회수:%s\n",total);
    
    keyboard.close();
  }

}

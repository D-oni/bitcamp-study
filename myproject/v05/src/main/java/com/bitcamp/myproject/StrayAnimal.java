
package com.bitcamp.myproject;

import java.util.Scanner;

public class StrayAnimal {
  public static void main(String[] args) {
 
    Scanner keyboard = new Scanner(System.in);
    
    String[] name = new String[100];
    String[] text = new String[100];
    String[] choose =new String[100];
    String[] num = new String[100];
    String response;
    
    int count = 0;
    
    for(int i=0; i<3; i++) {
      System.out.println("이름: ");  
      name[i]=keyboard.nextLine();
      keyboard.nextLine();
      
      System.out.println("설명: ");  
      text[i]=keyboard.nextLine();
      keyboard.nextLine();
      

      System.out.println("1.유기동물 입양  2.유기동물 보호  3.반려동물 찾기 : ");  
      choose[i]=keyboard.nextLine();
      keyboard.nextLine();

      System.out.println("동물등록번호여부: ");  
      num[i]=keyboard.nextLine();
      
      date[i] = new Date(System.currentTimeMillis());
      viewCount[i] = 0;
      
      count++;
      
      System.out.println();

      System.out.print("계속 입력하시겠습니까?(Y/n) ");
      response = keyboard.nextLine();
      if (!response.equalsIgnoreCase("y")) {
        break;
      }
    }

      keyboard.close();

      System.out.println();

      for (int i = 0; i < count; i++) {
        System.out.printf("%s, %s, %s, %s, %s, %d\n", 
            name[i], text[i], choose[i], num[i], date[i], viewCount[i]);
      }
    }
  }
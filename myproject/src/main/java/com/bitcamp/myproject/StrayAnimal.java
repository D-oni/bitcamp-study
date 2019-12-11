
package com.bitcamp.myproject;

import java.util.Scanner;

public class StrayAnimal {
  public static void main(String[] args) {
 
    Scanner keyboard = new Scanner(System.in);
    
    System.out.println("이름: ");
    String name=keyboard.nextLine();
    
    System.out.println("설명: ");
    String text=keyboard.nextLine();
    
    System.out.println("1.유기동물 입양  2.유기동물 보호  3.반려동물 찾기 : ");
    String choose=keyboard.nextLine();
    
    System.out.println("동물등록번호여부: ");
    String num=keyboard.nextLine();
 
    System.out.println();
    System.out.println("<동물 보호 관리 시스템>");
    System.out.printf("이름:%s\n",name);
    System.out.printf("설명:%s\n",text);
    System.out.printf("1.유기동물 입양  2.유기동물 보호  3.반려동물 찾기 :%s\n",choose);
    System.out.printf("동물등록번호여부:%s\n",num);
    
    keyboard.close();
  } 
}

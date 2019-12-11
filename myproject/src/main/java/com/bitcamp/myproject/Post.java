
package com.bitcamp.myproject;

import java.util.Scanner;

public class Post {
  public static void main(String[] args) {
 
    Scanner keyboard = new Scanner(System.in);
    
    System.out.println("번호: ");
    String num=keyboard.nextLine();

    System.out.println("내용: ");
    String text=keyboard.nextLine();
    
    System.out.println("작성일: ");
    String date=keyboard.nextLine();
    
    System.out.println("조회수: ");
    String search=keyboard.nextLine();
    
    System.out.println("스크랩수: ");
    String scrap=keyboard.nextLine();
 
    System.out.println();
    System.out.println("<게시글>");
    System.out.printf("번호:%s\n",num);
    System.out.printf("내용:%s\n",text);
    System.out.printf("작성일:%s\n",date);
    System.out.printf("조회수:%s\n",search);
    System.out.printf("스크랩수:%s\n",scrap);
    
    
    
    keyboard.close();
  } 
}

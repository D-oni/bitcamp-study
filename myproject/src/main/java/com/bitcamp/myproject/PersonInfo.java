package com.bitcamp.myproject;

import java.sql.Date;
import java.util.Scanner;

public class PersonInfo {

  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);

    
 

    System.out.println("이름: ");
    String name=keyboard.nextLine();

    System.out.println("동물등록번호 : ");
    String num=keyboard.nextLine();

    System.out.println("이메일: ");
    String mail=keyboard.nextLine();

    System.out.println("주소 : ");
    String add=keyboard.nextLine();

    System.out.println("사진 : ");
    String photo=keyboard.nextLine();

    System.out.println("전화번호 : ");
    String phone=keyboard.nextLine();
    
    Date registeredDate = new Date(System.currentTimeMillis()); //가입일

    System.out.println();
    System.out.println("<반려동물 정보>");
    System.out.printf("나이:%s\n",name);
    System.out.printf("동물등록번호:%s\n",num);
    System.out.printf("이메일 :%s\n",mail);
    System.out.printf("주소 :%s\n",add);
    System.out.printf("사진 :%s\n",photo);
    System.out.printf("전화번호:%s\n",phone);
    System.out.printf("가입일: %s\n", registeredDate);

    keyboard.close();
  }
}

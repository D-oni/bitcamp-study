package com.eomcs.lms;
import java.util.Scanner;

public class App2 {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    
     System.out.println("번호:"); 
     String num = keyboard.nextLine(); 

    
    System.out.println("이름:");
    String name = keyboard.nextLine(); 
    
    System.out.println("이메일: ");
    String mail = keyboard.nextLine(); 
    
    System.out.println("암호: ");
    String password = keyboard.nextLine(); 
    
    System.out.println("사진: ");
    String photo = keyboard.nextLine(); 
    
    System.out.println("전화: ");
    String phonenum = keyboard.nextLine(); 
    
    System.out.println("가입일: ");
    String day = keyboard.nextLine(); 
    
    System.out.printf("번호:%s\n",num);
    System.out.printf("이름:%s\n",name);
    System.out.printf("이메일:%s\n",mail);
    System.out.printf("암호::%s\n",password);
    System.out.printf("사진::%s\n",photo);
    System.out.printf("전화:%s\n",phonenum);
    System.out.printf("가입일:%s\n",day);
    
    keyboard.close();

  }

}

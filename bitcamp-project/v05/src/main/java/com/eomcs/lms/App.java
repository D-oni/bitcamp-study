
package com.eomcs.lms;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

      //번호? 1
      //수업명? 자바 프로젝트 실습
      //수업내용? 자바 프로젝트를 통한 자바 언어 활용법 익히기
      //시작일? 2019-01-02
      //종료일? 2019-05-28
      //총수업시간? 1000
      //일수업시간? 8
      Scanner keyboard = new Scanner(System.in);
      
      System.out.println("번호 : ");
      String no=keyboard.nextLine();


      System.out.println("수업명 : ");
      String study=keyboard.nextLine();

      
      System.out.println("설명 :");
      String text = keyboard.nextLine();


      System.out.println("시작일 : ");
      String start=keyboard.nextLine();

      System.out.println("종료일 : ");
      String end=keyboard.nextLine();

      System.out.println("총수업시간은 : ");
      String totalstudy=keyboard.nextLine();

      System.out.println("일수업시간은 : ");
      String daystudy=keyboard.nextLine();

     /*  
     System.out.println("번호:"+no);
     System.out.println("수업명 : "+study);
     System.out.println("설명 :"+text);
     System.out.println("기간 : "+start+"~"+end);
     System.out.println("총수업시간은 :"+totalstudy);
     System.out.println("일수업시간은:"+daystudy);
     */
     System.out.printf("번호:%s\n",no);
     System.out.printf("수업명 :%s\n",study);
     System.out.printf("설명:%s\n",text);
     System.out.printf("기간 :%s~%s\n",start,end);
     System.out.printf("총수업시간은 :%s시간\n",totalstudy);
     System.out.printf("일수업시간은:%s시간\n",daystudy);
    

    keyboard.close();
    }
}

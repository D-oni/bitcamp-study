package com.eomcs.lms;

import java.sql.Date;
import java.util.Scanner;

public class App4 {

  static Scanner keyboard = new Scanner(System.in);

  // 강의 정보를 담을 메모리의 설계도를 만든다.
  // 클래스?
  // - 애플리케이션에서 다룰 특정 데이터(수업정보, 학생정보, 게시물, 제품정보 등)의 
  //   메모리 구조를 설계하는 문법이다.
  // - 이렇게 개발자가 새롭게 정의한 데이터 타입을 
  //   "사용자 정의 데이터 타입"이라 부른다.
  // - 즉 '클래스'는 '사용자 정의 데이터 타입'을 만들 때 사용하는 문법이다.
  //
 static class Lesson {
    int no;
    String title;
    String description;
    Date startDate;
    Date endDate;
    int totalHours;
    int dayHours;
  }

 static final int Lesson_SIZE = 100;
 static Lesson[] lessons = new Lesson[Lesson_SIZE];
 static int Lesson_count = 0;

 static  class Member {
    int no;
    String name;
    String email;
    String password;
    String photo;
    String tel;
    Date registeredDate;
  }

 static final int Member_SIZE = 100;
 static Member[] members = new Member[Member_SIZE];
 static int Member_count = 0;

 static class Board {
    int no;
    String title;
    Date date;
    int viewCount;
  }

 static final int Board_SIZE = 100;
 static Board[] boards = new Board[Board_SIZE];
 static int Board_count = 0;

 
  public static void main(String[] args) {

     String command;
    do {
      System.out.println("입력> ");
      command=keyboard.nextLine();

      switch(command) {
        case "/lesson/add":
         addLesson();
          break;
        case "/lesson/list":
         listLesson();
        case"/member/add":
          addMember();
          break;
        case "/member/list":
          listMember();
        case "/board/add":
          addBoard();
          break;
        case "/board/list":
         listBoard();
            break;
            
           default:
              if (!command.equalsIgnoreCase("quit")) {
                System.out.println("실행할 수 없는 명령입니다.");
                
                System.out.println();
          }


      }

    }while(!command.equalsIgnoreCase("quit")); {
      System.out.println("종료!");
      keyboard.close();
    }







  }
  


  private static void listBoard() {
    for (int i = 0; i < Board_count; i++) {
      Board b = boards[i];
      System.out.printf("%d, %s, %s, %d\n", 
          b.no, b.title, b.date, b.viewCount);
    }    
  }



  private static void addBoard() {
    Board board = new Board();

    System.out.print("번호? ");
    board.no = keyboard.nextInt();
    keyboard.nextLine(); // 줄바꿈 기호 제거용

    System.out.print("내용? ");
    board.title = keyboard.nextLine();

    board.date = new Date(System.currentTimeMillis());
    board.viewCount = 0;

    // 게시물 데이터가 보관된 Board 인스턴스의 주소를 레퍼런스 배열에 저장한다.
    boards[Board_count++] = board;


    
  }



  private static void listMember() {
    
      for (int i = 0; i < Member_count; i++) {
        Member m = members[i];
        System.out.printf("%d, %s, %s, %s, %s\n", 
            m.no, m.name, m.email, 
            m.tel, m.registeredDate);
      }
    }    

  private static void addMember() {
    Member member = new Member();

    System.out.print("번호? ");
    member.no = keyboard.nextInt();
    keyboard.nextLine(); // 줄바꿈 기호 제거용

    System.out.print("이름? ");
    member.name = keyboard.nextLine();

    System.out.print("이메일? ");
    member.email = keyboard.nextLine();

    System.out.print("암호? ");
    member.password = keyboard.nextLine();

    System.out.print("사진? ");
    member.photo = keyboard.nextLine();

    System.out.print("전화? ");
    member.tel = keyboard.nextLine();

    member.registeredDate = new Date(System.currentTimeMillis());

    // 회원 정보가 담겨있는 인스턴스의 주소를 레퍼런스 배열에 보관한다.
    members[Member_count++] = member;
    
  }

  static void addLesson() {
    Lesson lesson = new Lesson();

    System.out.print("번호? ");
    lesson.no = keyboard.nextInt();

    keyboard.nextLine(); // nextInt() 후에 남아 있는 줄바꿈 기호를 제거한다.

    System.out.print("수업명? ");
    lesson.title = keyboard.nextLine();

    System.out.print("설명? ");
    lesson.description = keyboard.nextLine();

    System.out.print("시작일? ");
    // "yyyy-MM-dd" 형태로 입력된 문자열을 날짜 정보로 바꾼다.
    lesson.startDate = Date.valueOf(keyboard.next());

    System.out.print("종료일? ");
    lesson.endDate = Date.valueOf(keyboard.next());

    System.out.print("총수업시간? ");
    lesson.totalHours = keyboard.nextInt();

    System.out.print("일수업시간? ");
    lesson.dayHours = keyboard.nextInt();
    keyboard.nextLine(); // 일수업시간 입력 값 다음에 남아 있는 줄바꿈 값 제거

    // 수업 정보를 담고 있는 인스턴스의 주소를 나중에 사용할 수 있도록 
    // 레퍼런스 배열에 보관해 둔다.
    lessons[Lesson_count++] = lesson;

  }
  static void listLesson() {
    for (int i = 0; i < Lesson_count; i++) {
      Lesson l = lessons[i];
      System.out.printf("%d, %s, %s ~ %s, %d\n",
          l.no, l.title, 
          l.startDate, l.endDate, 
          l.totalHours);
    }
  

    
  }
}







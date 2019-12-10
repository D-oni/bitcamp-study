package com.eomcs.basic.ex03;


//이스케이프 문자(escape character)
//

public class Exam7 {
  public static void main(String[] args) {
    //이스케이프 문자
    //- 문자를 제어하는 기능을 가진 문자.
    //문법
    //  \ [ n | r | f | t | b|  " | ' | \]
    System.out.println("Hello, World!");
    System.out.println("Hello, \nWorld!"); //줄바꿈문자
    System.out.println("Hello, \rabc"); //커서(cursor)를 처음으로 돌리는 문자=>\r =return
    //커서란? 문자를 출력할 위치를 가리키는 것
    System.out.println("Hello, \b\b\bWorld!"); //커서를 뒤로 한칸 이동시키는 문자
    System.out.println("Hello, \tWorld!"); //탭 공간을 추가시키는 문
    System.out.println("Hello, \fWorld!"); //formfeed 추가시키는
    System.out.println("Hello, \"W\"orld!"); //"문자를 추가시키는
    System.out.println("Hello, 'W'orld!"); //""안에서 '문자는 그냥
    System.out.println('\''); //''안에서 ' 문자를 출력시키는
    System.out.println('"');
    System.out.println("c:\\Users\\user\\git");
  }


}
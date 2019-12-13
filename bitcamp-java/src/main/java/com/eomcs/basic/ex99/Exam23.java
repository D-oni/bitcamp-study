package com.eomcs.basic.ex99;

public class Exam23 {
  public static void main(String[] args) {
    java.util.Scanner scanner = new java.util.Scanner(System.in);
    //정수와 문자열 한 줄을 입력받기
    System.out.print("입력:");
    int i1 =scanner.nextInt();
    int i2 =scanner.nextInt();
    String s =scanner.nextLine();

    //키보드로부터 들어온 바이트배열을 분석하여
    //줄 바꿈 기호를 만나면 그 얖에 입력한 바이트 배열을
    //문자열로 변환하여 리턴한다.
    //키보드로부터 줄바꿈 값이 들어오지 않으면 영원히 리턴하지않는다
    
    System.out.println("-------------------------------");
    System.out.println(i1);
    System.out.println(i2);
    System.out.println(s);

  }
}
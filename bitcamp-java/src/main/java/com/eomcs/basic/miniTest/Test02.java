// 과제 1 : 가위,바위,보 게임 애플리케이션을 작성하라.
// - 실행1
// 가위,바위,보? 보
// 컴퓨터: 가위  (랜덤 값이 출력된다. 힌트: Math.random())
// => 졌습니다.
//
// - 실행2
// 가위,바위,보? 바위
// 컴퓨터: 가위
// => 이겼습니다.
//
package com.eomcs.basic.miniTest;
import java.util.Scanner;

public class Test02 {
  public static void main(String[] args) {
  //  java.io.InputStream keyboard = System.in;
  //  java.util.Scanner keyScan = new java.util.Scanner(keyboard);
    
    Scanner keyScan = new Scanner(System.in);

    System.out.print("1.가위 2.바위 3.보:");
   //System.out.println("나: "+keyScan.nextInt());
 
    String rsp = keyScan.nextLine();

    
    double i=Math.random();
    //i*3


    if(i*100>8) {
      
         if(rsp.equals("2")) {
           System.out.println("졌습니다.");
         }else if(rsp.equals("1")) {
           System.out.println("이겼습니다.");
         }else {
           System.out.println("비겼습니다.");
         }
      System.out.println("컴퓨터: 보");
      
    }else if(i*100<3) {
      
        if(rsp.equals("1")) {
          System.out.println("졌습니다.");
        }else if(rsp.equals("3")) {
          System.out.println("이겼습니다.");
        }else {
          System.out.println("비겼습니다.");
        }
      System.out.println("컴퓨터: 바위");
    }else {
      
        if(rsp.equals("3")) {
          System.out.println("졌습니다.");
        }else if(rsp.equals("2")) {
          System.out.println("이겼습니다.");
        }else {
          System.out.println("비겼습니다.");
        }
      System.out.println("컴퓨터: 가위");
      }
    keyScan.close();
//System.out.println() ;

  }
}

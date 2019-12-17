package com.eomcs.basic.ex04;

//상수
public class Exam71 {
  
//인스턴스 필드(변수)
  //=>new명령을 실행할 때 준비되는 변수
  int instanceVar;  
  //클래스 필드(변수) = 스태틱 필드(변수)
  //=>클래스가 로딩 될 때 준비되는 변수
  static int classVar;  
  public static void main(String[] args/*로컬 변수(파라미터)*/) {
    //로컬변수
    //=>메서드를 실행할 때 준비되는 변수
    //=>메서드 블록안에 선언 된 변수
    //=>메서드 블록을 벗어나서 사용할 수 없다.  

    int local;  //로컬변수
    int local2;
    //같은 static 멤버는 사용할 수 있다. 

  }
  //클래스 메서드 = 스태틱 메서드
  static void m1() {
    //메서드 블록이 다르면 변수도 다르다.
    //그래서 같은 이름의 변수를 선언 할 수 있다.
    int local;  
    //다른 메소드 블록에 있는 변수를 사용할 수 없다.
    //local2=100; //컴파일오류
    classVar =200;  //static 멤버 사용가능
    //instanceVar =200;   //ok!static이 안붙은 변수 사용가능
    

  }
  //인스턴스메서드
  static void m2() {
    //메서드 블록이 다르면 변수도 다르다.
    //그래서 같은 이름의 변수를 선언 할 수 있다.
    int local;  
    //다른 메소드 블록에 있는 변수르르 사용할 수 없다.
    //local2=100; //컴파일오류
    classVar =200;  //static 멤버 사용가능
    //instanceVar =200;   //ok!static이 안붙은 변수 사용가능
}
}
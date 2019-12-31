package com.eomcs.oop.ex03.test;

import com.eomcs.oop.ex03.test.sub.A;

class Score {
  static int count;
  String name;
  int kor;
  int eng;
  int math;
  int sum;
  float aver;

  Score(String name,int kor,int eng,int math) { 
    System.out.println("Score()-2");
    this.name = name;
    this.kor=kor;
    this.eng=eng;
    this.math=math;
    this.compute(); 
    Score.increase();
  }
  static void increase() { //인스턴스 변수를 쓰지않는 메소드라서 static을 붙임
    Score.count++;
    Score.increase();
  }

  void compute() { //이 메소드 안에서 인스턴스 변수를 사용하지 않는 메소드는 static을 써야한다
    this.sum = this.kor+this.eng+this.math;
    this.aver = this.sum/3f;
  }
}
public class Test01 {

  public static void main(String[] args) {
    Score s1=new Score("홍길동",100,90,80);   //디폴트생성자
    System.out.println("-------------------------");

    //    Score.count=1; 
//    s1.name="홍길동"; //static변수는 클래스 이름으로 접근
//    s1.kor=100;
//    s1.eng=90;
//    s1.math=80;
    
//    s1.compute();
//    Score.increase();


    Score s2=new Score("임꺽정",90,80,70);

    //    s2.count=2;
//    s2.name="임꺽정";
//    s2.kor=90;
//    s2.eng=80;
//    s2.math=70;
//    s2.compute();
//    Score.increase();






  }
}

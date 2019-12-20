package com.eomcs.basic.ex07.test;


//gym 회원 정보를 입력받아 출력
public class Test12 {
  public static void main(String[] args) {

    class Member{


      int no;
      String name;
      int birthYear;
      char gender;
      float height;
      float weight;
      boolean personalTraining;
    }


    //인스턴스를 3000개 만들것이다
    //래퍼런스를 3000개 준비하라

    //다음과같이 일반적인 방식으로 래퍼런스를 선언하면
    //너무 길어져서 코딩 할 수없다.
    //  Member m0,m1,m2,m3,m4,m5,m6,m7,m8,m9,m10,m11,m12,m13,m14,m15,m16,m17,m18,m19,m20;
    //이런 상황에서 배열을 사용하면 쉽게 해결 할 수 있다.
    //즉 배열을 이용하면ㅁ 많은 래퍼런스변수를 손쉽게 만들 수있다.

    //래퍼런스 배열의 주소도 또한 래퍼런스 변수에 담아야한다.

    Member[] arr =new Member[3000];
    //주의!
    //=>Member 인스턴스 주소를 담을 레퍼런스 변수를 3000개 만든다
    //=>Member 인스턴스를 3000개 만드는 것이 아니다!!!!!!!!!
    //arr[0]no =100;        //런타임오류

    new Member[3000];
    int count =0;
    while(count < 3000) {
      arr[count]=new Member();
      count++;
    }
  }
}
// Object 클래스의 메서드를 오버라이딩 하기 - hashCode()
package com.eomcs.oop.ex06.d;

public class Exam0220 {

  static class Score {
    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float aver;

    public Score(String name, int kor, int eng, int math) {
      this.name = name;
      this.kor = kor;
      this.eng = eng;
      this.math = math;
      this.sum = kor + eng + math;
      this.aver = this.sum / 3f;
    }
    //hashCode()를 오버라이딩 하면 원하는 값을 리턴할 수 있다.

    // 인스턴스가 다르더라도 값이 같으면 같은 해시 값을 리턴하도록 오버라이딩 해보자!
    @Override
    public int hashCode() {
      //무조건 모든 Score인스턴스가 같은 해시코드를 갖게 하자
      return 1000;
    }
  }

  public static void main(String[] args) {
    Score s1 = new Score("홍길동", 100, 100, 100);
    Score s2 = new Score("홍길동", 100, 100, 100);
    Score s3 = new Score("임꺽정", 90, 80, 70);

    // 같은 값을 가질 때 같은 해시값을 리턴하도록 
    // hashCode()를 오버라이딩 했기 때문에
    // 다음 출력은 같은 해시 값을 출력할 것이다.
    System.out.printf("%d, %d, %d\n", s1.hashCode(), s2.hashCode(), s3.hashCode());

    //해시코드?
    //=>데이터를 식별 할 때 사용하는 고유 아이디이다.
    //=>보통 특별한 공식(ex:MD4,MD5,SHA-1,SHA-256 등)으로
    //  계산해서 나온 정수 값을 해시코드로 사용한다.
    //=>그래서 해시코드를 데이터를 구분하는 지문과 같다고해서
    //  '디지털 지문'이라고 부른다.
    //
    //hashCode()를 오버라이딩 할 때?
    //=>인스턴스(메모리)가 다르더라도 같은 데이터를 갖는 경우
    //  같은 것으로 취급 하기 위해 이 메소드를 재정의한다.
    //=>따라서 위의 예처럼 데이터가 같은 지 따지지도 않고
    //  모든 인스턴스에 대해 같은 해시코드를 리턴하는것은
    //  아무의미없다!
    //  이런식으로 오버라이딩 하는 것은 부질없는 짓이다!

  }
}







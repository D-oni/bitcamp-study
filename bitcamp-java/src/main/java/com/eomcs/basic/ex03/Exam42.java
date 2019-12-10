package com.eomcs.basic.ex03;

//문자 리터럴(literal)-문자코드를 이용하여 문자 출력
//

public class Exam42 {
  public static void main(String[] args) {
    //코드값을 안다면 직접 코드값을 사용하여 문자를 지정 할 수 있다.
    System.out.println(0x0041);
    System.out.println(0xac00);

    //=> 그냥 출력하면 정수를 표현 한 것으로 오해한다.
    //=> 숫자 앞에 문자 코드임을 알리는 표시를 하라.
    //(char)0x0041
    //JVM에게 정수가 아니라 문자코드라고 알려주는 것
    //JVM은 이 문자 코드에 해당하는 문자를 폰트파일에서 찾아 그 코드에 해당하는 문자 그림을 출력한다.
    System.out.println((char)0x0041); //앞에 00은 생략가능 => A 출력
    System.out.println((char)0xac00); //가 출력

    for(int i = 0; i < 11172; i++) {
      if(i % 80 ==0) 
      System.out.println();
      System.out.print((char)(0xac00 +i));
     
    }
    

  


    
  }
}
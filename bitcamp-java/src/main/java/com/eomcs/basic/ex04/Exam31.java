package com.eomcs.basic.ex04;

public class Exam31 {
  public static void main(String[] args) {
    //부동소수점 변수 - 메모리크기
    float f;

    f= 3.141592f; //뒤에 접미사를 붙이지 않으면 8바이트리터럴이 된다.
    System.out.println(f);

    f= 3.1415929f; 
    System.out.println(f);

    f= 0.0000003141592f;
    System.out.println(f);

    f= 0.00000031415929f; //소수점 이하인 경우 앞의 0 은 유효자릿수에 포함안함
    System.out.println(f);

    f= 314159200000.0f; //소수점 이상인 경우 뒤의 0을 포함해서 유효자리 숫자 계산
        System.out.println(f);


    double d;
    d=9.87654321234567;
    System.out.println(d);

    d=98765432.1234567;
    System.out.println(d);
    
    d=98765432123456.7;
    System.out.println(d);
   
    
    d=98765432123456.74;  //값이 왜곡된다
    System.out.println(d);

    //변수와 리터럴
    f=99999.88f;
    System.out.println(f);  //4바이트 리터럴을 7자리가 넘어가지않게
                            //8바이트 리터를은 15자리가 넘어가지않게
    
    f=99999.887777f;  //이미 리터럴이 4바이트 유효자릿수를 넘어갔다.
    System.out.println(f);

    d=99999.88f;
    System.out.println(d);

    d=99999.88;
    System.out.println(d);
    
    //4바이트 변수는 4바이트 리터럴을 사용
    //8바이트 변수는 8바이트 리터럴을 사용해야함

    float f1 =99988.88f;
    float f2=11.11111f;
    System.out.println(f1);
    System.out.println(f2);

    float f3=f1+f2;
    System.out.println(f3);//(x)
    //99988.88 
    //+  11/11111
    //----------------
    //99999.99111
    double r = f1+f2;
    System.out.println(r);//(x)

    double d1 =99988.88;
    double d2=11.11111;
    double d3 =d1+d2;
    System.out.println(d3); //고정된 부동소수점은 float, 부동소수점을 연산(ex.덧셈)을 하려면 double을 사용하는게 좋음

    f1=3.141592f;
    d1=f1;  //컴파일ok. 단 , 값은 왜곡 될 수 있다.
    System.out.println(d1);

    //f1=d1;  //컴파일오류.


  }
}
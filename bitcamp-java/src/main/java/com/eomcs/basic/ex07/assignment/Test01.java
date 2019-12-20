package com.eomcs.basic.ex07.assignment;

public class Test01 {
  public static void main(String[] args) {
    // 배열의 값 중에서 최대 값을 출력하라.
    int[] values = {34, 4, -3, 78, 12, 22, 45, 0, -22};
    int value = max(values);
    System.out.println(value);
    System.out.printf("%d,%d\n",values[i],values[i+1]);
    // 출력결과:
    // 78
  }

  static int max(int[] values) {
    // 파라미터로 배열을 받고, 그 값 중에서 최대 값을 찾아 리턴한다.
    for(int i=0;i<values.length;i++) {
      System.out.print(values[i]+",");
      if(values[i]<values[i+1]) {
        int temp=values[i];
        values[i]=values[i+1];
        values[i+1]=temp;
      }


      System.out.printf("%d,%d\n",values[i],values[i+1]);



    }

    return 0;
  }
}

package com.eomcs.basic.ex07.assignment;

public class Test022 {
  public static void main(String[] args) throws Exception {
    int[] values = {34, 4, -3, 78, 12, 22, 45, 0, -22};
//    int value=sort(values);
    sort(values);
    for(int value:values) {
      System.out.print(value+" ,");
    }
    System.out.println();
    


  }
  static void sort(int[] values) {
    int temp=0;
    for(int i=0; i<(values.length-1); i++) {
      if(values[i]>values[i+1]) {
        temp=values[i];
        values[i]=values[i+1];
        values[i+1]=temp;
        
      }
    }
  }
}

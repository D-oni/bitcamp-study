package com.eomcs.basic.ex07.assignment;


public class Test011 {
  public static void main(String[] args) {
    
  int values[]= {34, 4, -3, 78, 12, 22, 45, 0, -22};
  int value=max(values);
  System.out.println(value);
  
  }
  static int max(int values[]) {
    int maxValue =values[0];
    for(int i=1;i <values.length;i++) {
       if(values[i]>maxValue) {
         maxValue=values[i];
       }
    }
    return maxValue;
     
    
  }
}

package com.eomcs.basic.ex06x.assignment;

import java.util.Scanner;

public class Test02 {
  public static void main(String[] args) {
    Scanner keyScan = new Scanner(System.in);
    System.out.print("가로 길이? ");
    int len = keyScan.nextInt();
    String stars="";
    int i=0;
    

  
         while(i<len) {
           System.out.println(stars+="*");
           
           i++;
           break;
         
         }
         int j=len;
         do {
           System.out.println(stars+="*");
         
         i++;
           
         }
         while(i<=len*2-1);
           
         
    
       
      }



    }

  

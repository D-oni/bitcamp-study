package com.eomcs.basic.ex06x.assignment;

import java.util.Scanner;

public class Test01_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("밑변의 길이? ");
        int len = scan.nextInt();
      String stars="";
        
        int i=0;
        do {
         System.out.println(stars+="*");
        
        i++;
        }
        while(i<len) ;
            
        }

       
    }

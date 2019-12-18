package com.eomcs.basic.ex06x.assignment;

import java.util.Scanner;

public class Test02_1 {
  public static void main(String[] args) {
    Scanner keyScan = new Scanner(System.in);
    System.out.print("가로 길이? ");
    int len = keyScan.nextInt();
    int i = 1;
    
    while (i <= len) {
        int stars = 1;
        while (stars <= i) {
           Console.inputInt();
        System.out.println();
        i++;
    }
    }

    i = len - 1;
    while (i >= 1) {
        Console.inputInt();
        System.out.println();
        i--;
    }
}
}
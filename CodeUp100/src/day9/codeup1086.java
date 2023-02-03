package day9;

import java.util.Scanner;

public class codeup1086 {

    public static void main (String[] args) {
    	 Scanner scan = new Scanner(System.in);
         
    	 double w = scan.nextInt();
    	 double h = scan.nextInt();
    	 double b = scan.nextInt();
         
         double result = (w*h*b) / 8 / 1024 / 1024;
         System.out.printf("%.2f MB", result);
     }
 }
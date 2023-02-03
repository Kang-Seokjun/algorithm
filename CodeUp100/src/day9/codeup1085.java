package day9;

import java.util.Scanner;

public class codeup1085 {

    public static void main (String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        
        long h = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long s = sc.nextLong();

        double result = (h*b*c*s) / 8 / 1024 / 1024;
        System.out.printf("%.1f MB", result);
    }
}
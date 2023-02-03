package day5;

import java.util.Scanner;

public class codeup1045 {

    public static void main (String[] args) {
    	Scanner scan = new Scanner(System.in);
    	int a = scan.nextInt();
    	int b = scan.nextInt();
    	System.out.printf("%d\n%d\n%d\n%d\n%d\n%.2f",a+b,a-b,a*b,a/b,a%b,(double)a/(double)b);
    }
}
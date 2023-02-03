package day5;

import java.util.Scanner;

public class codeup1046 {

    public static void main (String[] args) {
    	Scanner scan = new Scanner(System.in);
    	int a = scan.nextInt();
    	int b = scan.nextInt();
    	int c = scan.nextInt();
    	
    	int sum = a+b+c;
    	double result = ((double)sum/3);
    	System.out.println(sum);
    	System.out.printf("%.1f",result);
    }
}
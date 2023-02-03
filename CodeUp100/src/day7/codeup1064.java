package day7;

import java.util.Scanner;

public class codeup1064 {

    public static void main (String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	int a = scanner.nextInt();
    	int b = scanner.nextInt();
    	int c = scanner.nextInt();
    	
    	System.out.printf("%d", (a<b ? a:b)>c ? c:(a<b ? a:b));
    }
}
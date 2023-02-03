package day6;

import java.util.Scanner;

public class codeup1058 {

    public static void main (String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	int a = scanner.nextInt();
    	int b = scanner.nextInt();
    	
    	if(a==0&&a==b) {
    		System.out.println("1");
    	}else {
    		System.out.println("0");
    	}
    }
}
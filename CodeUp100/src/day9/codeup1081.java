package day9;

import java.util.Scanner;

public class codeup1081 {

    public static void main (String[] args) {

    	Scanner scan = new Scanner(System.in);
    	int n1 = scan.nextInt();
    	int n2 = scan.nextInt();
    	
    	for(int i =1; i<=n1; i++) {
    		for(int j=1; j<=n2;j++) {
    			System.out.println(i+" "+j);
    		}
    	}

    }
}
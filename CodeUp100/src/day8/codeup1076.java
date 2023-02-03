package day8;

import java.util.Scanner;

public class codeup1076 {

    public static void main (String[] args) {
    	Scanner scan = new Scanner(System.in);
    	char c = scan.nextLine().charAt(0);
    	int n = (int)c-97;
    	for(int i=0; i<=n;i++) {
        	System.out.println((char)('a'+i));	
    	}
    }
}
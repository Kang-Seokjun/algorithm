package day8;

import java.util.Scanner;

public class codeup1079 {

    public static void main (String[] args) {

    	Scanner scan = new Scanner(System.in);
    	while(true) {
        	char c = scan.next().charAt(0);
        	System.out.println(c);
        	if(c=='q')break;
    	}
    }
}
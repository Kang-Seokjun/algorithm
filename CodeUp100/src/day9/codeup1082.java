package day9;

import java.util.Scanner;

public class codeup1082 {

    public static void main (String[] args) {

    	Scanner scan = new Scanner(System.in);
    	char s = scan.next().charAt(0);
    	
    	for(int i=1; i<16; i++) {
    		System.out.printf("%s*%X=%X\n",s,i,((int)s-55)*i);
    	}
    }
}
//A = 65 , 10 -55
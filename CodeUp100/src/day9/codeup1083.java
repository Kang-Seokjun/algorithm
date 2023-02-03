package day9;

import java.util.Scanner;

public class codeup1083 {

    public static void main (String[] args) {

    	Scanner scan = new Scanner(System.in);
    	int n = scan.nextInt();
    	String b = "X";
		for (int i = 1; i <=n; i++) {
			
			if (i == 3 ||i == 6 ||i == 9  ) {
				System.out.print(b+" ");
			}else {
				System.out.print(i+" ");	
			}
		}
	}
}
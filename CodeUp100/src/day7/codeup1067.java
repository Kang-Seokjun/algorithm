package day7;

import java.util.Scanner;

public class codeup1067 {

    public static void main (String[] args) {
    	Scanner scanner = new Scanner(System.in);

    	int a = scanner.nextInt();
    	
    	if(a<0) {
    		if(a%2==0) {
    			System.out.println("minus\neven");
    		}else {
    			System.out.println("minus\nodd");
    		}
    	}
    	else if(a%2==0) {
    		System.out.println("plus\neven");
		}else {
			System.out.println("plus\nodd");
		}
    }
}
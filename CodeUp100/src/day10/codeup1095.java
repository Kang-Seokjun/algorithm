package day10;

import java.util.Scanner;

public class codeup1095 {

    public static void main (String[] args) {
     	Scanner scan = new Scanner(System.in);
     	int min =25;
		int a = scan.nextInt();
		for(int i=0;i<a;i++) {
			int n = scan.nextInt();
			if(n<min) {
				min=n;
			}
		}
		System.out.println(min);
    }
}
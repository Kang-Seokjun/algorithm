package day3;

import java.util.Scanner;

public class codeup1027 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] time = scan.next().split("\\.");
	
		int y = Integer.parseInt(time[0]);
		int m = Integer.parseInt(time[1]);
		int d = Integer.parseInt(time[2]);
		
		System.out.printf("%02d-%02d-%04d",d,m,y);
	}
		
}
package day3;

import java.util.Scanner;

public class codeup1026 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String time = scan.nextLine();
	
		String h = time.substring(0,time.indexOf(":"));
		String m = time.substring(time.indexOf(":")+1,time.lastIndexOf(":"));
		String s = time.substring(time.lastIndexOf(":")+1,time.length());
		
		int n =Integer.valueOf(m);
		System.out.println(Integer.valueOf(m));
	}
		
}
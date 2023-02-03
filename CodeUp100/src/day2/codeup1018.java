package day2;

import java.util.Scanner;

public class codeup1018 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String t = scan.nextLine();
		int w = t.indexOf(":");
		System.out.printf("%s%s",t.substring(0,w),t.substring(w,t.length()));
	}
}

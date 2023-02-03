package day3;

import java.util.Scanner;

public class codeup1024 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String data = scan.nextLine();
		
		for (int i=0; i<data.length();i++) {
			System.out.println("\'"+data.charAt(i)+"\'");			
		}

	}
}
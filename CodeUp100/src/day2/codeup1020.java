package day2;

import java.util.Scanner;

public class codeup1020 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String data = scan.nextLine();

		int l = data.indexOf("-");
		System.out.printf("%s%s",data.substring(0, l),data.substring(l+1, data.length()));

	}
}
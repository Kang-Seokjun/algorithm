package day10;

import java.awt.desktop.PrintFilesEvent;
import java.util.Scanner;

public class codeup1092 {

    public static void main (String[] args) {
      	Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int day = 1;
		int min = (a<b)?((a<c)?a:c):b;
		
		while (day%a != 0 || day%b != 0 || day%c != 0)
			day ++;

		System.out.println(day);
	}
}
package day3;

import java.util.Scanner;

public class codeup1023 {

	  public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);

		    String[] value = sc.next().split("[.]");
		    int a = Integer.parseInt(value[0]);
		    int b = Integer.parseInt(value[1]);

		    System.out.printf("%d\n%d", a, b);
		  }
		}
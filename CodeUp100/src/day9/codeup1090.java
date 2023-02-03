package day9;

import java.util.Scanner;

public class codeup1090 {

    public static void main (String[] args) {
    	 Scanner scan = new Scanner(System.in);
       	 long a = scan.nextInt();
       	long d = scan.nextInt();
       	long n = scan.nextInt();
       	 
       	 for(long i=1; i<n;i++) {
       		 a*=d;
       	 }
       	 System.out.println(a);
    }
}
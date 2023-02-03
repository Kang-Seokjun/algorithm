package day10;

import java.util.Scanner;

public class codeup1091 {

    public static void main (String[] args) {
   	 Scanner scan = new Scanner(System.in);
   	 long a = scan.nextInt();
   	long m = scan.nextInt();	 
   	long d = scan.nextInt();
   	long n = scan.nextInt();
   	 
   	 for(long i=1; i<n;i++) {
   		 a*=m;
   		 a+=d;
   	 }
   	 System.out.println(a);
}
}
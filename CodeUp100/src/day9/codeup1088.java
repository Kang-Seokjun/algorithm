package day9;

import java.util.Scanner;

public class codeup1088 {

    public static void main (String[] args) {
      	 Scanner scan = new Scanner(System.in);
       	 int n = scan.nextInt();
       	 int i=1;
       	 while(true) {
       		 if(i%3!=0) {
       		 System.out.print(i+" ");
       		 }
       		 if(i==n)break;

       		 i++;
       	 }
    }
}
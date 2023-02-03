package day9;

import java.util.Scanner;

public class codeup1087 {

    public static void main (String[] args) {

   	 Scanner scan = new Scanner(System.in);
   	 int n = scan.nextInt();
   	 int i=0;
   	 int sum=0;
   	 while(true) {
   		 i++;
   		 sum+=i;
   		 
   		 if(sum>=n) {
   			 break;
   		 }
   	 }
   	 System.out.println(sum);
    }
}
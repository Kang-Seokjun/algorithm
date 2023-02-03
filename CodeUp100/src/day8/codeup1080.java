package day8;

import java.util.Scanner;

public class codeup1080 {

    public static void main (String[] args) {

    	Scanner scan = new Scanner(System.in);
    	int n = scan.nextInt();
    	int i=0;
    	int sum=0;
    	while(true) {
    		i++;
    		sum+=i;
    		
    		if(sum>=n) {
    			System.out.println(i);
    			break;
    		}
    	}
    }
}
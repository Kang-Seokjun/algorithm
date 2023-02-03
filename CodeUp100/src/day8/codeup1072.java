package day8;

import java.util.Scanner;

public class codeup1072 {

    public static void main (String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	int n = scanner.nextInt();
    	int arr[] = new int[n];
    	for(int i=0; i<n; i++) {
    		int n2 = scanner.nextInt();
    		arr[i]=n2;
    	}
    	for(int i=0; i<n; i++) {
    		System.out.println(arr[i]);
    	}
   }
}
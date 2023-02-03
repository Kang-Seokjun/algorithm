package day10;

import java.util.Scanner;

public class codeup1094 {

    public static void main (String[] args) {
     	Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int arr[] = new int[a];
		for(int i=a-1;i>=0;i--) {
			int n = scan.nextInt();
			arr[i]=n;
		}
		for(int i=0;i<a;i++) {
			System.out.print(arr[i]+" ");
		}
    }
}
package day10;

import java.util.Arrays;
import java.util.Scanner;

public class codeup1093 {

    public static void main (String[] args) {
     	Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int arr[] = new int[24];
		for(int i=0;i<a;i++) {
			int n = scan.nextInt();
			arr[n]++;
		}
		for(int i=1;i<24;i++) {
			System.out.print(arr[i]+" ");
		}

    }
}
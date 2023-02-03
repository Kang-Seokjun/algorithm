package day10;

import java.util.Scanner;

public class codeup1096 {

    public static void main (String[] args) {

     	Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int arr[][] = new int[19][19];
		for(int i=0;i<a;i++) {
			int n1 = scan.nextInt();
			int n2 = scan.nextInt();
			
			arr[n1-1][n2-1]=1;
		}
		
		for(int i=0; i<19; i++) {
			for(int j=0; j<19;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
    }
}
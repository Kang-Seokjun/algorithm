package day10;

import java.util.Scanner;

public class codeup1097 {

    public static void main (String[] args) {
    	Scanner scan = new Scanner(System.in);
		int arr[][] = new int[19][19];
		
		for(int i=0; i<19; i++) {
			for(int j=0; j<19;j++) {
				arr[i][j]= scan.nextInt(); 
			}
		}
		int a = scan.nextInt();
		
		for(int i=0; i<a; i++) {
			int x = scan.nextInt()-1;
			int y = scan.nextInt()-1;
			
			for(int j=0; j<19;j++) {
				if(arr[x][j]==0) arr[x][j] =1;
				else arr[x][j]=0;
			}
			for(int j=0; j<19;j++) {
				if(arr[j][y]==0) arr[j][y] =1;
				else arr[j][y]=0;
			}
		}
		for(int i=0; i<19; i++) {
			for(int j=0; j<19;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

    }
}
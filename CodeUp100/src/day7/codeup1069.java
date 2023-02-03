package day7;

import java.util.Scanner;

public class codeup1069 {

    public static void main (String[] args) {

    	Scanner scanner = new Scanner(System.in);
    	
    	char s = scanner.next().charAt(0);
    	
    	switch(s) {
    	case 'A' :
    		System.out.println("best!!!");
    		break;
    	case 'B' :
    		System.out.println("good!!");
    		break;
    	case 'C' :
    		System.out.println("run!");
    		break;
    	case 'D' :
    		System.out.println("slowly~");
    		break;
    	default :
    		System.out.println("what?");
    		break;
    	}
    }
}
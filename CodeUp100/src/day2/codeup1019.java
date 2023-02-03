package day2;

import java.util.Scanner;

public class codeup1019 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String t = scan.nextLine();
		int w = t.indexOf(".");
		int l = t.lastIndexOf(".");
		String y = t.substring(0,w);
		String m = t.substring(w+1,l);
		String d = t.substring(l+1,t.length());
		
		while (y.length()<=3) {
			y="0"+y;
		}
		if(m.length()==1)	{
			m = "0"+m;
		} 
		if (d.length()==1) {
			d = "0"+d;
		}
		System.out.println(y+"."+m+"."+d);
	}
}
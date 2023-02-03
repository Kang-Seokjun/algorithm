package day3;

import java.util.Scanner;

public class codeup1025 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		if (num<10000 && num>99999) {
			System.out.println("정해진 범위안으로 숫자를 입력해주세요");
		}else {
			int dn = 10000;
		for (int i=0; i<5;i++) {
			int num2 = num/dn;
			num%=dn;
			System.out.println("["+num2*dn+"]");
			dn/=10;
		}
		}
	}
}
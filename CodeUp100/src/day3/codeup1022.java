package day3;

import java.util.Scanner;

public class codeup1022 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char data[] = new char[51];
		data = scan.nextLine().toCharArray();
		//char 배열은 toCharArray() 사용
		//next 는 뛰어쓰기 인식 못함 
		//nextLine는 뛰어쓰기 인식 가능
		//C언어는 fgets 함수 사용
		System.out.println(data);
	}
}
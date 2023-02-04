
import java.util.Scanner;

public class number11022 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int count = scanner.nextInt();
		
		for (int i = 1; i <= count; i++) {
			int firstNum = scanner.nextInt();
			int secondNum = scanner.nextInt();

			System.out.printf("Case #%d: %d + %d = %d\n",i,firstNum,secondNum,firstNum + secondNum);
		}
	}
}

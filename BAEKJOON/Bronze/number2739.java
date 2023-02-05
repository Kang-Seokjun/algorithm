
import java.util.Scanner;

public class number2739 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int dan = scanner.nextInt();

		if (dan < 1 || dan > 9) {
			System.out.println("입력된 수의 값이 정해진 범위를 벗어났습니다.");
		} else {
			for (int i = 1; i <= 9; i++) {
				System.out.printf("%d * %d = %d\n", dan, i, dan * i);
			}
		}
	}
}

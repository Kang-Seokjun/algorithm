
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class number2741 {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		int number = Integer.parseInt(bufferedReader.readLine());
		
		for (int i = 1; i <= number; i++) {
			System.out.printf("%d\n", i);
		}
	}
}

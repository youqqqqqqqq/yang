package JSample;
import java.util.Scanner;

public class JEx4_1 {

	public static void main(String[] args) {
		System.out.println("score を入力してください");
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();
		scan.close();

		if (score >= 60) {
			System.out.println("60以上です");

		} else {
			System.out.println("60未満です");
		}

	}
}

package JSample;
import java.util.Scanner;

public class JEx4_1 {

	public static void main(String[] args) {
		System.out.println("score ����͂��Ă�������");
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();
		scan.close();

		if (score >= 60) {
			System.out.println("60�ȏ�ł�");

		} else {
			System.out.println("60�����ł�");
		}

	}
}
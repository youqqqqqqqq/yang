package JSample;
import java.util.Scanner;

public class JSample4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("キーボードから数値を入力してください。");

		Scanner scan = new Scanner(System.in);

		int num = scan.nextInt();

		scan.close();

		switch (num) {
		case 1 -> System.out.println("非常に不満");
		case 2 -> System.out.println("少し不満");
		case 3 -> System.out.println("どちらとも言えない");
		case 4 -> System.out.println("少し満足");
		case 5 -> System.out.println("大変満足");
		}
	}

}

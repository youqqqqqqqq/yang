package JSample;
import java.util.Scanner;

public class JEx7_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "abcabc";

		System.out.println("検索する文字を入力してください");
		Scanner scan = new Scanner(System.in);
		String input = scan.next();
		scan.close();

		int result = str.indexOf(input);
//		if (result == -1) {
		System.out.println(result);
//		}

	}

}

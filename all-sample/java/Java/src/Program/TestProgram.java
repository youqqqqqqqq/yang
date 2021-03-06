package Program;

import java.util.Scanner;

public class TestProgram {

	public static void main(String[] args) {

		var inputLine = ScanInput();

		// take input
		String[] inputStrs = inputLine.split(" ", 0);

		// check input size
		CheckStrIsNull(inputStrs);

		// chenk each str
		for (int i = 0; i < inputStrs.length; i++) {
			CheckStrSize(inputStrs[i], i);
		}

	}

	private static void CheckStrSize(String str, int n) {

		var isMatch = str.matches("\\d{8}");

		if (!isMatch) {
			System.out.println((n + 1) + "番目の文字列が「" + str + "」が8桁の数値ではありません。");
		}

	}

	private static void CheckStrIsNull(String[] strs) {

		if (strs.length == 0) {
			System.out.println("入力した文字列の配列のサイズが0です。");
		} else {
			System.out.print("入力された文字列配列は:[");

			for (int i = 0; i < strs.length; i++) {
				if (i == (strs.length - 1)) {
					System.out.print(strs[i]);
					break;
				}
				System.out.print(strs[i] + ",");
			}
			;
			System.out.println("]です");
		}

	}

	private static String ScanInput() {

		System.out.println("文字を入力してください:");
		Scanner scan = new Scanner(System.in);
		String inputStr = scan.nextLine();
		scan.close();

		return inputStr;
	}

	// test method
	// this method has some old version problem XXXXXXX
//	static String ReadInput() {
//	 s
//		InputStreamReader isr = new InputStreamReader(System.in);
//		BufferedReader br = new BufferedReader(isr);
//		
//		System.out.println("文字を入力してください:");
//		String input = null;
//		
//		try {
//			input = br.readLine();
//		} catch (IOException e) {
//			// TODO 自動生成された catch ブロック
//			e.printStackTrace();
//		}
//		
//		return input;
//	};

}

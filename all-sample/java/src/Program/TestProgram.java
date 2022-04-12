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
			System.out.println((n + 1) + "�Ԗڂ̕����񂪁u" + str + "�v��8���̐��l�ł͂���܂���B");
		}

	}

	private static void CheckStrIsNull(String[] strs) {

		if (strs.length == 0) {
			System.out.println("���͂���������̔z��̃T�C�Y��0�ł��B");
		} else {
			System.out.print("���͂��ꂽ������z���:[");

			for (int i = 0; i < strs.length; i++) {
				if (i == (strs.length - 1)) {
					System.out.print(strs[i]);
					break;
				}
				System.out.print(strs[i] + ",");
			}
			;
			System.out.println("]�ł�");
		}

	}

	private static String ScanInput() {

		System.out.println("��������͂��Ă�������:");
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
//		System.out.println("��������͂��Ă�������:");
//		String input = null;
//		
//		try {
//			input = br.readLine();
//		} catch (IOException e) {
//			// TODO �����������ꂽ catch �u���b�N
//			e.printStackTrace();
//		}
//		
//		return input;
//	};

}
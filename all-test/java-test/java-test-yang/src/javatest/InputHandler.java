package javatest;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputHandler {

	static Scanner scan = new Scanner(System.in);

	public static String GetInput(Scanner scan) {

		System.out.println("文字列を入力してください:");
		var input = scan.nextLine();
		return input;

	}

	public static int GetInputPostCode(Scanner scan) {

		int input = 0;
		System.out.println("郵便番号(７桁数字)を入力してください:");

		try {
			input = scan.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("**数字が入力されていません!**");
		}

		return input;
	}

	public static String[] ChangeInputToArray(String input) {

		return input.split(",");
	}

	public static void PrintInputList(String[] inputList) {

		System.out.print("入力したstrListは[");

		for (int i = 0; i < inputList.length; i++) {
			if (i == (inputList.length - 1)) {
				System.out.println(inputList[i] + "]です。");
				break;
			}
			System.out.print(inputList[i] + ",");
		}
	}
}

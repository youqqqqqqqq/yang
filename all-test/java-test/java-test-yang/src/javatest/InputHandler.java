package javatest;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputHandler {

	static Scanner scan = new Scanner(System.in);

	public static String GetInput(Scanner scan) {

		System.out.println("���������͂��Ă�������:");
		var input = scan.nextLine();
		return input;

	}

	public static int GetInputPostCode(Scanner scan) {

		int input = 0;
		System.out.println("�X�֔ԍ�(�V������)����͂��Ă�������:");

		try {
			input = scan.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("**���������͂���Ă��܂���!**");
		}

		return input;
	}

	public static String[] ChangeInputToArray(String input) {

		return input.split(",");
	}

	public static void PrintInputList(String[] inputList) {

		System.out.print("���͂���strList��[");

		for (int i = 0; i < inputList.length; i++) {
			if (i == (inputList.length - 1)) {
				System.out.println(inputList[i] + "]�ł��B");
				break;
			}
			System.out.print(inputList[i] + ",");
		}
	}
}
package JSample;

public class JSample6_1 {
	public static void main(String[] args) {

		int[][] myNumbers = { { 1, 2, 3, 4 }, { 5, 6, 7 } };
		for (int i = 0; i < myNumbers.length; ++i) {
			System.out.println("�s���ƂɌJ��Ԃ�");
			for (int j = 0; j < myNumbers[i].length; ++j) {
				System.out.println("��̗v�f����" + myNumbers[i].length);
				System.out.println(myNumbers[i][j]);
			}
		}

	}
}
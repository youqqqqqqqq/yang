package JSample;

public class JSample6_1 {
	public static void main(String[] args) {

		int[][] myNumbers = { { 1, 2, 3, 4 }, { 5, 6, 7 } };
		for (int i = 0; i < myNumbers.length; ++i) {
			System.out.println("行ごとに繰り返し");
			for (int j = 0; j < myNumbers[i].length; ++j) {
				System.out.println("列の要素数は" + myNumbers[i].length);
				System.out.println(myNumbers[i][j]);
			}
		}

	}
}

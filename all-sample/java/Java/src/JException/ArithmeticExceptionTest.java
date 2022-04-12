package JException;

public class ArithmeticExceptionTest {
	public static void main(String[] args) {
		System.out.println("Exception in thread \"main\"");

		try {
			for (int i = 10; i > 0; i--) {
				System.out.println(" " + (i / (i - 1)));
				if (i % 5 == 0)
					System.out.println();
			}
		} catch (Exception e) {
			e.printStackTrace();
			e.printStackTrace();
		}

	}

}

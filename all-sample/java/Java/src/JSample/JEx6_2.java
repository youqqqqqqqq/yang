package JSample;

public class JEx6_2 {
	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {

			String result = "";

			for (int j = 1; j <= i; j++) {
				result += (String.valueOf(i * j) + " ");
			}

			System.out.println(result);
		}
	}
}

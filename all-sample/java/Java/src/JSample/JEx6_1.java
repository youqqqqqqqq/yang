package JSample;

public class JEx6_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] cars = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		for (int i : cars) {
			if (i % 2 != 0)
				continue;

			System.out.println(i);

		}
	}

}

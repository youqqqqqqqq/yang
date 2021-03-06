package JSample;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JEx5_2 {
	public static void main(String[] args) {
		System.out.println("n を入力してください");

		// scan
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();

		// create list
		List<Integer> ns = new ArrayList<Integer>();
		for (int i = 1; i <= n; i++) {
			ns.add(i);
		}

		// loop
		for (int i : ns) {
			String result = "";

			for (int j = 1; j <= i; j++) {

				if (j == i) {
					result += String.valueOf(j);
					break;
				}

				result += (String.valueOf(j) + "*");
			}

			System.out.println(i + "!=" + result);
		}

		// result
		int cal_result = 1;
		for (int k : ns) {
			cal_result *= k;
		}

		System.out.println();
		System.out.println(n + "!=" + cal_result);

	}
}

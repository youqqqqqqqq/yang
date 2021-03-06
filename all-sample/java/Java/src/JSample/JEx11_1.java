package JSample;
import java.util.Scanner;

public class JEx11_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1;
		int n2;

		// scan
		Scanner scan = new Scanner(System.in);

		System.out.println("キーボードから数値1を入力してください。");
		n1 = scan.nextInt();

		System.out.println("キーボードから数値2を入力してください。");
		n2 = scan.nextInt();

		scan.close();

		// compare
		Num num1 = new Num(n1, n2);
		System.out.println("大きい数字:" + num1.showBiggerNum());
	}

}

class Num {

	private int n1;
	private int n2;

	public Num(int n1, int n2) {
		this.n1 = n1;
		this.n2 = n2;
	}

	public int showBiggerNum() {
		int result = (n1 > n2) ? n1 : n2;
		return result;
	}
}
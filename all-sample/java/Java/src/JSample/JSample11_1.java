package JSample;

public class JSample11_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		departure();
		arrive();

		annouce();
	}

	private static void departure() {
		System.out.println("�o�����܂��B");
	}

	private static void arrive() {
		System.out.println("�������܂��B");
	}

	private static void annouce() {
		departure();
		arrive();
	}

}
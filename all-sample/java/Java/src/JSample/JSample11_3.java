package JSample;

public class JSample11_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int english = 58;
		check("�p��", english);
	}

	private static void check(String language, int score) {
		System.out.print("���̉���҂�" + language + "�\�͂�");
		var result = (score > 70) ? "�r�W�l�X���x���B" : "�����b���x���ł��B";

		System.out.println(result);

	}
}
package JSample;

public class JSample7_6 {
	public static void main(String[] args) {
		String str1 = new String("Thank You");

		String upper_str1 = str1.toUpperCase();
		String lower_str1 = str1.toLowerCase();

		System.out.println("���̕����� : " + str1);
		System.out.println("�啶���֕ϊ� : " + upper_str1);
		System.out.println("�������֕ϊ� : " + lower_str1);

		String str2 = new String("8AM�ɏW�����܂�");
		String upper_str2 = str2.toUpperCase();
		String lower_str2 = str2.toLowerCase();

		System.out.println("���̕����� : " + str2);
		System.out.println("�啶���֕ϊ� : " + upper_str2);
		System.out.println("�������֕ϊ� : " + lower_str2);
	}
}
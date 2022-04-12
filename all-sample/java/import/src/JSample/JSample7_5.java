package JSample;

public class JSample7_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = new String("Hello world");
		String new_str1 = str1.substring(2, 5);
		System.out.println(str1 + "‚Ìsubstring(2,5)‚Í" + new_str1 + "‚Å‚·");

		String str2 = new String("‚±‚ñ‚É‚¿‚Í");
		String new_str2 = str2.substring(2, 4);
		System.out.println(str2 + "‚Ìsubstring(2,4)‚Í" + new_str2 + "‚Å‚·");

	}

}

package JSample;

public class JSample11_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int english = 58;
		check("英語", english);
	}

	private static void check(String language, int score) {
		System.out.print("この応募者の" + language + "能力は");
		var result = (score > 70) ? "ビジネスレベル。" : "日常会話レベルです。";

		System.out.println(result);

	}
}

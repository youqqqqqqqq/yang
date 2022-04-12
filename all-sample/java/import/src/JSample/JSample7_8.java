package JSample;

public class JSample7_8 {
	public static void main(String[] args) {
		String str = "“Œ‹,‘åã,‹“s,–kŠC“¹";
		String[] city = str.split(",");

		for (int i = 0; i < city.length; i++) {
			System.out.println(i + "”Ô–Ú‚Ì—v‘f = " + city[i]);
		}
	}
}

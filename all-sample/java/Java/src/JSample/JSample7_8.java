package JSample;

public class JSample7_8 {
	public static void main(String[] args) {
		String str = "����,���,���s,�k�C��";
		String[] city = str.split(",");

		for (int i = 0; i < city.length; i++) {
			System.out.println(i + "�Ԗڂ̗v�f = " + city[i]);
		}
	}
}

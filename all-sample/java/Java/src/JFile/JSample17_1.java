package JFile;

import java.io.File;

public class JSample17_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File cdirectory = new File("C:\\");

		String filelist[] = cdirectory.list();
		for (int i = 0; i < filelist.length; i++) {
			System.out.println(filelist[i]);
		}
	}
}

package JFile;

import java.io.File;

public class JSample17_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("test.txt");
		String path = file.getAbsolutePath();
		System.out.println("File:" + path);
	}
}
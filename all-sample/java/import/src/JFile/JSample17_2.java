package JFile;

import java.io.File;

public class JSample17_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File cdirectory = new File("C:\\");
		File filelist[] = cdirectory.listFiles();

		for (int i = 0; i < filelist.length; i++) {
			if (filelist[i].isDirectory()) {
				System.out.println("[D]" + filelist[i].getName());
			} else if (filelist[i].isFile()) {
				System.out.println("[F]" + filelist[i].getName());
			} else {
				System.out.println("[?]" + filelist[i].getName());
			}
		}

	}

}

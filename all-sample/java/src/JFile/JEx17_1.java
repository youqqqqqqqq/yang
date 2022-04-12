package JFile;

import java.io.File;
import java.io.IOException;

public class JEx17_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File newfile = new File("C:\\Sub\\JEx17_1.java");

		try {
			if (newfile.createNewFile()) {
				System.out.println("ファイルの作成に成功しました");
			} else {
				System.out.println("ファイルの作成に失敗しました");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

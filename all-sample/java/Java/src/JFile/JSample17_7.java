package JFile;

import java.io.File;

public class JSample17_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("C:\\Test\\test.txt");

		if (file.exists()) {
			if (file.delete()) {
				System.out.println("ファイルを削除しました");
			} else {
				System.out.println("ファイルの削除に失敗しました");
			}
		} else {
			System.out.println("ファイルが見つかりません");
		}
	}

}

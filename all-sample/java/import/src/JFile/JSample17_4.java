package JFile;

import java.io.File;
import java.io.IOException;

public class JSample17_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File newfile = new File("C:\\Test\\newtest.txt\"");

		try {
			if (newfile.createNewFile()) {
				System.out.println("�t�@�C���̍쐬�ɐ������܂���");
			} else {
				System.out.println("�t�@�C���̍쐬�Ɏ��s���܂���");
			}
		} catch (IOException e) {
			System.out.println(e);
		}
	}

}
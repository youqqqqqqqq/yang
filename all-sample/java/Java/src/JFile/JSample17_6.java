package JFile;

import java.io.File;

public class JSample17_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File newfile = new File("C:\\Sub");

		if (newfile.mkdir()) {
			System.out.println("�f�B���N�g���̍쐬�ɐ������܂���");
		} else {
			System.out.println("�f�B���N�g���̍쐬�Ɏ��s���܂���");
		}

	}

}

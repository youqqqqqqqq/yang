package JFile;

import java.io.File;
import java.io.IOException;

public class JEx17_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File newfile = new File("C:\\Sub\\JEx17_1.java");

		try {
			if (newfile.createNewFile()) {
				System.out.println("�t�@�C���̍쐬�ɐ������܂���");
			} else {
				System.out.println("�t�@�C���̍쐬�Ɏ��s���܂���");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
package JFile;

import java.io.File;

public class JSample17_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("C:\\Test\\test.txt");

		if (file.exists()) {
			if (file.delete()) {
				System.out.println("�t�@�C�����폜���܂���");
			} else {
				System.out.println("�t�@�C���̍폜�Ɏ��s���܂���");
			}
		} else {
			System.out.println("�t�@�C����������܂���");
		}
	}

}

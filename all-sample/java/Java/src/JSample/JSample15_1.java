package JSample;

import java.util.ArrayList;

public class JSample15_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> al = new ArrayList<String>();

		al.add("�o�i�i");
		al.add("����");
		al.add("��");
		al.add("�C�`�S");
		al.add("�����S");

		System.out.println("�o�^�����f�[�^�̐��F" + al.size() + "��");

		for (int i = 0; i < al.size(); i++) {
			String out = al.get(i);
			System.out.println(out);
		}

		System.out.println("��Ԗ��̉ʕ����C�`�S�֒u�������܂�");

		al.set(0, "�C�`�S");
		al.set(3, "�o�i�i");
		for (int i = 0; i < al.size(); i++) {
			String out = al.get(i);
			System.out.println(out);
		}
	}
}
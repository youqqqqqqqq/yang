package JSample;

import java.util.HashMap;

public class JSample15_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, String> map = new HashMap<String, String>();
		map.put("�o�i�i", "����");
		map.put("�����S", "䙉�");
		map.put("�C�`�S", "���");

		if (map.containsKey("�o�i�i")) {
			System.out.println("�o�i�i�𒆍���ɂ���ƁF");
			System.out.println(map.get("�o�i�i"));
		} else {
			System.out.println("�����������ʕ��͑��݂��܂���B");
		}
	}

}

package javatest;

public class PostCodeChecker {

	static int inputPostCode;

	public static String GetPostCodeFromList(String[] list) {

		var result = "";

		for (int i = 0; i < list.length; i++) {
			if (list[i].matches("\\d{7}")) {

				result = "[" + (i + 1) + "]�Ԗڂ̕�����[" + list[i] + "]�͗X�֔ԍ��ł���B";
				inputPostCode = Integer.parseInt(list[i]);
				break;

			}
		}

		result = result.isEmpty() ? "�X�֔ԍ���������܂���B�X�֔ԍ��́A7���̐����ł���B" : result;
		return result;
	}

	static String SearchPostCode(int inputPostCode) {

		var result = "�Y���X�֔ԍ��͌�����Ȃ������B";

		for (int i = 0; i < AddressTableManager.tableList.size(); i++) {
			for (int j = 0; j < AddressTableManager.tableList.get(i).getTable().size(); j++) {
				var table = AddressTableManager.tableList.get(i).getTable();

				if (table.containsKey(inputPostCode)) {
					result = "�u�X�֔ԍ��̓e�[�u��[" + (i + 1) + "]�ɂ���A������[" + table.get(inputPostCode) + "]�ł���B";
					break;
				}
			}
		}

		return result;
	}

}
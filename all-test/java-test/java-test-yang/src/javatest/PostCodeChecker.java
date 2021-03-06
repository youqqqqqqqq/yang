package javatest;

public class PostCodeChecker {

	static int inputPostCode;

	public static String GetPostCodeFromList(String[] list) {

		var result = "";

		for (int i = 0; i < list.length; i++) {
			if (list[i].matches("\\d{7}")) {

				result = "[" + (i + 1) + "]番目の文字列[" + list[i] + "]は郵便番号である。";
				inputPostCode = Integer.parseInt(list[i]);
				break;

			}
		}

		result = result.isEmpty() ? "郵便番号が見つかりません。郵便番号は、7桁の数字である。" : result;
		return result;
	}

	static String SearchPostCode(int inputPostCode) {

		var result = "該当郵便番号は見つからなかった。";

		for (int i = 0; i < AddressTableManager.tableList.size(); i++) {
			for (int j = 0; j < AddressTableManager.tableList.get(i).getTable().size(); j++) {
				var table = AddressTableManager.tableList.get(i).getTable();

				if (table.containsKey(inputPostCode)) {
					result = "「郵便番号はテーブル[" + (i + 1) + "]にあり、町名は[" + table.get(inputPostCode) + "]である。";
					break;
				}
			}
		}

		return result;
	}

}

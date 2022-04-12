package javatest;

import java.util.ArrayList;
import java.util.List;

public class AddressTableManager {

	static AddressTable table1 = new AddressTable();
	static AddressTable table2 = new AddressTable();

	static List<AddressTable> tableList = new ArrayList<AddressTable>();

	public static void createTableList() {

		// add table elements
		table1.add(2100026, "�獪");
		table1.add(2100825, "�o����");
		table1.add(2100821, "�a��");
		table1.add(2100806, "����");
		table1.add(2100818, "����");

		table2.add(2110032, "�،�");
		table2.add(2110031, "�咬");
		table2.add(2110033, "�_����");
		table2.add(2110021, "�Z�g��");
		table2.add(2110061, "����");

		// create tables to list
		tableList.add(table1);
		tableList.add(table2);
	}

}

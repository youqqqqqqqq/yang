package javatest;

import java.util.HashMap;

public class AddressTable {

	private HashMap<Integer, String> table = new HashMap<Integer, String>();

	public HashMap<Integer, String> getTable() {
		return table;
	}

	public void add(Integer postCode, String address) {
		this.table.put(postCode, address);
	}

	public void remove(Integer postCode) {
		this.table.remove(postCode);
	}

}

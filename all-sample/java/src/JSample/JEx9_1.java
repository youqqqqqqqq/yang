package JSample;

public class JEx9_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Computer com1 = new Computer();
		com1.setComputerNo(1);
		com1.setName("com1");

		com1.disComputer();
	}

}

class Computer {
	int computerNo;
	String name;

	void setComputerNo(int newComputerNo) {
		computerNo = newComputerNo;
	}

	void setName(String newName) {
		name = newName;
	}

	void disComputer() {
		System.out.println(name + "さんが使っているパソコンは " + computerNo + "号機です");
	}

}

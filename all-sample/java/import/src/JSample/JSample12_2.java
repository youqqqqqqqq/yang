package JSample;

public class JSample12_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ExClass ins1 = new ExClass();
		ins1.setSize(100);

		ExClass ins2 = new ExClass();
		ins1.setSize(300);

		System.out.println(ins1.standerSize);
		System.out.println(ins2.standerSize);
		System.out.println(ExClass.standerSize);

	}
}

class ExClass {
	static int standerSize;

	void setSize(int num) {
		standerSize = num;
	}
}

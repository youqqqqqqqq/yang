package JSample;

public class JSample13_1A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		superclass superOb = new superclass();
		subclass subOb = new subclass();

		superOb.i = 10;
		superOb.j = 20;

		System.out.println("Contents of superOb: ");

		superOb.printij();
		System.out.println();

		subOb.i = 7;
		subOb.j = 8;
		subOb.k = 9;

		System.out.println("Contents of subOb: ");

		subOb.printij();
		subOb.printk();

		System.out.println();
		System.out.println("Sum of i,j and k in subOb:");

		subOb.printsum();

	}

}

class superclass {

	int i, j;

	void printij() {
		System.out.println("i and j:" + i + " " + j);
	}
}

class subclass extends superclass {

	int k;

	void printk() {
		System.out.println("k:" + k);
	}

	void printsum() {
		System.out.println("i + j + k =" + (i + j + k));
	}

}

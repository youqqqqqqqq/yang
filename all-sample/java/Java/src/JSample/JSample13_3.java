package JSample;

public class JSample13_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SubClassSample scs = new SubClassSample();
		scs.print();
	}
}

class SuperClassSample {
	String str = "SuperClass";

	public String getStr() {
		return str;
	}
}

class SubClassSample extends SuperClassSample {
	String str = "SubClass";

	public String getStr() {
		return str;
	}

	public void print() {
		System.out.println("super.str = " + super.str);
		System.out.println("str = " + str);

		System.out.println("super.getStr() = " + super.getStr());
		System.out.println("getStr() = " + getStr());

	}
}

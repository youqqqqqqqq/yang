package JSample;

public class JEx14_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SuperC a;

		Sub1 b = new Sub1();
		Sub2 c = new Sub2();

		a = b;
		a.cs();

		a = c;
		a.cs();

	}

}

class SuperC {
	public void cs() {
		System.out.println("This is SuperC!");
	}
}

class Sub1 extends SuperC {
	public void cs() {
		System.out.println("This is Subc1!");
	}
}

class Sub2 extends SuperC {
	public void cs() {
		System.out.println("This is Subc2!");
	}
}

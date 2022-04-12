package JSample;

public class JSample14_1 {

	public static void main(String[] args) {

		show(new Cat());
		show(new Dogg());

		Animal a = new Cat();
		a.eat();
		Cat c = (Cat) a;
		c.work();

	}

	public static void show(Animal a) {
		a.eat();

		if (a instanceof Cat) {
			Cat c = (Cat) a;
			c.work();
		} else if (a instanceof Dogg) {
			Dogg d = (Dogg) a;
			d.work();
		}
	}

}

abstract class Animal {
	abstract void eat();
}

class Cat extends Animal {
	public void eat() {
		System.out.println("Catに食べる?");
	}

	public void work() {
		System.out.println("Catにネズミを捕まえる");
	}
}

class Dogg extends Animal {
	public void eat() {
		System.out.println("Dogに食べる?");
	}

	public void work() {
		System.out.println("Dogに留守番する");
	}
}

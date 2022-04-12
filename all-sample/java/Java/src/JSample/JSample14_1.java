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
		System.out.println("Cat�ɐH�ׂ�?");
	}

	public void work() {
		System.out.println("Cat�Ƀl�Y�~��߂܂���");
	}
}

class Dogg extends Animal {
	public void eat() {
		System.out.println("Dog�ɐH�ׂ�?");
	}

	public void work() {
		System.out.println("Dog�ɗ���Ԃ���");
	}
}

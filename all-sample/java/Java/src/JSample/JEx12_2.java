package JSample;

public class JEx12_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog dog1 = new Dog(3);
		Dog dog2 = new Dog(5);

		System.out.println(dog1.age);

	}

}

class Dog {
	static int age;

	public Dog(int age) {
		this.age = age;
	}
}

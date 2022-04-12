package JSample;

public class JSample10_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person myObj = new Person();

		myObj.setName("John");
		System.out.println(myObj.getName());

	}

}

class Person {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String newName) {
		this.name = newName;
	}
}
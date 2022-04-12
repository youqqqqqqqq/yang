package JSample;

public class JEx10_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PersonNew man = new PersonNew();

		man.setName("John");
		man.setAge(20);
		man.setSex("’j");

		man.getInfo();
	}
}

class PersonNew {
	private String name;
	private String sex;
	private int age;

	// setter
	public void setName(String name) {
		this.name = name;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// getter
	public String getName() {
		return name;
	}

	public String getSex() {
		return sex;
	}

	public int getAge() {
		return age;
	}

	public void getInfo() {
		System.out.println("name: " + name);
		System.out.println("sex: " + name);
		System.out.println("name: " + name);
	}
}

package JSample;

import java.util.ArrayList;
import java.util.HashMap;

public class JEx15_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> studentsMap = new HashMap<Integer, String>();
		ArrayList<Student> studentsList = new ArrayList<Student>();

		Student s1 = new Student("佐藤　純一", 1);
		Student s2 = new Student("田中　太郎", 2);

		studentsList.add(s1);
		studentsList.add(s2);

		for (Student student : studentsList) {
			studentsMap.put(student.getNumber(), student.getName());
		}

		for (int i = 1; i <= studentsMap.size(); i++) {
			System.out.println("番号: " + i + " " + "名前: " + studentsMap.get(i));
		}

	}

}

class Student {
	private String name;
	private int number;

	public Student(String name, int number) {
		super();
		this.name = name;
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

}

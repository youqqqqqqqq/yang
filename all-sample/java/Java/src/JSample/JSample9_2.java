package JSample;

public class JSample9_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car car1 = new Car();
		car1.color = "red";
		System.out.println("���X����o�b�e���[�ʂ́A" + car1.battery + "�ł�");

		car1.go();
		car1.charge();

	}
}

class Car {

	String color;
	int battery = 100;

	void go() {
		this.battery -= 10;
		System.out.println("�o�b�e���[��10�g�p���܂���");
		System.out.println("���݂̃o�b�e���[�́@" + battery + "�ł�");
	}

	void charge() {
		this.battery += 50;
		System.out.println("�o�b�e���[��50�[�d���܂���");
		System.out.println("���݂̃o�b�e���[�́@" + battery + "�ł�");
	}

}
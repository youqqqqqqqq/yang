package JSample;

public class JSample9_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car car1 = new Car();
		car1.color = "red";
		System.out.println("元々あるバッテリー量は、" + car1.battery + "です");

		car1.go();
		car1.charge();

	}
}

class Car {

	String color;
	int battery = 100;

	void go() {
		this.battery -= 10;
		System.out.println("バッテリーを10使用しました");
		System.out.println("現在のバッテリーは　" + battery + "です");
	}

	void charge() {
		this.battery += 50;
		System.out.println("バッテリーを50充電しました");
		System.out.println("現在のバッテリーは　" + battery + "です");
	}

}
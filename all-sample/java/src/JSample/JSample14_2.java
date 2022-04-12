package JSample;

public class JSample14_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ControlBikeIf myBike = new BikeGo();

		myBike.start();
		myBike.speedup();
		myBike.stop();
		myBike.start();

	}

}

interface ControlBikeIf {
	void start();

	void stop();

	void speedup();

	void speeddown();
}

class BikeGo implements ControlBikeIf {

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("自電車起動");

	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("自電車停止");

	}

	@Override
	public void speedup() {
		// TODO Auto-generated method stub
		System.out.println("速度アップ");

	}

	@Override
	public void speeddown() {
		// TODO Auto-generated method stub
		System.out.println("速度ダウン");

	}

}

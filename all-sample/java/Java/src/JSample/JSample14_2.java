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
		System.out.println("���d�ԋN��");

	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("���d�Ԓ�~");

	}

	@Override
	public void speedup() {
		// TODO Auto-generated method stub
		System.out.println("���x�A�b�v");

	}

	@Override
	public void speeddown() {
		// TODO Auto-generated method stub
		System.out.println("���x�_�E��");

	}

}

package JSample;

public class JSample12_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Television tv1 = new Television();

		// error
//		tv1.setChannel(1);

	}

}

class Television {
	private int channelNo;

	private void setChannel(int newChannelNo) {
		channelNo = newChannelNo;
		System.out.println("?V????ChannelNo=" + channelNo);
	}
}

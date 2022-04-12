package JSample;
import java.util.Date;

public class JSample8_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date date = new Date();
		String strDate = date.toString();

		System.out.println(date);
		System.out.println(strDate);

		System.out.println(date.getClass().getSimpleName());
	}

}

package JSample;
import java.text.SimpleDateFormat;
import java.util.Date;

public class JSample8_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date date = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyy-MM-dd");
		String strDate = dateFormat.format(date);

		System.out.println(date);
		System.out.println(strDate);
	}

}

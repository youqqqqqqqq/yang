package JSample;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class JSample8_5 {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		String strDate = "2018-12-31";
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyy-MM-dd");
		Date date = dateFormat.parse(strDate);

		System.out.println(date);

	}

}

package JSample;
import java.text.ParseException;
import java.util.Date;

public class JSample8_6 {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		String strDate = "2018-12-31";
		Date sqLDate = java.sql.Date.valueOf(strDate);
		System.out.println(sqLDate);

	}
}

//reference
//https:// surleconomiejp.blogspot.com/2015/10/trycatchthrow.html
package JSON;

import java.io.Serializable;
import java.util.Date;

import org.quickconnectfamily.json.JSONException;
import org.quickconnectfamily.json.JSONUtilities;

public class TestThing implements Serializable {
	
	private String theString;
	private int theInt;
	private Date theDate;

	public TestThing(String aString, int anInt, Date aDate) {
		theString = aString;
		theInt = anInt;
		theDate = aDate;
	}
}




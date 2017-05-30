package JSON;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

import org.quickconnectfamily.json.JSONException;
import org.quickconnectfamily.json.JSONUtilities;
import org.quickconnectfamily.json.ParseException;

public class JSONToObject {
	public static void main(String[] args) throws Throwable {
		try {
			String jsonString = "{\"theString\":\"Hello World\",\"theInt\":\"25\",\"theDate\":\"Mon May 29 17:17:47 MST 2017\"}";
			
			HashMap aMap = (HashMap)JSONUtilities.parse(jsonString);
			
			String aString = (String)aMap.get("theString");
			
			int anInt = Integer.parseInt((String)aMap.get("theInt"));
			
			String aDateString = (String)aMap.get("theDate");
			
			SimpleDateFormat aFormatter = new SimpleDateFormat("EEE MMM d HH:mm:ss z yyyy");
			
			Date aDate = aFormatter.parse(aDateString);
			
			TestThing anotherInstance = new TestThing(aString, anInt, aDate);
			
			String anotherjsonString = JSONUtilities.stringify(anotherInstance);
			
			System.out.println(anotherjsonString);
			
		}
		catch (JSONException e) {
			e.printStackTrace();
		}
	}
}
package JSON;

import java.io.Serializable;
import java.util.Date;

import org.quickconnectfamily.json.JSONException;
import org.quickconnectfamily.json.JSONUtilities;

public class ObjToJSON extends TestThing{

	public static void main(String[] args) {

		TestThing anInstance = new TestThing("Hello World", 25, new Date());
		//System.out.println(anInstance);

		try {
			String jsonString = JSONUtilities.stringify(anInstance);
			System.out.println(jsonString);
		}
		catch (JSONException e) {
			e.printStackTrace();
		}
	}

}





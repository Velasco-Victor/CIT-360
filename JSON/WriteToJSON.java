package JSON;

import java.io.File;
import java.io.FileOutputStream;
import java.io.Serializable;

import org.quickconnectfamily.json.JSONOutputStream;

public class WriteToJSON {
	public static void main(String[] args) throws Throwable {
		File aFile = new File("test.json");
		try {
			FileOutputStream aFileStream = new FileOutputStream(aFile);
			
			JSONOutputStream jsonOut = new JSONOutputStream(aFileStream);
			
			Serializable aSerializableObject = "{\"theString\":\"Hello World\",\"theInt\":\"25\",\"theDate\":\"Mon May 29 17:17:47 MST 2017\"}";
			
			jsonOut.writeObject(aSerializableObject);
			
			jsonOut.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}

package JSON;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

import org.quickconnectfamily.json.JSONInputStream;
import org.quickconnectfamily.json.JSONUtilities;

public class ReadFromJSON {
	public static void main(String[] args) throws Throwable {

		try {
			//Read data from File
			FileInputStream aFileStream = new FileInputStream("test.json");  

			JSONInputStream jsonIn = new JSONInputStream(aFileStream);
			
			//Cast data from file into String and put it into another String variable
			String anotherString = (String) jsonIn.readObject();

			//create hashmap with parsed anotherString
			HashMap aMap = (HashMap)JSONUtilities.parse(anotherString);
			
			//get elements from hashmap
			String aString = (String)aMap.get("theString");

			int anInt = Integer.parseInt((String)aMap.get("theInt"));

			String aDateString = (String)aMap.get("theDate");

			SimpleDateFormat aFormatter = new SimpleDateFormat("EEE MMM d HH:mm:ss z yyyy");

			Date aDate = aFormatter.parse(aDateString);
			
			//create anotherInstance passing parameters we got from aMap HashMap
			TestThing anotherInstance = new TestThing(aString, anInt, aDate);
			
			//stringify anotherInstance from Object to String
			String anotherjsonString = JSONUtilities.stringify(anotherInstance);

			//Print results
			System.out.println(anotherjsonString);

			jsonIn.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}



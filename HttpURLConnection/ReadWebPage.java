package HttpURLConnection;

import java.io.*;
import java.net.*;

public class ReadWebPage {
	public static void main(String args[]) throws Exception{

		new ReadWebPage(); 
	}
	public ReadWebPage(){
		try{
			URL url = new URL("https://www.github.com");
			
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();

			String readStream = readStream(connection.getInputStream());

			System.out.println(readStream);
			
		} catch (Exception e){
			e.printStackTrace();
		}
	}
	private String readStream(InputStream in) {
		
		StringBuilder sb = new StringBuilder();
		
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(in));) {
        	
            String nextLine = "";
            
            while ((nextLine = reader.readLine()) != null) {
                sb.append(nextLine + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
	}
}

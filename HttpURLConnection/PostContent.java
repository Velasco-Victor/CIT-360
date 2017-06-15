package HttpURLConnection;

import java.net.HttpURLConnection;
import java.io.*;

public class PostContent {
	HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
	try {
		urlConnection.setDoOutput(true);
		urlConnection.setChunkedStreamingMode(0);

		InputStream in = new BufferedInputStream(urlConnection.getInputStream());
		readStream(in);
	}
	finally {
		urlConnection.disconnect();
	}
	  private String readStream(InputStream in){
			
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






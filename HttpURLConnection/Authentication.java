package HttpURLConnection;

import java.net.PasswordAuthentication;

public class Authentication {
	Authenticator.setDefault(new Authenticator() {
	     protected PasswordAuthentication getPasswordAuthentication() {
	       return new PasswordAuthentication(username, password.toCharArray());
	     
	   }
	 }
}

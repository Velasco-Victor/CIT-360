package HttpURLConnection;

import java.io.IOException;

public class Test {

  /**
   * @param args
   * @throws IOException
   */
  public static void main(String[] args) throws IOException {
    String s = "https://github.com/Velasco-Victor/CIT-360/blob/master/HttpURLConnection/Test.java";
    
    TinyURL tiny = new TinyURL();
    
    System.out.println(tiny.shorter(s));
    
  }

}
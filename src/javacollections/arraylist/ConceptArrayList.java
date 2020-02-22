package javacollections.arraylist;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class ConceptArrayList {

	public static void main(String[] args) throws IOException {
		
		String url = "https://www.engprod-charter.net/";

		URL obj = new URL(url);
		HttpURLConnection conn = (HttpURLConnection) obj.openConnection();
		conn.setReadTimeout(5000);
		conn.addRequestProperty("Accept-Language", "en-US,en;q=0.8");
		conn.addRequestProperty("User-Agent", "Mozilla");
		conn.addRequestProperty("Referer", "google.com");
		

		HttpURLConnection httpconn = new HttpURLConnection(null) {
			
			@Override
			public void connect() throws IOException {
				
			}
			
			@Override
			public boolean usingProxy() {
				return false;
			}
			
			@Override
			public void disconnect() {
				
			}
		};

	}

}

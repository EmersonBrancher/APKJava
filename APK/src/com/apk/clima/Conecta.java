package com.apk.clima;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Conecta {

	public static String Json(String recebeId) throws IOException {
		
		String chegaId = recebeId.toString();
		
		URL url = new URL("http://api.openweathermap.org/data/2.5/weather?id=" + chegaId +"&APPID=f86cef0eaafe77f1f08ed6ae589d2bd4");
		
		HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
		
		String response = "";
		
		try {

			InputStream in = urlConnection.getInputStream();

			InputStreamReader isw = new InputStreamReader(in);

			int data = isw.read();

			while (data != -1) {
				
				char current = (char) data;
				data = isw.read();
				response += current;
	
			}
		} finally {
			
			urlConnection.disconnect();
			
		}

		return response.toString();

	}

}

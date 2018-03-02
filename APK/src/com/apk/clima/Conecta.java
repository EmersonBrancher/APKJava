package com.apk.clima;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Conecta {

	public static String Json() throws IOException {
		
		URL url = new URL("http://samples.openweathermap.org/data/2.5/weather?id=2172797&appid=b6907d289e10d714a6e88b30761fae22");
		
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

	public static void main(String[] args) throws IOException {

		System.out.println(Json());

	}
}

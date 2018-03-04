package com.apk.clima;

import java.io.FileReader;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class TrataJsonCidadeUmDia {

	public static String passaMain(String recebeJsonCidadeDia) {

		JSONParser parser = new JSONParser();
		WeatherDoDia clima = new WeatherDoDia();

		try {

			JSONArray json = (JSONArray) parser.parse(recebeJsonCidadeDia);

			for (Object jsons : json) {

				JSONObject weather = (JSONObject) jsons;

				clima.setWeather(weather.get("weather").toString());

				JSONObject weatherObject = (JSONObject) weather.get("weather");

				clima.setMain(weatherObject.get("main").toString());

			}

		} catch (Exception e) {

		}

		return clima.getMain();

	}

	public static String passaDescription(String recebeJsonCidadeDia) {

		JSONParser parser = new JSONParser();
		WeatherDoDia clima = new WeatherDoDia();

		try {

			JSONArray json = (JSONArray) parser.parse(recebeJsonCidadeDia);

			for (Object jsons : json) {

				JSONObject weather = (JSONObject) jsons;

				clima.setWeather(weather.get("weather").toString());

				JSONObject weatherObject = (JSONObject) weather.get("weather");

				clima.setDescription(weatherObject.get("description").toString());

			}

		} catch (Exception e) {

		}

		return clima.getDescription();

	}

	public static String passaIcon(String recebeJsonCidadeDia) {

		JSONParser parser = new JSONParser();
		WeatherDoDia clima = new WeatherDoDia();

		try {

			JSONArray json = (JSONArray) parser.parse(recebeJsonCidadeDia);

			for (Object jsons : json) {

				JSONObject weather = (JSONObject) jsons;

				clima.setWeather(weather.get("weather").toString());

				JSONObject weatherObject = (JSONObject) weather.get("weather");

				clima.setIcon(weatherObject.get("icon").toString());

			}

		} catch (Exception e) {

		}

		return clima.getIcon();

	}

	public static String passaTemp(String recebeJsonCidadeDia) {

		JSONParser parser = new JSONParser();
		WeatherDoDia clima = new WeatherDoDia();
		
		try {
			
			JSONArray json = (JSONArray) recebeJsonCidadeDia;
			
			for (Object jsons : json) {
				
				Double converteTemp;

				JSONObject weather = (JSONObject) jsons;

				clima.setMainObject(weather.get("main").toString());

				JSONObject mainObject = (JSONObject) weather.get("main");

				clima.setTemp(mainObject.get("temp").toString());
				
				converteTemp = Double.parseDouble(clima.getTemp());
				
				converteTemp -= 273.15;
								
				clima.setTemp(converteTemp.toString());

			}

		} catch (Exception e) {

		}

		return clima.getTemp();

	}
	
	public static String passaTempMin(String recebeJsonCidadeDia) {

		JSONParser parser = new JSONParser();
		WeatherDoDia clima = new WeatherDoDia();

		try {

			JSONArray json = (JSONArray) parser.parse(recebeJsonCidadeDia);

			for (Object jsons : json) {
				
				Double converteTemp;

				JSONObject weather = (JSONObject) jsons;

				clima.setMainObject(weather.get("main").toString());

				JSONObject mainObject = (JSONObject) weather.get("main");

				clima.setTempMin(mainObject.get("temp_min").toString());
				
				converteTemp = Double.parseDouble(clima.getTempMin());
				
				converteTemp -= 273.15;
				
				clima.setTempMin(converteTemp.toString());

			}

		} catch (Exception e) {

		}

		return clima.getTempMin();

	}
	
	public static String passaTempMax(String recebeJsonCidadeDia) {

		JSONParser parser = new JSONParser();
		WeatherDoDia clima = new WeatherDoDia();

		try {

			JSONArray json = (JSONArray) parser.parse(recebeJsonCidadeDia);

			for (Object jsons : json) {
				
				Double converteTemp;

				JSONObject weather = (JSONObject) jsons;

				clima.setMainObject(weather.get("main").toString());

				JSONObject mainObject = (JSONObject) weather.get("main");

				clima.setTempMax(mainObject.get("temp_max").toString());
				
				converteTemp = Double.parseDouble(clima.getTempMax());
				
				converteTemp -= 273.15;
				
				clima.setTempMax(converteTemp.toString());

			}

		} catch (Exception e) {

		}

		return clima.getTempMax();

	}

}

package com.apk.clima;

import java.text.DecimalFormat;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class TrataJsonForecast {
	
	public static String passaTemp(String recebeJsonForecast) {

		JSONParser parser = new JSONParser();
		WeatherForecast clima = new WeatherForecast();
		DecimalFormat formatacao = new DecimalFormat("#0.00");

		try {

			JSONObject json = (JSONObject) parser.parse(recebeJsonForecast);

			JSONObject list = (JSONObject) json.get("list");

			Double converteTemp;

			clima.setMain(list.get("main").toString());
			clima.setTemp(list.get("temp").toString());

			converteTemp = Double.parseDouble(clima.getTemp());

			converteTemp -= 273.15;

			clima.setTemp(formatacao.format(converteTemp).toString());

		} catch (Exception e) {

		}

		return clima.getTemp();

	}
	
	public static String passaTempMin(String recebeJsonForecast) {

		JSONParser parser = new JSONParser();
		WeatherForecast clima = new WeatherForecast();
		DecimalFormat formatacao = new DecimalFormat("#0.00");

		try {

			JSONObject json = (JSONObject) parser.parse(recebeJsonForecast);

			JSONObject list = (JSONObject) json.get("list");

			Double converteTemp;

			clima.setMain(list.get("main").toString());
			clima.setTempMin(list.get("temp_min").toString());

			converteTemp = Double.parseDouble(clima.getTempMin());

			converteTemp -= 273.15;

			clima.setTempMin(formatacao.format(converteTemp).toString());

		} catch (Exception e) {

		}

		return clima.getTempMin();

	}
	
	public static String passaTempMax(String recebeJsonForecast) {

		JSONParser parser = new JSONParser();
		WeatherForecast clima = new WeatherForecast();
		DecimalFormat formatacao = new DecimalFormat("#0.00");

		try {

			JSONObject json = (JSONObject) parser.parse(recebeJsonForecast);

			JSONObject list = (JSONObject) json.get("list");

			Double converteTemp;

			clima.setMain(list.get("main").toString());
			clima.setTempMax(list.get("temp_max").toString());

			converteTemp = Double.parseDouble(clima.getTempMin());

			converteTemp -= 273.15;

			clima.setTempMax(formatacao.format(converteTemp).toString());

		} catch (Exception e) {

		}

		return clima.getTempMax();

	}
	
	public static String passaIcon(String recebeJsonWeather) {

		JSONParser parser = new JSONParser();
		WeatherForecast clima = new WeatherForecast();

		try {

			JSONArray json = (JSONArray) parser.parse(recebeJsonWeather);

			for (Object jsons : json) {
				
				JSONObject list = (JSONObject) jsons;
				
				clima.setList(list.get("list").toString());

				JSONObject weather = (JSONObject) list.get("list");

				clima.setWeather(weather.get("weather").toString());

				JSONObject icon = (JSONObject) weather.get("icon");

				clima.setIcon(icon.get("icon").toString());

			}

		} catch (Exception e) {

		}

		return clima.getIcon();

	}
	
	public static String passaDtTxt(String recebeJsonWeather) {

		JSONParser parser = new JSONParser();
		WeatherForecast clima = new WeatherForecast();

		try {

			JSONArray json = (JSONArray) parser.parse(recebeJsonWeather);

			for (Object jsons : json) {
				
				JSONObject list = (JSONObject) jsons;
				
				clima.setList(list.get("list").toString());

				JSONObject dtTxt = (JSONObject) list.get("list");

				clima.setDttxt(dtTxt.get("dt_txt").toString());

			}

		} catch (Exception e) {

		}

		return clima.getDttxt();

	}

}

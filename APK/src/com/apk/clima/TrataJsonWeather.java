package com.apk.clima;

import java.text.DecimalFormat;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class TrataJsonWeather {

	public static String passaMain(String recebeJsonWeather) {

		JSONParser parser = new JSONParser();
		WeatherDoDia clima = new WeatherDoDia();

		try {

			JSONArray json = (JSONArray) parser.parse(recebeJsonWeather);

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

	public static String passaDescription(String recebeJsonWeather) {

		JSONParser parser = new JSONParser();
		WeatherDoDia clima = new WeatherDoDia();

		try {

			JSONArray json = (JSONArray) parser.parse(recebeJsonWeather);

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

	public static String passaIcon(String recebeJsonWeather) {

		JSONParser parser = new JSONParser();
		WeatherDoDia clima = new WeatherDoDia();

		try {

			JSONArray json = (JSONArray) parser.parse(recebeJsonWeather);

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

	public static String passaTemp(String recebeJsonWeather) {

		JSONParser parser = new JSONParser();
		WeatherDoDia clima = new WeatherDoDia();
		DecimalFormat formatacao = new DecimalFormat("#0.00");

		try {

			JSONObject json = (JSONObject) parser.parse(recebeJsonWeather);

			JSONObject main = (JSONObject) json.get("main");

			Double converteTemp;

			clima.setTemp(main.get("temp").toString());

			converteTemp = Double.parseDouble(clima.getTemp());

			converteTemp -= 273.15;

			clima.setTemp(formatacao.format(converteTemp).toString());

		} catch (Exception e) {

		}

		return clima.getTemp();

	}

	public static String passaTempMin(String recebeJsonWeather) {

		JSONParser parser = new JSONParser();
		WeatherDoDia clima = new WeatherDoDia();
		DecimalFormat formatacao = new DecimalFormat("#0.00");

		try {

			JSONObject json = (JSONObject) parser.parse(recebeJsonWeather);

			JSONObject main = (JSONObject) json.get("main");

			Double converteTemp;

			clima.setTempMin(main.get("temp_min").toString());

			converteTemp = Double.parseDouble(clima.getTempMin());

			converteTemp -= 273.15;

			clima.setTempMin(formatacao.format(converteTemp).toString());

		} catch (Exception e) {

		}

		return clima.getTempMin();

	}

	public static String passaTempMax(String recebeJsonWeather) {

		JSONParser parser = new JSONParser();
		WeatherDoDia clima = new WeatherDoDia();
		DecimalFormat formatacao = new DecimalFormat("#0.00");

		try {

			JSONObject json = (JSONObject) parser.parse(recebeJsonWeather);

			JSONObject main = (JSONObject) json.get("main");

			double converteTemp;

			clima.setTempMax(main.get("temp_max").toString());

			converteTemp = Double.parseDouble(clima.getTempMax());

			converteTemp -= 273.15;
			
			clima.setTempMax(formatacao.format(converteTemp).toString());
			
		} catch (Exception e) {

		}

		return clima.getTempMax().toString();

	}

}

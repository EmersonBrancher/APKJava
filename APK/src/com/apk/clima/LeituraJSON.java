package com.apk.clima;

import java.io.FileReader;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class LeituraJSON {

	public static String leJsonCidade(String nomeCidade) {

		JSONParser parser = new JSONParser();
		Cidade cidade = new Cidade();
		String diretorioJsonCidade = System.getProperty("user.dir");

		try {

			FileReader file = new FileReader(diretorioJsonCidade + "/Files/city.list.json");

			JSONArray json = (JSONArray) parser.parse(file);

			for (Object jsons : json) {

				JSONObject city = (JSONObject) jsons;

				cidade.setId(city.get("id").toString());
				cidade.setName(city.get("name").toString().toLowerCase());

				if (nomeCidade.equals(cidade.getName())) {

					break;

				}

			}

		} catch (Exception e) {
			
		}

		return cidade.getId();

	}

}

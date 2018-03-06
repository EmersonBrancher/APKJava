package com.apk.clima;

import java.io.IOException;

import com.apk.clima.PrimeiroLogin;

public class MainActivity {

	public static void main(String[] args) {

		boolean primeiroLogin = true;
		
		String passaInformacaoCidade = "";
		String temp;
		String tempMin;
		String tempMax;
		String icone;
		String nome;

		if (primeiroLogin = true) {

			try {

				primeiroLogin = PrimeiroLogin.verificaPrimeiroLogin(primeiroLogin);
				passaInformacaoCidade = PrimeiroLogin.primeiraCidade(passaInformacaoCidade);		
				passaInformacaoCidade = LeituraJSON.leJsonCidade(passaInformacaoCidade);		
				passaInformacaoCidade = ConectaWeather.Json(passaInformacaoCidade);
				
				temp = TrataJsonWeather.passaTemp(passaInformacaoCidade);
				tempMin = TrataJsonWeather.passaTempMin(passaInformacaoCidade);
				tempMax = TrataJsonWeather.passaTempMax(passaInformacaoCidade);
				
				
				System.out.println("Temperatura atual: " + temp + "�C");
				System.out.println("Temperatura Minima: " + tempMin + "�C");
				System.out.println("Temperatura M�xima: " + tempMax + "�C");
				

			} catch (IOException e) {

				e.printStackTrace();

			}
		}

	}

}

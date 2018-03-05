package com.apk.clima;

import java.io.IOException;

import com.apk.clima.PrimeiroLogin;

public class MainActivity {

	public static void main(String[] args) {

		String passaInformacaoCidade = "";

		boolean primeiroLogin = true;
		
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
				passaInformacaoCidade = Conecta.Json(passaInformacaoCidade);
				
				System.out.println(passaInformacaoCidade);
				
				temp = TrataJsonCidadeUmDia.passaTemp(passaInformacaoCidade);
				tempMin = TrataJsonCidadeUmDia.passaTempMin(passaInformacaoCidade);
				tempMax = TrataJsonCidadeUmDia.passaTempMax(passaInformacaoCidade);
				
				
				System.out.println(temp + "ºC");
				System.out.println(tempMin + "ºC");
				System.out.println(tempMax + "ºC");
				

			} catch (IOException e) {

				e.printStackTrace();

			}
		}

	}

}

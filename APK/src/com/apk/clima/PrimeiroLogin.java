package com.apk.clima;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class PrimeiroLogin {
	
	public static String primeiraCidade(String primeiraCidade) throws IOException {
				
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
			
		System.out.println("Olá,bem vindo ao OpenWeatherApp.");
		System.out.println("Poderia nos informar de onde você é para continuarmos para o aplicativo?");
		
		primeiraCidade = teclado.readLine().toLowerCase();
	
		return primeiraCidade;
		
	}
	
	public static boolean verificaPrimeiroLogin(boolean primeiroLogin) {
		
		primeiroLogin = (primeiroLogin == true) ? false : true;
		
		return primeiroLogin;
		
	}
}

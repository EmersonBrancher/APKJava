package com.apk.clima;

import java.io.IOException;

import com.apk.clima.PrimeiroLogin;

public class MainActivity {

	public static void main(String[] args) {

		String passaCidadeClasse = "";

		boolean primeiroLogin = true;

		if (primeiroLogin = true) {

			try {

				PrimeiroLogin.verificaPrimeiroLogin(primeiroLogin);
				passaCidadeClasse = PrimeiroLogin.primeiraCidade(passaCidadeClasse);		
				passaCidadeClasse = LeituraJSON.leJSON(passaCidadeClasse);
				
				

			} catch (IOException e) {

				e.printStackTrace();

			}
		}

	}

}

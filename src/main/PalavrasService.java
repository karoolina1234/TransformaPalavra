package main;

import java.util.Scanner;

public class PalavrasService {
	Scanner entrada = new Scanner(System.in);

	public String transforma(String palavra) {
		String novaPalavra = palavra.replace("a", "");
		novaPalavra = novaPalavra.replace("A", "");
		novaPalavra = novaPalavra.replace("á", "");
		return novaPalavra;
	}

	public String transformaV2(String palavra, String letra) {
		String novaPalavra = palavra.replace(letra, "");
		return novaPalavra;

	}

	public String encontraLetra() {
		System.out.println("digite uma letra");
		String letraDigitada = entrada.next();
		char letraEncontrada = letraDigitada.charAt(0);
		String letra = Character.toString(letraEncontrada);
		return letra;
	}

}

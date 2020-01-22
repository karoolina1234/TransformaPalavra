package main;

import java.util.Scanner;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

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
	
	public String encontraPalavra() {
		System.out.println("digite uma palavra");
		String palavraDigitada = entrada.next();
		return palavraDigitada;
	}

	public String encriptar(String palavra) {
		byte[] encrypted = null;
		try {
			String text = palavra;
			String key = "Bar12345Bar12345"; // 128 bit key
			// Create key and cipher
			Key aesKey = new SecretKeySpec(key.getBytes(), "AES");
			Cipher cipher = Cipher.getInstance("AES");
			// encrypt the text
			cipher.init(Cipher.ENCRYPT_MODE, aesKey);
			encrypted = cipher.doFinal(text.getBytes());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new String(encrypted);
	}

	public String descriptar(String palavraCriptografada) {
		String decrypted = null;
		try {
			String key = "Bar12345Bar12345"; // 128 bit key
			// Create key and cipher
			Key aesKey = new SecretKeySpec(key.getBytes(), "AES");
			Cipher cipher = Cipher.getInstance("AES");
			// now convert the string to byte array for decryption
			byte[] bb = new byte[palavraCriptografada.length()];
			for (int i = 0; i < palavraCriptografada.length(); i++) {
				bb[i] = (byte) palavraCriptografada.charAt(i);
			}

			// decrypt the text
			cipher.init(Cipher.DECRYPT_MODE, aesKey);
			decrypted = new String(cipher.doFinal(bb));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new String(decrypted);
	}

}

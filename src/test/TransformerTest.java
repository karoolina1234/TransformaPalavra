package test;

import static org.junit.Assert.assertEquals;


import org.junit.Test;

public class TransformerTest {
	
	String banana = "Banana";
	String coliseu = "Coliseu";
	String Ananas = "Ananás";
	String Sonic = "Sonic";
	String Paralelepipedo = "Paralelepipedo";
	
	@Test
	public void deveRemoverLetraADaBanana() {
		
		String resultado;

		resultado = transforma(banana);

		assertEquals("Bnn", resultado);
	}

	@Test
	public void deveRemoverLetraADaBananaEColiseu() {
		

		String resultado = transforma(banana);
		String resultado2 = transforma(coliseu);

		assertEquals("Bnn", resultado);
		assertEquals("Coliseu", resultado2);

	}

	@Test
	public void deveRemoverLetraADaBananaEColiseuEAnanas() {
		
		String resultado = transforma(banana);
		String resultado2 = transforma(coliseu);
		String resultado3 = transforma(Ananas);
		
		assertEquals("Bnn", resultado);
		assertEquals("Coliseu", resultado2);
		assertEquals("nns", resultado3);


	}

	@Test
	public void deveRemoverLetraADaBananaEColiseuEAnanasESonic() {
		
		String resultado = transforma(banana);
		String resultado2 = transforma(coliseu);
		String resultado3 = transforma(Ananas);
		String resultado4 = transforma(Sonic);
		
		assertEquals("Bnn", resultado);
		assertEquals("Coliseu", resultado2);
		assertEquals("nns", resultado3);
		assertEquals("Sonic", resultado4);


	}
	
	@Test
	public void deveRemoverLetraADaBananaEColiseuEAnanasESonicEParalelepipedo() {
		
		String resultado = transforma(banana);
		String resultado2 = transforma(coliseu);
		String resultado3 = transforma(Ananas);
		String resultado4 = transforma(Sonic);
		String resultado5 = transforma(Paralelepipedo);
		
		assertEquals("Bnn", resultado);
		assertEquals("Coliseu", resultado2);
		assertEquals("nns", resultado3);
		assertEquals("Sonic", resultado4);
		assertEquals("Prlelepipedo", resultado5);


	}
	public String transforma(String palavra) {
		String novaPalavra = palavra.replace("a", "");
		novaPalavra = novaPalavra.replace("A", "");
		novaPalavra = novaPalavra.replace("á", "");
		return novaPalavra;
	}
}

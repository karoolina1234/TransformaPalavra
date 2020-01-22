package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.mockito.Mockito;

import main.Palavras;
import main.PalavrasService;

public class TransformaPalavraTest {
	Palavras palavras = new Palavras();
	PalavrasService service = new PalavrasService();

	@Test
	public void deveRemoverLetraADaBanana() {

		String resultado;

		resultado = service.transforma(palavras.getBanana());

		assertEquals("Bnn", resultado);
	}

	@Test
	public void deveRemoverLetraADaBananaEColiseu() {

		String resultado = service.transforma(palavras.getBanana());
		String resultado2 = service.transforma(palavras.getColiseu());

		assertEquals("Bnn", resultado);
		assertEquals("Coliseu", resultado2);

	}

	@Test
	public void deveRemoverLetraADaBananaEColiseuEAnanas() {

		String resultado = service.transforma(palavras.getBanana());
		String resultado2 = service.transforma(palavras.getColiseu());
		String resultado3 = service.transforma(palavras.getAnanas());

		assertEquals("Bnn", resultado);
		assertEquals("Coliseu", resultado2);
		assertEquals("nns", resultado3);

	}

	@Test
	public void deveRemoverLetraADaBananaEColiseuEAnanasESonic() {

		String resultado = service.transforma(palavras.getBanana());
		String resultado2 = service.transforma(palavras.getColiseu());
		String resultado3 = service.transforma(palavras.getAnanas());
		String resultado4 = service.transforma(palavras.getSonic());

		assertEquals("Bnn", resultado);
		assertEquals("Coliseu", resultado2);
		assertEquals("nns", resultado3);
		assertEquals("Sonic", resultado4);

	}

	@Test
	public void deveRemoverLetraADaBananaEColiseuEAnanasESonicEParalelepipedo() {

		String resultado1 = service.transforma(palavras.getBanana());
		String resultado2 = service.transforma(palavras.getColiseu());
		String resultado3 = service.transforma(palavras.getAnanas());
		String resultado4 = service.transforma(palavras.getSonic());
		String resultado5 = service.transforma(palavras.getParalelepipedo());

		assertEquals("Bnn", resultado1);
		assertEquals("Coliseu", resultado2);
		assertEquals("nns", resultado3);
		assertEquals("Sonic", resultado4);
		assertEquals("Prlelepipedo", resultado5);

	}

	// Testes v2

	@Test
	public void deveRemoverLetraEscolhidaDaBanana() {

		String resultado = palavras.getBanana();

		PalavrasService service1 = Mockito.spy(service);

		Mockito.doReturn("n").when(service1).encontraLetra();

		String novaLetra = service1.encontraLetra();

		resultado = service.transformaV2(resultado, novaLetra);

		assertEquals("n", novaLetra);
		assertEquals("Baaa", resultado);
	}
	
	

}

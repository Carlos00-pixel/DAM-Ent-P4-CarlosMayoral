package test.java.liceosorolla;
import org.junit.Before;
import org.junit.Test;

import main.java.liceosorolla.Numero;
import static org.junit.Assert.assertEquals;

public class NumeroTest {
	private Numero numero;
	
	@Before
	public void before() {
		numero = new Numero(6,4);
	}
	
	@Test
	public void compruebaNumero1() {
		assertEquals(6,numero.getNum1());
	}
	
	@Test
	public void compruebaNumero2() {
		assertEquals(4,numero.getNum2());
	}
	
	@Test
	public void compruebaSuma() {
		assertEquals(10,numero.calculaSuma());
	}
	
	@Test
	public void compruebaResta() {
		assertEquals(2,numero.calculaResta());
	}
	
	@Test
	public void compruebaMultiplicacion() {
		assertEquals(24,numero.calculaMultiplicacion());
	}
	
	@Test
	public void compruebaDivision() {
		assertEquals(1,numero.calculaDivision());
	}
	
	@Test
	public void compruebaPotencia() {
		assertEquals(4096,numero.calculaPotencia());
	}
	@Test
	public void compruebaMultiplo() {
		assertEquals(false,numero.calculaMultiplos());
	}
}



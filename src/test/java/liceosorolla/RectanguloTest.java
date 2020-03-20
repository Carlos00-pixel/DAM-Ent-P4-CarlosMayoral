package src.test.java.liceosorolla;

import org.junit.Before;
import org.junit.Test;
import src.main.java.liceosorolla.Rectangulo;
import static org.junit.Assert.assertEquals;

public class RectanguloTest {

	private Rectangulo rectangulo;

	@Before
	public void Before() {

		rectangulo = new Rectangulo(5, 6);

	}

	@Test
	public void comprobarCuadrado() {

		assertEquals(false, rectangulo.esCuadrado());
	}

	@Test
	public void comprobarPerimetro() {

		assertEquals(22, rectangulo.perimetro());
	}

	@Test
	public void comprobarArea() {

		assertEquals(30, rectangulo.area());
	}

	@Test
	public void comprobarDiagonal() {

		assertEquals(7, rectangulo.diagonal());
	}

	@Test
	public void comprobarRadioCircunferencia() {

		assertEquals(2, rectangulo.circunferencia());
	}

}

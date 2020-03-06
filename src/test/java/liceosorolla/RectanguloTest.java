package test.java.liceosorolla;
import org.junit.Before;
import org.junit.Test;
import main.java.liceosorolla.Rectangulo;
import static org.junit.Assert.assertEquals;

public class RectanguloTest {
	
	private Rectangulo rectangulo;
	
	@Before
	public void Before() {
		
		rectangulo = new Rectangulo(5,5);
		
	}
	
	@Test
	public void comprobarCuadrado() {
		
		assertEquals(true,rectangulo.esCuadrado());
	}

}

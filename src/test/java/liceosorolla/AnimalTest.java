package src.test.java.liceosorolla;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import src.main.java.liceosorolla.Animal;

public class AnimalTest {
	
	private Animal animal;
	
	
	@Before
	public void Before() {
		
		animal = new Animal ("mamifero","gato",4.5,2,"negro");
	}
	
	@Test
	public void comprobarEspecie() {
		
		assertEquals("mamifero", animal.getEspecie());
		
	}
	
	@Test
	public void comprobarRaza() {
		
		assertEquals("gato", animal.getRaza());
		
	}
	
	@Test
	public void comprobarPeso() {
		
		assertEquals(4,5, animal.getPeso());
		
	}
	
	@Test
	public void comprobarEdad() {
		
		assertEquals(2, animal.getEdad());
		
	}
	
	@Test
	public void comprobarPelo() {
		
		assertEquals("negro", animal.getColorPelo());
		
	}
}

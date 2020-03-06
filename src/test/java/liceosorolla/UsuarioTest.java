package test.java.liceosorolla;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import org.junit.Before;
import org.junit.Test;

import main.java.liceosorolla.Usuario;

public class UsuarioTest {
	
	private Usuario usuario;
	
	@Before
	public void before() {
		usuario = new Usuario("Alejandro", "Tontin Tonton", LocalDate.of(2000,1,10), "06029725R");
	}
	
	@Test
	public void compruebaNombre() {
		assertEquals("Alejandro", usuario.getNombre());
	}
	
	@Test
	public void compruebaApellidos() {
		assertEquals("Tontin Tonton", usuario.getApellidos());
	}
	
	@Test
	public void compruebaNombreCompleta() {
		
		assertEquals("Alejandro Tontin Tonton", usuario.nombreCompleto());
	}
	
	@Test
	public void compruebaMayoriaDeEdad() {
		assertEquals(true, usuario.mayoriaDeEdad());
	}
	
	@Test
	public void compruebaIdentificador() {
		
		assertEquals("06029725R", usuario.getIdentificador());
	}
	
	@Test
	public void compruebaNombreMayusculas() {
		
		assertEquals("ALEJANDRO", usuario.nombreMayusculas());
	}
	
	@Test
	public void compruebaNombreMinusculas() {
		
		assertEquals("alejandro", usuario.nombreMinisculas());
	}
}

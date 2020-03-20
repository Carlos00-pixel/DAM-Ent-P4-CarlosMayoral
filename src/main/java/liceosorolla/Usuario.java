package src.main.java.liceosorolla;
import java.time.LocalDate;
import java.time.Year;

public class Usuario {
	
	private String nombre;
	private String apellidos;
	private LocalDate fechaNacimiento;
	private String identificador;
	
	public Usuario(String nombre, String apellidos, LocalDate fechaNacimiento, String identificador) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fechaNacimiento = fechaNacimiento;
		this.identificador = identificador;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellidos() {
		return apellidos;
	}
	
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	public String getIdentificador() {
		return identificador;
	}
	
	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}
	
	public String toString() {
		return "Usuario [nombre=" + nombre + ", apellidos=" + apellidos + ", fechaNacimiento=" + fechaNacimiento
				+ ", identificador=" + identificador + "]";
	}

	public String nombreCompleto() {
		return this.nombre + " " + this.apellidos;
		
	}
	
	public boolean mayoriaDeEdad() {
		
		boolean edad = true;
		
		if(Year.now().getValue() -18 >= fechaNacimiento.getYear()) {
			edad=true;
		}else {
			edad=false;
		}
		return edad;
	}
	
	public String nombreMayusculas() {
		return this.nombre.toUpperCase();
	}
	
	public String nombreMinisculas() {
		return this.nombre.toLowerCase();
	}
	
	public String nombreCompletoMayus() {
		return this.nombre.toUpperCase() + " " + this.apellidos.toUpperCase();
		
	}

	public String nombreCompletoMinus() {
		return this.nombre.toLowerCase() + " " + this.apellidos.toLowerCase();
		
	}
}

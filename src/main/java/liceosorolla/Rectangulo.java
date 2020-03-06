package main.java.liceosorolla;

public class Rectangulo {
	
	private int lado1;
	private int lado2;
	

	public Rectangulo(int lado1, int lado2) {
		this.lado1 = lado1;
		this.lado2 = lado2;
	}

	public String toString() {
		return "lado1 " + lado1 + ", lado2 " + lado2;
	}

	public int getLado1() {
		return lado1;
	}
	public void setLado1(int lado1) {
		this.lado1 = lado1;
	}
	public int getLado2() {
		return lado2;
	}
	public void setLado2(int lado2) {
		this.lado2 = lado2;
	}
	
	public boolean esCuadrado() {
		boolean comprobar = false;
		
			if(this.lado1==this.lado2) {
				
				comprobar = true;
			}
		
		return comprobar;
	}
	
	public int perimetro() {
		int perimetro=0;
	
		perimetro = (this.lado1 + this.lado2)*2;
		
		return perimetro;
	}
	
	public int area() {
		int area=0;
	
		area = this.lado1 * this.lado2;
		
		return area;
	}

}

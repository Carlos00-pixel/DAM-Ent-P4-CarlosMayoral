package src.main.java.liceosorolla;

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
	
	public int diagonal() {
		int diagonal=0;
	
		diagonal = (int) (Math.pow(this.lado1, 2) + Math.pow(this.lado2, 2));
		
		return  (int) Math.sqrt(diagonal);
	}
	
	public int circunferencia() {
		int ladoCorto = 0;
		int radio=0;
		
		if(this.lado1 > this.lado2) {
			
			ladoCorto = lado2;
			
		}else ladoCorto = lado1;
		
		radio = ladoCorto / 2;
		
		return radio;
	}

}

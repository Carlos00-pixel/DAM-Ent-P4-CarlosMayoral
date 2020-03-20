package src.main.java.liceosorolla;

public class Numero {
	
	private int num1 = 0;
	private int num2 = 0;
	
	public Numero(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}
	
	public String comprobarNum1(){
		String resultado;
		if (Character.isDigit(this.num1))
		    resultado = "El caracter es un numero";
		else
		    resultado = "El caracter no es un numero";
		
		return resultado;
	}
	
	public String comprobarNum2(){
		String resultado;
		if (Character.isDigit(this.num2))
		    resultado = "El caracter es un numero";
		else
		    resultado = "El caracter no es un numero";
		
		return resultado;
	}
	
	
	public int calculaSuma() {
		int resultado = 0;
		resultado = num1 + num2;
		return resultado; 
	}
	
	public int calculaResta() {
		int resultado = 0;
		resultado = num1 - num2;
		return resultado; 
	}
	
	public int calculaMultiplicacion() {
		int resultado = 0;
		resultado = num1 * num2;
		return resultado; 
	}
	
	public int calculaDivision() {
		int resultado = 0;
		resultado = num1 / num2;
		return resultado; 
	}
	
	public int calculaPotencia() {
		int resultado = 1;
		for(int i = 1; i <= this.num1; i++) {
			resultado = resultado * this.num2;
		}
		return resultado; 
	}
	
	public boolean calculaMultiplos() {
		int mayor,menor;
		if(num1>num2) {
			mayor = num1;
			menor = num2;
		} else {
			mayor = num2;
			menor = num1;
		}
		
		if(mayor % menor==0){
            return true; 
          }
          else{
            return false;
          }	
	}
	
	
	
	
}

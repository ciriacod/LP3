package Actividad_4;

public class Cuenta {
	private int numero;
	private double saldo;
	
	public Cuenta(int numero, double saldo) {
		this.numero = numero;
		this.saldo = saldo;
	}
	public Cuenta(int numero) {
		this(numero,0);
	}
	
	//Setters and Getters
	
	public void setNumCuenta(int numero) {
		this.numero = numero;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public int getCuenta() {
		return this.getCuenta();
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public String toString() {
		return "Numero: " + numero + " Saldo: " + saldo; 
	}
}

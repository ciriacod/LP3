package Actividad_3;

public class Automovil {
	private String placa;
	private int numPuertas;
	private String marca;
	private String modelo;
	private Motor motor;
	
	public Automovil(String placa, int nPuertas, String marca, String modelo) {
		this.placa = placa;
		this.numPuertas = nPuertas;
		this.marca = marca;
		this.modelo = modelo;
	}
	
	//Setters and Getters
	
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	public void setNumPuertas(int numPuertas) {
		this.numPuertas = numPuertas;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public void setMotor(Motor motor) {
		this.motor = motor;
	}
	
	public String getPlaca() {
		return this.placa;
	}
	
	public int getNumPuertas() {
		return this.numPuertas;
	}
	
	public String getMarca() {
		return this.marca;
	}
	
	public String getModelo() {
		return this.modelo;
	}
	
	public String toString() {
		if(this.motor == null) {
			return "x";
		} else {
			return "Automovil - Placa: " + placa + " Modelo: " + modelo + " Marca: "+ marca + " numPuertas: " + numPuertas + " Motor: " + motor.toString();
		}
	}

}
package Actividad_1;

public class Coche {
	// Atributos
	private String modelo;
	private String marca;
	private int anioFabricacion;
	private double precio;
	private boolean enMarcha;
	// Constructor
	public Coche(String modelo, int velocidadMaxima, int potenciaMotor) {
		this.modelo = modelo;
		this.enMarcha = false;
	}
	public Coche() {
		this.setMarca("Marca Predeterminana");
		this.modelo = "Modelo Predeterminado";
		this.anioFabricacion = 2000;
		this.precio = 0;
		this.enMarcha = false;
	}
	public Coche(String marca, String modelo, int anioFabricacion, double precio) {
		this.setMarca(marca);
		this.modelo = modelo;
		this.anioFabricacion = anioFabricacion;
		this.precio = precio;
		this.enMarcha = false;
	}
	
	//Setters
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	//Getters
	public String getModelo() {
		return this.modelo;
	}
	public double getPrecio() {
		return this.precio;
	}
	public String getMarca() {
		return marca;
	}
	// Metodos
	public void acelerar() {
		if (enMarcha) {
			System.out.println("El coche " + modelo + " esta acelerando.");
		} else {
			System.out.println("Primero enciende el coche.");
			}
		}
	public void frenar() {
		if (enMarcha) {
			System.out.println("El coche " + modelo + " esta frenando.");
		} else {
			System.out.println("El coche esta apagado, no se puede frenar.");
		}
	}
	public void encender() {
		enMarcha = true;
		System.out.println("El coche " + modelo + " se ha encendido.");
	}
	public void apagar() {
		enMarcha = false;
		System.out.println("El coche " + modelo + " se ha apagado.");
	}
	public void aplicarDescuento() {
		if(anioFabricacion < 2010) {
			this.precio = this.precio-this.precio*10/100;
			System.out.println("Se aplico un descuento");
		} else {
			System.out.println("No se aplico un descuento");
		}
	}

}
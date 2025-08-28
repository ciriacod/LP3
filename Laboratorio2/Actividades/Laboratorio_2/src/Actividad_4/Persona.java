package Actividad_4;

public class Persona {
	private int id;
	private String nombre;
	private String apellido;
	private Cuenta cuenta;
	
	public Persona(int id, String nombre, String apellido, int numero) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.cuenta = new Cuenta(numero);
	}
	
	//Setters and Getters
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public int getId() {
		return this.id;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public String getApellido() {
		return this.apellido;
	}
	
	public String toString() {
		return "ID: " + id + " Nombre: " + nombre + " Apellido: " + apellido + "Cuenta: " + cuenta.toString();
	}

}
package Actividad_1;

public class EjemploCoche {

	public static void main(String[] args) {
		Coche cocheDeportivo = new Coche("Ferrari","F80",2024,120000);
		Coche cocheTodoTerreno = new Coche("Suzuki","Jimmy", 2024,30000);
		
		cocheDeportivo.encender();
		cocheTodoTerreno.encender();
		
		cocheDeportivo.acelerar();
		cocheTodoTerreno.acelerar();

		cocheDeportivo.frenar();
		cocheTodoTerreno.frenar();

		cocheDeportivo.apagar();
		cocheTodoTerreno.apagar();
		
	}

}

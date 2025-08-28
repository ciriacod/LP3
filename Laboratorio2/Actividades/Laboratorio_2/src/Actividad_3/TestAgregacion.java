package Actividad_3;

public class TestAgregacion {
	
	public static void main(String[] args) {
		Motor mk1 = new Motor(1000,20);
		Automovil car1 = new Automovil("21X-485", 4, "Nissan", "AD");
		car1.setMotor(mk1);
		System.out.println(car1.toString());
	}

}

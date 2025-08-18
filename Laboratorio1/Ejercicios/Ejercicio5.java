import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de horas en el estacionamiento:");
        int ingreso = scanner.nextInt();
        double cargoCalculado = calcularCargo(ingreso);
        System.out.println("El cargo es: " + cargoCalculado );
        
        scanner.close();
    }

    public static double calcularCargo(int hora){
        double cargo = 3 + ((hora-1)*0.5);
        if (cargo > 12){
            cargo = 12;
        }
        return cargo;
    }
}

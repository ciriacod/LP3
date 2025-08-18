import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scannf = new Scanner(System.in);

        int h = InValiHoras(scannf);
        int m = InValiMinutos(scannf);
        int s = InValiSegundos(scannf);

        int segundosTotal = HoraenSegundos(h, m, s);
        System.out.println("Los segundos totales son: " + segundosTotal);

        scannf.close();
    }

    public static int InValiHoras(Scanner scannf){
        int hora = -1;
        while (hora > 23 || hora < 0){
            System.out.println("Ingrese las horas (0-23):");
            hora = scannf.nextInt();
        }
        return hora;
    }

    public static int InValiMinutos(Scanner scannf){
        int minuto = -1;
        while (minuto > 59 || minuto < 0){
            System.out.println("Ingrese los minutos (0-59):");
            minuto = scannf.nextInt();
        }
        return minuto;
    }

    public static int InValiSegundos(Scanner scannf){
        int segundo = -1;
        while (segundo > 59 || segundo < 0){
            System.out.println("Ingrese los segundos (0-59):");
            segundo = scannf.nextInt();
        }
        return segundo;
    }

    public static int HoraenSegundos(int h,int m, int s){
        return h*3600 + m*60 + s;
    }
}

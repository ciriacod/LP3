import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        int[] arr = new int[10];
        int ingreso = 0;
        int prev = 0;

        for(int i = 0; i < 10 ; i++){    
            while(ingreso <= prev){
                System.out.println("Ingrese el elemento " + (i+1)+ " del arreglo");
                ingreso = scann.nextInt();
            }
            arr[i] = ingreso;
            prev = ingreso;
        }

        for(int i : arr){
            System.out.print(i + " ");
        }
        
        scann.close();
    }
}
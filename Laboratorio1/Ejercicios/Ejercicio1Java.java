public class Ejercicio1Java {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};
        int Suma = SumaArreglo(arr);

        System.out.println(Suma);

    }

    public static int SumaArreglo(int[] arreglo){
        int sum = 0;

        for (int i : arreglo){
            sum += i;
        }

        return sum;
    }
}
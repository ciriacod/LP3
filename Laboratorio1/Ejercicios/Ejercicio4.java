public class Ejercicio4 {
    public static void main(String[] args) {
        System.out.println(Menor(0.584, 0.00548, 0.09999));
    }
    
    public static double Menor(double a,double b,double c){
        double menor;

        if(a < b && a < c){
            menor = a;
        } else if (b < a && b < c){
            menor = b;
        } else if (c < a && c < b){
            menor = c;
        } else { menor = 0;}

        return menor;
    }
}

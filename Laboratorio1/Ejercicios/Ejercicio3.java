import java.util.Random;

public class Ejercicio3 {
    public static void main(String[] args) {
        Random random = new Random();
        double acum1=0,acum2=0,acum3=0,acum4=0,acum5=0,acum6=0;
        
        for(int i = 0; i < 20000; i++){
            int dado = random.nextInt(6) + 1;
            switch (dado) {
                case 1:
                    acum1++;
                    break;
                case 2:
                    acum2++;
                    break;
                case 3:
                    acum3++;
                    break;
                case 4:
                    acum4++;
                    break;
                case 5:
                    acum5++;
                    break;
                case 6:
                    acum6++;
                    break;
                default:
                    break;
            }
        }
        
        System.out.println("Frecuencia del lado 1: " + (acum1/20000*100) + "%");
        System.out.println("Frecuencia del lado 2: " + (acum2/20000*100) + "%");
        System.out.println("Frecuencia del lado 3: " + (acum3/20000*100) + "%");
        System.out.println("Frecuencia del lado 4: " + (acum4/20000*100) + "%");
        System.out.println("Frecuencia del lado 5: " + (acum5/20000*100) + "%");
        System.out.println("Frecuencia del lado 6: " + (acum6/20000*100) + "%");
    }
}
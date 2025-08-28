package Actividad_5;

import java.util.Scanner;

public class AppBanco {
	public static void main(String[] args) {
		Cuenta[] cuentas = new Cuenta[5];
		cuentas[0] = new CuentaAhorro(0, 1000, 0.02);
		cuentas[1] = new CuentaCorriente(1, 2000);
		cuentas[2] = new CuentaAhorro(2, 1500, 0.03);
		cuentas[3] = new CuentaCorriente(3, 1200);
		cuentas[4] = new CuentaAhorro(4, 800, 0.025);
		Scanner in = new Scanner(System.in);
		boolean done = false;
		while(!done) {
			System.out.println("D)epositar R)etirar C)onsultar S)alir: ");
			String op = in.next();
			if(op.equals("D")|| op.equals("R")) {
				System.out.println("Ingrese un numero de cuenta y un monto: ");
				int num = in.nextInt();
				double monto = in.nextDouble();
				if(op.equals("D")) {
					cuentas[num].depositar(monto);
				} else {
					cuentas[num].retirar(monto);
				}
				System.out.println("Saldo: "+cuentas[num].getSaldo());
			}
			else if (op.equals("C")) {
				for(int n = 0; n < cuentas.length;n++) {
					cuentas[n].consultar();
					System.out.println(n+" "+cuentas[n].getSaldo());
				}
			}
			else if(op.equals("S")) {
				done = true;
			}
		}
		in.close();
	}

}

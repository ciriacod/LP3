package Actividad_5;

public class CuentaAhorro extends Cuenta {
    private double tasaInteres;
    private double minSaldo;

    public CuentaAhorro() {
        super(0, 0);
        this.tasaInteres = 0.0;
        this.minSaldo = 0.0;
    }

    public CuentaAhorro(int numeroCuenta, double saldoInicial, double tasaInteres) {
        super(numeroCuenta, saldoInicial);
        this.tasaInteres = tasaInteres;
        this.minSaldo = saldoInicial;
    }

    public void setTasaInteres(double interes) {
        this.tasaInteres = interes;
    }

    @Override
    public void retirar(double amount) {
        super.retirar(amount);
        double saldo = getSaldo();
        if (saldo < minSaldo) {
            minSaldo = saldo;
        }
    }

    @Override
    public void consultar() {
        double interes = minSaldo * tasaInteres / 100;
        depositar(interes);
        minSaldo = getSaldo();
    }
}


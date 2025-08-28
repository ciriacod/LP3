package Actividad_5;

public class CuentaCorriente extends Cuenta {
    private int retiros;

    public CuentaCorriente() {
        super(0, 0); 
        this.retiros = 0;
    }

    public CuentaCorriente(int numeroCuenta, double saldoInicial) {
        super(numeroCuenta, saldoInicial); 
        this.retiros = 0;
    }

    @Override
    public void retirar(double amount) {
        final int LIBRE_RETIROS = 3;
        final double TARIFA_TRANSACCION = 3.5;

        if (super.retirar(amount)) {
            retiros++;
            if (retiros > LIBRE_RETIROS) {
                super.retirar(TARIFA_TRANSACCION);
            }
        }
    }

    @Override
    public void consultar() {
        retiros = 0;
    }
}
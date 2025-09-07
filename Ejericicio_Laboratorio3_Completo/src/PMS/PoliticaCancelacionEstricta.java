package PMS;

import java.time.LocalDate;

public class PoliticaCancelacionEstricta implements PoliticaCancelacion {
    @Override
    public ResultadoCancelacion puedeCancelar(Reserva reserva, LocalDate ahora) {
        return new ResultadoCancelacion(false, 0.0, "Cancelación no permitida (Estricta).");
    }
}

package PMS;

import java.time.Duration;
import java.time.LocalDate;

public class PoliticaCancelacionFlexible implements PoliticaCancelacion {
    @Override
    public ResultadoCancelacion puedeCancelar(Reserva reserva, LocalDate ahora) {
        long horas = Duration.between(ahora.atStartOfDay(), reserva.getCheckIn().atStartOfDay()).toHours();
        if (horas >= 24) {
            return new ResultadoCancelacion(true, 0.0, "Cancelación sin penalización (Flexible).");
        }
        return new ResultadoCancelacion(false, 0.0, "No se puede cancelar: menos de 24h antes del check-in.");
    }
}

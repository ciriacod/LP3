package PMS;

import java.time.Duration;
import java.time.LocalDate;

public class PoliticaCancelacionModerada implements PoliticaCancelacion {
    @Override
    public ResultadoCancelacion puedeCancelar(Reserva reserva, LocalDate ahora) {
        long horas = Duration.between(ahora.atStartOfDay(), reserva.getCheckIn().atStartOfDay()).toHours();
        if (horas >= 72) {
            return new ResultadoCancelacion(true, 0.0, "Cancelación sin penalización (Moderada).");
        } else if (horas >= 0) {
            return new ResultadoCancelacion(true, 0.5, "Cancelación con penalización del 50% (Moderada).");
        }
        return new ResultadoCancelacion(false, 0.0, "Check-in pasado; no se puede cancelar.");
    }
}

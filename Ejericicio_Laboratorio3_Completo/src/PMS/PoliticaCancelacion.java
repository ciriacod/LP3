package PMS;

import java.time.LocalDate;

public interface PoliticaCancelacion {
    ResultadoCancelacion puedeCancelar(Reserva reserva, LocalDate ahora);
}

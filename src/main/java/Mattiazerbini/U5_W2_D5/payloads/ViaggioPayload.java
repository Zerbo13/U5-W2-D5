package Mattiazerbini.U5_W2_D5.payloads;

import Mattiazerbini.U5_W2_D5.entities.Stato;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

import java.time.LocalDate;

public class ViaggioPayload {

    private String destinazione;
    private LocalDate data;
    @Enumerated(EnumType.STRING)
    private Stato stato;

    public ViaggioPayload(String destinazione, LocalDate data, Stato stato) {
        this.destinazione = destinazione;
        this.data = data;
        this.stato = stato;
    }
}

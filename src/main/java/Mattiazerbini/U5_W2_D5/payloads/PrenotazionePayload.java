package Mattiazerbini.U5_W2_D5.payloads;

import Mattiazerbini.U5_W2_D5.entities.Dipendente;
import Mattiazerbini.U5_W2_D5.entities.Viaggio;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.time.LocalDate;
import java.util.UUID;

public class PrenotazionePayload {
    private LocalDate dataRichiesta;
    private String preferenze;
    private UUID id_dipendente;
    private UUID id_viaggio;

    public PrenotazionePayload(LocalDate dataRichiesta, String preferenze, UUID id_dipendente, UUID id_viaggio) {
        this.dataRichiesta = dataRichiesta;
        this.preferenze = preferenze;
        this.id_dipendente = id_dipendente;
        this.id_viaggio = id_viaggio;
    }
}

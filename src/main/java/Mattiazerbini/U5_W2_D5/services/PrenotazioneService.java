package Mattiazerbini.U5_W2_D5.services;

import Mattiazerbini.U5_W2_D5.entities.Dipendente;
import Mattiazerbini.U5_W2_D5.entities.Prenotazione;
import Mattiazerbini.U5_W2_D5.entities.Viaggio;
import Mattiazerbini.U5_W2_D5.exceptions.NotFoundException;
import Mattiazerbini.U5_W2_D5.payloads.PrenotazionePayload;
import Mattiazerbini.U5_W2_D5.repositories.DipendenteRepository;
import Mattiazerbini.U5_W2_D5.repositories.PrenotazioneRepository;
import Mattiazerbini.U5_W2_D5.repositories.ViaggioRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Slf4j
public class PrenotazioneService {

    private final PrenotazioneRepository prenotazioneRepository;
    private final DipendenteRepository dipendenteRepository;
    private final ViaggioRepository viaggioRepository;

    @Autowired
    public PrenotazioneService(PrenotazioneRepository prenotazioneRepository, DipendenteRepository dipendenteRepository, ViaggioRepository viaggioRepository) {
        this.prenotazioneRepository = prenotazioneRepository;
        this.dipendenteRepository = dipendenteRepository;
        this.viaggioRepository = viaggioRepository;
    }

    public Prenotazione salvaPrenotazione(PrenotazionePayload payload){
        Dipendente newDipendente = dipendenteRepository.findById(payload.getIdDipendente())
        .orElseThrow(()->new RuntimeException("Dipendente con id "+payload.getIdDipendente()+ " non trovato"));

        Viaggio newViaggio = viaggioRepository.findById(payload.getIdViaggio())
                .orElseThrow(() -> new RuntimeException("Viaggio con id "+payload.getIdViaggio()+ " non trovato"));

        Prenotazione prenotazione = new Prenotazione(payload.getDataRichiesta(), payload.getPreferenze(),
                newDipendente, newViaggio);
        Prenotazione prenotazioneSalvata = this.prenotazioneRepository.save(prenotazione);
        log.info("Prenotazione con id " +prenotazioneSalvata.getId()+ " salvata con successo!" );
        return prenotazioneSalvata;
    }

    public Prenotazione findById(UUID idPrenotazione){
        return this.prenotazioneRepository.findById(idPrenotazione)
                .orElseThrow(() -> new NotFoundException(idPrenotazione
                ));
    }
}

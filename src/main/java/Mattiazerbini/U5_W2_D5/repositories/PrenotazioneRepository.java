package Mattiazerbini.U5_W2_D5.repositories;

import Mattiazerbini.U5_W2_D5.entities.Prenotazione;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PrenotazioneRepository extends JpaRepository<Prenotazione, UUID> {
}

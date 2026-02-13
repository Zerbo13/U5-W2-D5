package Mattiazerbini.U5_W2_D5.repositories;

import Mattiazerbini.U5_W2_D5.entities.Dipendente;
import Mattiazerbini.U5_W2_D5.entities.Prenotazione;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface DipendenteRepository extends JpaRepository<Dipendente, UUID> {

    boolean existsByEmail(String email);
}

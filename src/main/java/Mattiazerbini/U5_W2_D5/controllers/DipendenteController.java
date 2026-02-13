package Mattiazerbini.U5_W2_D5.controllers;

import Mattiazerbini.U5_W2_D5.entities.Dipendente;
import Mattiazerbini.U5_W2_D5.entities.Prenotazione;
import Mattiazerbini.U5_W2_D5.entities.Viaggio;
import Mattiazerbini.U5_W2_D5.payloads.DipendentePayload;
import Mattiazerbini.U5_W2_D5.payloads.ViaggioPayload;
import Mattiazerbini.U5_W2_D5.services.DipendenteService;
import Mattiazerbini.U5_W2_D5.services.ViaggioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/dipendente")
public class DipendenteController {


    private final DipendenteService dipendenteService;

    @Autowired
    public DipendenteController(DipendenteService dipendenteService){
        this.dipendenteService = dipendenteService;
    }

    //CREAZIONE DI UN NUOVO DIPENDENTE (POST)
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED) // 201
    public Dipendente createDipendente(@RequestBody DipendentePayload payload) {
        return this.dipendenteService.salvaDipendente(payload);
    }

}

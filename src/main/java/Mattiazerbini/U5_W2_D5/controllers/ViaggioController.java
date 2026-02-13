package Mattiazerbini.U5_W2_D5.controllers;

import Mattiazerbini.U5_W2_D5.entities.Prenotazione;
import Mattiazerbini.U5_W2_D5.entities.Viaggio;
import Mattiazerbini.U5_W2_D5.payloads.PrenotazionePayload;
import Mattiazerbini.U5_W2_D5.payloads.ViaggioPayload;
import Mattiazerbini.U5_W2_D5.services.PrenotazioneService;
import Mattiazerbini.U5_W2_D5.services.ViaggioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/viaggio")
public class ViaggioController {


    private final ViaggioService viaggioService;

    @Autowired
    public ViaggioController(ViaggioService viaggioService){
        this.viaggioService = viaggioService;
    }

    //CREAZIONE DI UN NUOVO AUTORE (POST)
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED) // 201
    public Viaggio createViaggio(@RequestBody ViaggioPayload payload) {
        return this.viaggioService.salvaViaggio(payload);
    }
}

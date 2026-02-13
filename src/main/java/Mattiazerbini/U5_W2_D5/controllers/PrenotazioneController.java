package Mattiazerbini.U5_W2_D5.controllers;

import Mattiazerbini.U5_W2_D5.entities.Prenotazione;
import Mattiazerbini.U5_W2_D5.payloads.PrenotazionePayload;
import Mattiazerbini.U5_W2_D5.services.PrenotazioneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;


@RestController
    @RequestMapping("/prenotazione")
    public class PrenotazioneController {

        private final PrenotazioneService prenotazioneService;

        @Autowired
        public PrenotazioneController(PrenotazioneService prenotazioneService){
            this.prenotazioneService = prenotazioneService;
        }

        //CREAZIONE DI UNA NUOVA PRENOTAZIONE (POST)
        @PostMapping
        @ResponseStatus(HttpStatus.CREATED) // 201
        public Prenotazione createPrenotazione(@RequestBody PrenotazionePayload payload) {
            return this.prenotazioneService.salvaPrenotazione(payload);
        }
        
    }


package Mattiazerbini.U5_W2_D5.controllers;

import Mattiazerbini.U5_W2_D5.entities.Prenotazione;
import Mattiazerbini.U5_W2_D5.payloads.PrenotazionePayload;
import Mattiazerbini.U5_W2_D5.services.PrenotazioneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


    @RestController
    @RequestMapping("/prenotazione")
    public class PrenotazioneController {

        private final PrenotazioneService prenotazioneService;

        @Autowired
        public PrenotazioneController(PrenotazioneService prenotazioneService){
            this.prenotazioneService = prenotazioneService;
        }

//        //LISTA DI AUTORI (GET)
//        @GetMapping
//        public Page<Prenotazione> findAll(@RequestParam(defaultValue = "0") int page,
//                                          @RequestParam(defaultValue = "10") int size,
//                                          @RequestParam(defaultValue = "surname") String orderBy,
//                                          @RequestParam(defaultValue = "asc") String sortCriteria) {
//
//            return this.prenotazioneService.findAll(page, size, orderBy, sortCriteria);
//        }
//
//
//        //RITORNA UN SINGOLO AUTORE (GET)
//        @GetMapping("/{idAutore}")
//        public Autore getAutoreById(@PathVariable long idAutore) {
//            return this.autoreService.findById(idAutore);
//        }

        //CREAZIONE DI UN NUOVO AUTORE (POST)
        @PostMapping
        @ResponseStatus(HttpStatus.CREATED) // 201
        public Prenotazione createPrenotazione(@RequestBody PrenotazionePayload payload) {
            return this.prenotazioneService.salvaPrenotazione(payload);
        }


//        //MODIFICA LO SPECIFICO AUTORE (PUT)
//        @PutMapping("/{idAutore}")
//        public Autore getAutoreByIdAndUpdate(@PathVariable long idAutore, @RequestBody AutorePayload payload) {
//            return this.autoreService.findByIdAndUpdate(idAutore, payload);
//        }
//
//        //ELIMINA LO SPECIFICO AUTORE (DELETE)
//        @DeleteMapping("/{idAutore}")
//        @ResponseStatus(HttpStatus.NO_CONTENT) // 204
//        public void getAutoreByIdAndDelete(@PathVariable long idAutore) {
//            this.autoreService.findByIdAndDelete(idAutore);
//        }
    }


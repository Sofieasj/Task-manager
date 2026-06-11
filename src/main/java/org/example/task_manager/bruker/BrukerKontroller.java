package org.example.task_manager.bruker;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class BrukerKontroller {

    @PostMapping("/registrer")
    public Bruker registrer(@RequestBody Bruker bruker){
        // sjekk at epost ikke alt er i bruk -> logg inn
        // opprett ny bruker: epost, navn og passord lagres
        return BrukerRepo.registrer(bruker);
    }

    @GetMapping("/login")
    public Bruker login(){
        // sjekk at epost eksisterer som bruker
        // sjekk at epost og passord matcher
    }

}

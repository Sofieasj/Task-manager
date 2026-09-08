package org.example.task_manager.user;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class UserController {

//    @PostMapping("/register")
//    public User register(@RequestBody User user) {
//        // sjekk om det finnes en brukere med denne eposten - i så fall -> logg inn
//        if () {
//            // logg inn
//        } else {
//            // opprett ny bruker: epost, navn og passord lagres
//            return UserRepo.register(user);
//        }
//    }
//
//    @GetMapping("/login")
//    public User login(String email, String password) {
//        // sjekk at input faktisk er gitt - skal ha input validation i frontend (kontroller format mm)
//        if (email != null && password != null) {
//            // sjekk om eposten finnes i databasen
//            if (email.equals()) {
//            }
//            // sjekk om passordet matcher den registrert på eposten
//            if () {
//            }
//        }
//    }
//
//    @GetMapping("/logout")
//    public User logout() {}
}

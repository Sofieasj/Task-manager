package org.example.task_manager.bruker;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.logging.Logger;

@Repository
public class BrukerRepo {

    // logger
    Logger logger = Logger.getLogger(BrukerRepo.class.getName());


    // opprett en ny bruker
    public static Bruker registrer(Bruker bruker){}

    // logg inn
    public static void login(String epost, String passord){}
}
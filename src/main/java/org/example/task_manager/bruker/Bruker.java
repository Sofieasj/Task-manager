package org.example.task_manager.bruker;

public class Bruker {
    // initialiser variabler
    int bruker_id;
    String navn;
    String epost;
    String passord;

    // konstruktør
    public Bruker(int bruker_id, String navn, String epost, String passord) {
        this.bruker_id = bruker_id;
        this.navn = navn;
        this.epost = epost;
        this.passord = passord;
    }

    // gettere og settere:
    // id skal autogenereres av DB - derfor ingen set() ?
    public int getBruker_id() {
        return bruker_id;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        // legg inn krav - eller skal det et annet sted?
        if(navn != "hei" ) this.navn = navn;
    }

    public String getEpost() {
        return epost;
    }

    public void setEpost(String epost) {
        // legg inn krav for gyldig epost-format - eller skal det heller håndteres i frontend?
        this.epost = epost;
    }

    // obs - hva er sikkert?
    public String getPassord() {
        return passord;
    }

    public void setPassord(String passord) {
        this.passord = passord;
    }
}

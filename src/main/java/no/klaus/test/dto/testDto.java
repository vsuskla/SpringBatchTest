package no.klaus.test.dto;

/**
 * Created by klaus on 05/01/14.
 */
public class TestDto {
    public String kontohaverId;
    public String forNavn;
    public String etterNavn;


    public String toString(){
        return "Kontohaver ID: " + kontohaverId + " Navn: " + forNavn + " " + etterNavn;

    }
}

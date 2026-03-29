package ro.acs.cts.Restaurant.resto02;

public interface AbstractRezervare {
    Rezervare build(String nume_client);
    AbstractRezervare setAsezareGeam( boolean asezareGeam);
    AbstractRezervare setScauneErgonomice(boolean scauneErgonomice);
    AbstractRezervare setDecorareMasa(boolean decorareMasa);
    AbstractRezervare setMuzicaAmbientala(  boolean muzicaAmbientala);



}

package ro.acs.cts.Restaurant.resto02;

public class BuilderRezervare02 implements AbstractRezervare {
    private boolean asezare_geam;
    private boolean scaune_ergonomice;
    private boolean decorare_masa;
    private boolean muzica_ambientala;

    public BuilderRezervare02() {
        this.asezare_geam = false;
        this.scaune_ergonomice = false;
        this.decorare_masa = false;
        this.muzica_ambientala = false;
    }

    @Override
    public Rezervare build(String nume_client) {
        return new Rezervare(nume_client, asezare_geam, scaune_ergonomice,decorare_masa,muzica_ambientala);
    }

    @Override
    public AbstractRezervare setAsezareGeam(boolean asezareGeam) {
        this.asezare_geam = asezareGeam;
        return this;
    }

    @Override
    public AbstractRezervare setScauneErgonomice(boolean scauneErgonomice) {
        this.scaune_ergonomice = scauneErgonomice;
        return this;
    }

    @Override
    public AbstractRezervare setDecorareMasa(boolean decorareMasa) {
        this.decorare_masa = decorareMasa;
        return this;
    }

    @Override
    public AbstractRezervare setMuzicaAmbientala(boolean muzicaAmbientala) {
        this.muzica_ambientala = muzicaAmbientala;
        return this;
    }
}

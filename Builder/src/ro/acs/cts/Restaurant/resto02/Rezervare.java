package ro.acs.cts.Restaurant.resto02;

public class Rezervare {
    private String nume_client;
    private boolean asezare_geam;
    private boolean scaune_ergonomice;
    private boolean decorare_masa;
    private boolean muzica_ambientala;

    public Rezervare(String nume_client, boolean asezare_geam, boolean scaune_ergonomice, boolean decorare_masa, boolean muzica_ambientala) {
        this.nume_client = nume_client;
        this.asezare_geam = asezare_geam;
        this.scaune_ergonomice = scaune_ergonomice;
        this.decorare_masa = decorare_masa;
        this.muzica_ambientala = muzica_ambientala;
    }

    public void setNume_client(String nume_client) {
        this.nume_client = nume_client;
    }

    public void setAsezare_geam(boolean asezare_geam) {
        this.asezare_geam = asezare_geam;
    }

    public void setScaune_ergonomice(boolean scaune_ergonomice) {
        this.scaune_ergonomice = scaune_ergonomice;
    }

    public void setDecorare_masa(boolean decorare_masa) {
        this.decorare_masa = decorare_masa;
    }

    public void setMuzica_ambientala(boolean muzica_ambientala) {
        this.muzica_ambientala = muzica_ambientala;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("nume_client='").append(nume_client).append('\'');
        sb.append(", asezare_geam=").append(asezare_geam);
        sb.append(", scaune_ergonomice=").append(scaune_ergonomice);
        sb.append(", decorare_masa=").append(decorare_masa);
        sb.append(", muzica_ambientala=").append(muzica_ambientala);
        sb.append('}');
        return sb.toString();
    }
}
